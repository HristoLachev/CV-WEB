package model;

public class Language {

	private Long id;
	private EuroPassXML xml;
	private String codeLang;
	private String lang;
	private String listening;
	private String reading;
	private String spokenInteraction;
	private String spokenProduction;
	private String writing;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EuroPassXML getXml() {
		return xml;
	}

	public void setXml(EuroPassXML xml) {
		this.xml = xml;
	}

	public String getCodeLang() {
		return codeLang;
	}

	public void setCodeLang(String codeLang) {
		this.codeLang = codeLang;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getListening() {
		return listening;
	}

	public void setListening(String listening) {
		this.listening = listening;
	}

	public String getReading() {
		return reading;
	}

	public void setReading(String reading) {
		this.reading = reading;
	}

	public String getSpokenInteraction() {
		return spokenInteraction;
	}

	public void setSpokenInteraction(String spokenInteraction) {
		this.spokenInteraction = spokenInteraction;
	}

	public String getSpokenProduction() {
		return spokenProduction;
	}

	public void setSpokenProduction(String spokenProduction) {
		this.spokenProduction = spokenProduction;
	}

	public String getWriting() {
		return writing;
	}

	public void setWriting(String writing) {
		this.writing = writing;
	}

}
