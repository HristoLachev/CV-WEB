package hello;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import model.xml.IdentificationType;
import model.xml.LearnerInfoType;
import model.xml.PersonNameType;
import model.xml.SkillsPassport;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ConverterTest-context.xml")
public class ConverterTest {

	@Autowired
	private JAXBConverter converter;

	@Test
	public void fromXMLtoSkillsPassport()
			throws ParserConfigurationException, SAXException, IOException, JAXBException {
		File x = new File("src/test/resources/cv1.xml");
		SkillsPassport passport = converter.unmarshallEuroPassXML(new FileInputStream(x));
		String firstName = passport.getLearnerInfo().getIdentification().getPersonName().getFirstName();
		assertEquals("Betty", firstName);
		System.out.println(passport);

	}

	@Test
	public void fromSkillsPassportToXML() throws JAXBException, InterruptedException, FileNotFoundException {
		String FIRST_NAME = "Hristo";

		SkillsPassport passport = new SkillsPassport();
		LearnerInfoType learner = new LearnerInfoType();
		IdentificationType ident = new IdentificationType();
		PersonNameType name = new PersonNameType();
		passport.setLearnerInfo(learner);
		learner.setIdentification(ident);
		ident.setPersonName(name);
		name.setFirstName(FIRST_NAME);

		File outputFile = new File("src/test/resources/ConverterTestOutput");
		converter.marshallEuroPassXML(passport, System.out);
		converter.marshallEuroPassXML(passport, outputFile);

		Thread.sleep(3000);

		SkillsPassport parsedPassport = converter.unmarshallEuroPassXML(new FileInputStream(outputFile));

		String firstName = parsedPassport.getLearnerInfo().getIdentification().getPersonName().getFirstName();
		assertEquals(FIRST_NAME, firstName);

	}

}
