package converter;

import java.util.Iterator;

import javax.xml.namespace.NamespaceContext;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.DrivingLicense;
import model.Education;
import model.EuroPassXML;
import model.Language;
import model.Nationality;
import model.WorkExperience;

@Component
public class XMLConverter {
	private static XPathFactory xPathfactory = XPathFactory.newInstance();
	private static XPath xpath = xPathfactory.newXPath();
	

	
	private static Node selectSingleNode(Node doc, String argument) {	
		XPathExpression expr = null;
		xpath.setNamespaceContext(new NamespaceContext() {

			@Override
			public Iterator getPrefixes(String namespaceURI) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getPrefix(String namespaceURI) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getNamespaceURI(String prefix) {
				return "http://europass.cedefop.europa.eu/Europass";
			}
		});

		NodeList nl = null;
		try {
			expr = xpath.compile(argument);
			nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (nl == null) {
			return null;
		}
		Node test = nl.item(0);
		return test;

	}

	private static NodeList selectNodeList(Node doc, String argument) {
		XPathExpression expr = null;
		xpath.setNamespaceContext(new NamespaceContext() {

			@Override
			public Iterator getPrefixes(String namespaceURI) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getPrefix(String namespaceURI) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getNamespaceURI(String prefix) {
				return "http://europass.cedefop.europa.eu/Europass";
			}
		});

		NodeList nl = null;
		try {
			expr = xpath.compile(argument);
			nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nl;
	}

	public static EuroPassXML docToEuroPassConverter(Document doc) {
		EuroPassXML xml = null;
		doc.getDocumentElement().normalize();

		String fname = null;
		String lname = null;
		String telephone = null;
		String fax = null;
		String mobile = null;
		String email = null;
		String addressLine = null;
		String municipality = null;
		String postalCode = null;
		String countryCode = null;
		String country = null;
		String gender = null;
		String birthDate = null;
		String codeAppl = null;
		String appl = null;
		String social = null;
		String organisational = null;
		String technical = null;
		String computer = null;
		String artistic = null;
		String other = null;
		String additional = null;
		String annexes = null;
		String photo = null;
		String photoType = null;
		String langCode = null;
		String lang = null;
		byte[] photoArray;
		String expression = "/prefix:SkillsPassport/prefix:LearnerInfo/prefix:Identification/prefix:PersonName/prefix:FirstName";

		// try {
		//
		// Node firstchild = test.getFirstChild();
		// String value = firstchild.getNodeValue();
		//
		// Object x = xpath.evaluate(expression, doc,
		// XPathConstants.STRING);
		// System.out.println(x);
		// } catch (XPathExpressionException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }

		Node n = selectSingleNode(doc, expression);
		if (n != null && n.getFirstChild() != null)
			fname = n.getFirstChild().getNodeValue();

		n = selectSingleNode(doc, expression);
		if (n != null && n.getFirstChild() != null)
			lname = n.getFirstChild().getNodeValue();
		n = selectSingleNode(doc, "//identification/contactinfo/telephone");
		if (n != null && n.getFirstChild() != null)
			telephone = n.getFirstChild().getNodeValue();
		n = selectSingleNode(doc, "//identification/contactinfo/fax");
		if (n != null && n.getFirstChild() != null)
			fax = n.getFirstChild().getNodeValue();
		n = selectSingleNode(doc, "//identification/contactinfo/mobile");
		if (n != null && n.getFirstChild() != null)
			mobile = n.getFirstChild().getNodeValue();
		n = selectSingleNode(doc, "//identification/contactinfo/email");
		if (n != null && n.getFirstChild() != null)
			email = n.getFirstChild().getNodeValue();

		n = selectSingleNode(doc, "//identification/contactinfo/address/addressLine");
		if (n != null && n.getFirstChild() != null)
			addressLine = n.getFirstChild().getNodeValue();
		n = selectSingleNode(doc, "//identification/contactinfo/address/municipality");
		if (n != null && n.getFirstChild() != null)
			municipality = n.getFirstChild().getNodeValue();
		n = selectSingleNode(doc, "//identification/contactinfo/address/postalCode");
		if (n != null && n.getFirstChild() != null)
			postalCode = n.getFirstChild().getNodeValue();
		n = selectSingleNode(doc, "//identification/contactinfo/address/country/code");
		if (n != null && n.getFirstChild() != null)
			countryCode = n.getFirstChild().getNodeValue();
		n = selectSingleNode(doc, "//identification/contactinfo/address/country/label");
		if (n != null && n.getFirstChild() != null)
			country = n.getFirstChild().getNodeValue();

		n = selectSingleNode(doc, "//identification/demographics/gender");
		if (n != null && n.getFirstChild() != null)
			gender = n.getFirstChild().getNodeValue();
		n = selectSingleNode(doc, "//identification/demographics/birthdate");
		if (n != null && n.getFirstChild() != null)
			birthDate = n.getFirstChild().getNodeValue();

		n = selectSingleNode(doc, "//application/code");
		if (n != null && n.getFirstChild() != null)
			codeAppl = n.getFirstChild().getNodeValue();
		n = selectSingleNode(doc, "//application/label");
		if (n != null && n.getFirstChild() != null)
			appl = n.getFirstChild().getNodeValue();

		NodeList mLangLst = selectNodeList(doc, "//language[@type='europass:mother']");
		if (mLangLst.getLength() > 0) {
			for (int j = 0; j < mLangLst.getLength(); j++) {
				Node mLang = mLangLst.item(j);
				if (mLang.getNodeType() == Node.ELEMENT_NODE) {
					Node tmp1 = selectSingleNode(mLang, "code");
					if (tmp1 != null && tmp1.getFirstChild() != null)
						langCode = tmp1.getFirstChild().getNodeValue();

					Node tmp2 = selectSingleNode(mLang, "label");
					if (tmp2 != null && tmp2.getFirstChild() != null)
						lang = tmp2.getFirstChild().getNodeValue();

				}
			}
		}

		Node skillS = selectSingleNode(doc, "//skill[@type='social']");
		if (skillS != null && skillS.getFirstChild() != null)
			social = skillS.getFirstChild().getNodeValue();
		Node skillO = selectSingleNode(doc, "//skill[@type='organisational']");
		if (skillO != null && skillO.getFirstChild() != null)
			organisational = skillO.getFirstChild().getNodeValue();
		Node skillT = selectSingleNode(doc, "//skill[@type='technical']");
		if (skillT != null && skillT.getFirstChild() != null)
			technical = skillT.getFirstChild().getNodeValue();
		Node skillC = selectSingleNode(doc, "//skill[@type='computer']");
		if (skillC != null && skillC.getFirstChild() != null)
			computer = skillC.getFirstChild().getNodeValue();
		Node skillA = selectSingleNode(doc, "//skill[@type='artistic']");
		if (skillA != null && skillA.getFirstChild() != null)
			artistic = skillA.getFirstChild().getNodeValue();
		Node skillOt = selectSingleNode(doc, "//skill[@type='other']");
		if (skillOt != null && skillOt.getFirstChild() != null)
			other = skillOt.getFirstChild().getNodeValue();

		Node misc = selectSingleNode(doc, "//misc[@type='additional']");
		if (misc != null && misc.getFirstChild() != null)
			additional = misc.getFirstChild().getNodeValue();
		misc = selectSingleNode(doc, "//misc[@type='annexes']");
		if (misc != null && misc.getFirstChild() != null)
			annexes = misc.getFirstChild().getNodeValue();

		Node photoN = selectSingleNode(doc, "//identification/photo");
		if (photoN != null && photoN.getFirstChild() != null) {
			photo = photoN.getFirstChild().getNodeValue();
			photoType = photoN.getAttributes().item(0).getFirstChild().getNodeValue();
			if (photo != null) {
				photoArray = photo.getBytes();
			} else {
				photoArray = null;
			}
		} else {
			photoArray = null;
		}
		//
		xml = new EuroPassXML();
		xml.setAdditional(additional);
		xml.setFname(fname);
		xml.setLname(lname);
		xml.setPhone(telephone);
		xml.setFax(fax);
		xml.setMobile(mobile);
		xml.setEmail(email);
		xml.setAddress(addressLine);
		xml.setMunic(municipality);
		xml.setPostalCode(postalCode);
		xml.setCountryCode(countryCode);
		xml.setCountry(country);
		xml.setGender(gender);
		xml.setBirthDate(birthDate);
		xml.setApplCode(codeAppl);
		xml.setAppl(appl);
		xml.setSocial(social);
		xml.setOrg(organisational);
		xml.setTech(technical);
		xml.setComputer(computer);
		xml.setArtistic(artistic);
		xml.setOther(other);
		xml.setAnnexes(annexes);
		if (photoArray != null) {
			xml.setPhoto(photoArray);
		} else {
			xml.setPhoto(new byte[0]);
		}
		xml.setMotherLangCode(langCode);
		xml.setMotherLang(lang);
		xml.setPhotoType(photoType);

		NodeList drLst = selectNodeList(doc, "//drivinglicence");
		if (drLst.getLength() > 0) {
			for (int s = 0; s < drLst.getLength(); s++) {
				Node dr = drLst.item(s);
				String fst = (dr != null && dr.getFirstChild() != null) ? dr.getFirstChild().getNodeValue() : null;
				DrivingLicense dl = new DrivingLicense();
				dl.setXml(xml);
				dl.setDrivingSkill(fst);
			}
		}

		// nationality
		NodeList natLst = selectNodeList(doc, "//identification/demographics/nationality");
		if (natLst.getLength() > 0) {
			for (int s = 0; s < natLst.getLength(); s++) {
				Node nat = natLst.item(s);
				if (nat.getNodeType() == Node.ELEMENT_NODE) {
					Node fstChild = selectSingleNode(nat, "code");
					String fst = (fstChild != null && fstChild.getFirstChild() != null)
							? fstChild.getFirstChild().getNodeValue() : null;
					Node lstChild = selectSingleNode(nat, "label");
					String lst = (lstChild != null && lstChild.getFirstChild() != null)
							? lstChild.getFirstChild().getNodeValue() : null;

					Nationality nt = new Nationality();
					nt.setXml(xml);
					nt.setCode(fst);
					nt.setNationality(lst);

				}
			}
		}

		// workexperience
		NodeList wList = selectNodeList(doc, "//workexperience");
		if (wList.getLength() > 0) {
			for (int s = 0; s < wList.getLength(); s++) {
				String activities = null;
				String name = null;
				String address = null;
				String mun = null;
				String zipCode = null;

				String fromDay = null;
				String fromMonth = null;
				String fromYear = null;

				String toDay = null;
				String toMonth = null;
				String toYear = null;

				String posCode = null;
				String pos = null;

				String countryCd = null;
				String countryName = null;

				String sectorCode = null;
				String sector = null;

				Node w = wList.item(s);
				if (w.getNodeType() == Node.ELEMENT_NODE) {

					Node tmp = selectSingleNode(w, "position/code");
					if (tmp != null && tmp.getFirstChild() != null)
						posCode = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(w, "position/label");
					if (tmp != null && tmp.getFirstChild() != null)
						pos = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(w, "activities");
					if (tmp != null && tmp.getFirstChild() != null)
						activities = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(w, "employer/name");
					if (tmp != null && tmp.getFirstChild() != null)
						name = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(w, "employer/address/addressLine");
					if (tmp != null && tmp.getFirstChild() != null)
						address = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(w, "employer/address/municipality");
					if (tmp != null && tmp.getFirstChild() != null)
						mun = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(w, "employer/address/postalCode");
					if (tmp != null && tmp.getFirstChild() != null)
						zipCode = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(w, "employer/address/country/code");
					if (tmp != null && tmp.getFirstChild() != null)
						countryCd = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(w, "employer/address/country/label");
					if (tmp != null && tmp.getFirstChild() != null)
						countryName = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(w, "employer/sector/code");
					if (tmp != null && tmp.getFirstChild() != null)
						sectorCode = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(w, "employer/sector/label");
					if (tmp != null && tmp.getFirstChild() != null)
						sector = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(w, "period/from/year");
					if (tmp != null && tmp.getFirstChild() != null)
						fromYear = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(w, "period/from/month");
					if (tmp != null && tmp.getFirstChild() != null) {
						fromMonth = tmp.getFirstChild().getNodeValue();
						fromMonth = fromMonth.replaceAll("-", "");
					}
					tmp = selectSingleNode(w, "period/from/day");
					if (tmp != null && tmp.getFirstChild() != null) {
						fromDay = tmp.getFirstChild().getNodeValue();
						fromDay = fromDay.replaceAll("-", "");
					}
					tmp = selectSingleNode(w, "period/to/year");
					if (tmp != null && tmp.getFirstChild() != null)
						toYear = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(w, "period/to/month");
					if (tmp != null && tmp.getFirstChild() != null) {
						toMonth = tmp.getFirstChild().getNodeValue();
						toMonth = toMonth.replaceAll("-", "");
					}
					tmp = selectSingleNode(w, "period/to/day");
					if (tmp != null && tmp.getFirstChild() != null) {
						toDay = tmp.getFirstChild().getNodeValue();
						toDay = toDay.replaceAll("-", "");
					}

					WorkExperience we = new WorkExperience();
					we.setXml(xml);
					we.setActivities(activities);
					we.setEmplName(name);
					we.setCodePos(posCode);
					we.setCodeSector(sectorCode);
					we.setCountry(countryName);
					we.setCountryCode(countryCd);
					we.setDayFrom(fromDay);
					we.setDayTo(toDay);
					we.setEmplAddress(address);
					we.setEmplMunic(mun);
					we.setEmplZcode(zipCode);
					we.setMonthFrom(fromMonth);
					we.setMonthTo(toMonth);
					we.setPos(pos);
					we.setSector(sector);
					we.setYearFrom(fromYear);
					we.setYearTo(toYear);

				}
			}
		}

		// education
		NodeList eduLst = selectNodeList(doc, "//education");
		if (eduLst.getLength() > 0) {
			for (int s = 0; s < eduLst.getLength(); s++) {
				String skills = null;
				String name = null;
				String address = null;
				String mun = null;
				String zipCode = null;
				String title = null;

				String fromDay = null;
				String fromMonth = null;
				String fromYear = null;

				String toDay = null;
				String toMonth = null;
				String toYear = null;

				String levCode = null;
				String lev = null;

				String countryCd = null;
				String countryName = null;

				String eduCode = null;
				String edu = null;

				Node e = eduLst.item(s);
				if (e.getNodeType() == Node.ELEMENT_NODE) {
					Node tmp = selectSingleNode(e, "title");
					if (tmp != null && tmp.getFirstChild() != null)
						title = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(e, "skills");
					if (tmp != null && tmp.getFirstChild() != null)
						skills = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(e, "organisation/name");
					if (tmp != null && tmp.getFirstChild() != null)
						name = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(e, "organisation/address/addressLine");
					if (tmp != null && tmp.getFirstChild() != null)
						address = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(e, "organisation/address/municipality");
					if (tmp != null && tmp.getFirstChild() != null)
						mun = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(e, "organisation/address/postalCode");
					if (tmp != null && tmp.getFirstChild() != null)
						zipCode = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(e, "organisation/address/country/code");
					if (tmp != null && tmp.getFirstChild() != null)
						countryCd = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(e, "organisation/address/country/label");
					if (tmp != null && tmp.getFirstChild() != null)
						countryName = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(e, "organisation/type");
					if (tmp != null && tmp.getFirstChild() != null) {
					}
					tmp = selectSingleNode(e, "period/from/year");
					if (tmp != null && tmp.getFirstChild() != null)
						fromYear = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(e, "period/from/month");
					if (tmp != null && tmp.getFirstChild() != null) {
						fromMonth = tmp.getFirstChild().getNodeValue();
						fromMonth = fromMonth.replaceAll("-", "");
					}
					tmp = selectSingleNode(e, "period/from/day");
					if (tmp != null && tmp.getFirstChild() != null) {
						fromDay = tmp.getFirstChild().getNodeValue();
						fromDay = fromDay.replaceAll("-", "");
					}
					tmp = selectSingleNode(e, "period/to/year");
					if (tmp != null && tmp.getFirstChild() != null)
						toYear = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(e, "period/to/month");
					if (tmp != null && tmp.getFirstChild() != null) {
						toMonth = tmp.getFirstChild().getNodeValue();
						toMonth = toMonth.replaceAll("-", "");
					}
					tmp = selectSingleNode(e, "period/to/day");
					if (tmp != null && tmp.getFirstChild() != null) {
						toDay = tmp.getFirstChild().getNodeValue();
						toDay = toDay.replaceAll("-", "");
					}
					tmp = selectSingleNode(e, "level/code");
					if (tmp != null && tmp.getFirstChild() != null)
						levCode = tmp.getFirstChild().getNodeValue();

					tmp = selectSingleNode(e, "level/label");
					if (tmp != null && tmp.getFirstChild() != null)
						lev = tmp.getFirstChild().getNodeValue();

					//
					Education ed = new Education();
					ed.setXml(xml);
					ed.setTitle(title);
					ed.setSubject(skills);
					ed.setOrgName(name);
					ed.setCodeLevel(levCode);
					ed.setEduField(edu);
					ed.setCountry(countryName);
					ed.setCountryCode(countryCd);
					ed.setDayFrom(fromDay);
					ed.setDayTo(toDay);
					ed.setOrgAddress(address);
					ed.setOrgMunic(mun);
					ed.setOrgZcode(zipCode);
					ed.setMonthFrom(fromMonth);
					ed.setMonthTo(toMonth);
					ed.setLevel(lev);
					ed.setCodeEduField(eduCode);
					ed.setYearFrom(fromYear);
					ed.setYearTo(toYear);
				}
			}
		}

		// language
		NodeList fLangLst = selectNodeList(doc, "//language[@type='europass:foreign']");
		if (fLangLst.getLength() > 0) {
			for (int s = 0; s < fLangLst.getLength(); s++) {
				String lngCode = null;
				String lng = null;
				String listening = null;
				String reading = null;
				String spokeninteraction = null;
				String spokenproduction = null;
				String writing = null;

				Node fLang = fLangLst.item(s);
				if (fLang.getNodeType() == Node.ELEMENT_NODE) {

					Node tmp = selectSingleNode(fLang, "code");
					if (tmp.getFirstChild() != null)
						lngCode = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(fLang, "label");
					if (tmp.getFirstChild() != null)
						lng = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(fLang, "level/listening");
					if (tmp.getFirstChild() != null)
						listening = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(fLang, "level/reading");
					if (tmp.getFirstChild() != null)
						reading = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(fLang, "level/spokeninteraction");
					if (tmp.getFirstChild() != null)
						spokeninteraction = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(fLang, "level/spokenproduction");
					if (tmp.getFirstChild() != null)
						spokenproduction = tmp.getFirstChild().getNodeValue();
					tmp = selectSingleNode(fLang, "level/writing");
					if (tmp.getFirstChild() != null)
						writing = tmp.getFirstChild().getNodeValue();

					Language lg = new Language();
					lg.setXml(xml);
					lg.setCodeLang(lngCode);
					lg.setLang(lng);
					lg.setListening(listening);
					lg.setReading(reading);
					lg.setSpokenInteraction(spokeninteraction);
					lg.setSpokenProduction(spokenproduction);
					lg.setWriting(writing);

				}
			}
		}

		return xml;
	}

}
