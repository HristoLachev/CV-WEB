package com.cv.converter;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

import com.cv.model.xml.ObjectFactory;
import com.cv.model.xml.SkillsPassport;

@Component
public class JAXBConverter {

	private JAXBContext jc;
	private Unmarshaller unmarshaller;
	private Marshaller marshaller;

	@PostConstruct
	private void init() throws JAXBException {
		jc = JAXBContext.newInstance(ObjectFactory.class);
		unmarshaller = jc.createUnmarshaller();
		marshaller = jc.createMarshaller();
	}

	public SkillsPassport unmarshallEuroPassXML(InputStream inputStream) throws JAXBException {
		Scanner s = new Scanner(inputStream).useDelimiter("\\A");
		String result = s.hasNext() ? s.next() : "";
		String replaced = result.replace("<br>", " ").replace("<br />", " ");

		InputStream escapedHTML = new ByteArrayInputStream(replaced.getBytes(StandardCharsets.UTF_8));

		return (SkillsPassport) unmarshaller.unmarshal(escapedHTML);
	}

	public void marshallEuroPassXML(Object element, OutputStream os) throws JAXBException {
		marshaller.marshal(element, os);
	}

	public void marshallEuroPassXML(Object element, File os) throws JAXBException {
		marshaller.marshal(element, os);
	}

}
