package com.cv.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.google.common.base.Charsets;

@Controller
public class FileDownloadController {

	@PostMapping("/download")
	public void downloadXML(@RequestBody String event,HttpServletResponse response) {

		// @RequestBody
		// String event = "wat";
		File xml = new File("src/main/resources/cv.xml");
//		File f=new File("C:/Work/Eclipse workspace/CV-WEB/src/main/resources/cv.xml");

		try {
			com.google.common.io.Files.write(event, xml, Charsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	}
}