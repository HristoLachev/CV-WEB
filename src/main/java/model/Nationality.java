package model;

public class Nationality {
	private Long id;
	private String code;
	private String nationality;
	private EuroPassXML xml;

	public EuroPassXML getXml() {
		return xml;
	}

	public void setXml(EuroPassXML xml) {
		this.xml = xml;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
