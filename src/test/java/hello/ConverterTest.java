package hello;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import converter.XMLConverter;
import eu.europa.cedefop.europass.jtool.util.SoftToolUtil;
import model.EuroPassXML;

@RunWith(SpringJUnit4ClassRunner.class)
public class ConverterTest {

	@Test
	public void testConverter() throws ParserConfigurationException, SAXException, IOException {
		XMLConverter converter = new XMLConverter();
		File x = new File("C:/Users/hlachev/Desktop/cv1.xml");
		Path xmlPath = x.toPath();
		String content = Files.toString(x, Charsets.UTF_8);

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();

		Document doc = builder.parse(x);

		EuroPassXML xml = converter.docToEuroPassConverter(doc);
		System.out.println(xml);

	}

}
