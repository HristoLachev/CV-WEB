package hello;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xml.sax.SAXException;

import converter.JAXBConverter;
import model.xml.SkillsPassport;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ConverterTest-context.xml")
public class ConverterTest {

	@Autowired
	private JAXBConverter converter;

	@Test
	public void testConverter() throws ParserConfigurationException, SAXException, IOException, JAXBException {
		File x = new File("src/test/resources/cv1.xml");
		SkillsPassport passport = converter.unmarshallEuroPassXML(new FileInputStream(x));
		String firstName = passport.getLearnerInfo().getIdentification().getPersonName().getFirstName();
		assertEquals("Betty", firstName);
		System.out.println(passport);

	}

}
