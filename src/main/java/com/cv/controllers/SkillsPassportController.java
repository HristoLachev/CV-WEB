package com.cv.controllers;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.cv.converter.JAXBConverter;
import com.cv.model.xml.SkillsPassport;
import com.google.gson.Gson;

@Controller
public class SkillsPassportController {

	@Autowired
	private JAXBConverter converter;

	@PostMapping(value = "/passport", produces = "application/json")
	@ResponseBody
	public String getPassport(@RequestParam("file") MultipartFile file, Model model) throws IOException {
		SkillsPassport pasport = null;
		try {
			pasport = converter.unmarshallEuroPassXML(file.getInputStream());
		} catch (JAXBException e) {
			pasport = new SkillsPassport();
			e.printStackTrace();
		}
		Gson gson = new Gson();
		String passportInJSON = gson.toJson(pasport);
		return passportInJSON;

	}
}
