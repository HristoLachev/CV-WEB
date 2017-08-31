package com.cv.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cv.converter.JAXBConverter;
import com.cv.model.xml.SkillsPassport;
import com.cv.serializers.XMLGregorianCalendarConverter;
import com.google.gson.Gson;

@Controller
public class SkillsPassportController {

	@Autowired
	private JAXBConverter converter;

	@PostMapping(value = "/passport", produces = "application/json")
	@ResponseBody
	public String getPassport(@RequestBody String event) throws IOException {
		Gson gson = XMLGregorianCalendarConverter.getGson();
		SkillsPassport skillsPassport = gson.fromJson(event, SkillsPassport.class);
		String passportInJSON = gson.toJson(skillsPassport);
		return passportInJSON;

	}

}
