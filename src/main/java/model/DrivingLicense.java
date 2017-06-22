package model;

public class DrivingLicense {
	private Long id;
	private EuroPassXML xml;
	private String drivingSkill;

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

	public String getDrivingSkill() {
		return drivingSkill;
	}

	public void setDrivingSkill(String drivingSkill) {
		this.drivingSkill = drivingSkill;
	}

}
