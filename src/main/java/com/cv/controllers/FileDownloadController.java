package com.cv.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cv.converter.JAXBConverter;
import com.cv.model.xml.SkillsPassport;
import com.cv.serializers.XMLGregorianCalendarConverter;
import com.google.common.base.Charsets;
import com.google.gson.Gson;

@Controller
public class FileDownloadController {

	@Autowired
	private JAXBConverter converter;

	@PostMapping("/download")
	@ResponseBody
	public String downloadXML(@RequestBody String event, HttpServletResponse response) {

		// @RequestBody
		// String event = "wat";
		File xml = new File("src/main/resources/cv.xml");
		// File f=new File("C:/Work/Eclipse
		// workspace/CV-WEB/src/main/resources/cv.xml");
		Gson gson = XMLGregorianCalendarConverter.getGson();
		SkillsPassport skillsPassport = gson.fromJson(event, SkillsPassport.class);
		try {
			converter.marshallEuroPassXML(skillsPassport, xml);
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Path file = xml.toPath();
		if (Files.exists(file)) {
			response.setContentType("application/xml");
			response.addHeader("Content-Disposition", "attachment; filename=xml.xml");
			try {
				Files.copy(file, response.getOutputStream());
				response.getOutputStream().flush();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return "src/main/resources/cv.xml";

	}
}