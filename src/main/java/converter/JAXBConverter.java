package converter;

import java.io.InputStream;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

import model.xml.ObjectFactory;
import model.xml.SkillsPassport;

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
		return (SkillsPassport)unmarshaller.unmarshal(inputStream);
	}

}
