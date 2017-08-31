package com.cv.controllers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cv.converter.JAXBConverter;
import com.cv.model.xml.SkillsPassport;
import com.cv.serializers.XMLGregorianCalendarConverter;

@Controller
public class UploadController {

	@Autowired
	private JAXBConverter converter;

	@GetMapping("/upload")
	public String listUploadedFiles(Model model) throws IOException {
		return "uploadForm";
	}

	@PostMapping("/upload")
	public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
		if (!file.getContentType().contains("xml")) {
			redirectAttributes.addFlashAttribute("message",
					"File: " + file.getOriginalFilename() + " must be a xml file!");

			return "redirect:/upload";
		}

		SkillsPassport passport = null;
		try {
			passport = converter.unmarshallEuroPassXML(file.getInputStream());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String passportInJSON = XMLGregorianCalendarConverter.getGson().toJson(passport);
		redirectAttributes.addFlashAttribute("file", passportInJSON);
		return "redirect:/";
	}
}
