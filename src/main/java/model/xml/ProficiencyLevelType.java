//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.22 at 04:21:20 PM EEST 
//


package model.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProficiencyLevelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProficiencyLevelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Listening" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/>
 *         &lt;element name="Reading" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/>
 *         &lt;element name="SpokenInteraction" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/>
 *         &lt;element name="SpokenProduction" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/>
 *         &lt;element name="Writing" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProficiencyLevelType", propOrder = {
    "listening",
    "reading",
    "spokenInteraction",
    "spokenProduction",
    "writing"
})
public class ProficiencyLevelType {

    @XmlElement(name = "Listening")
    protected String listening;
    @XmlElement(name = "Reading")
    protected String reading;
    @XmlElement(name = "SpokenInteraction")
    protected String spokenInteraction;
    @XmlElement(name = "SpokenProduction")
    protected String spokenProduction;
    @XmlElement(name = "Writing")
    protected String writing;

    /**
     * Gets the value of the listening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListening() {
        return listening;
    }

    /**
     * Sets the value of the listening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListening(String value) {
        this.listening = value;
    }

    /**
     * Gets the value of the reading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReading() {
        return reading;
    }

    /**
     * Sets the value of the reading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReading(String value) {
        this.reading = value;
    }

    /**
     * Gets the value of the spokenInteraction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpokenInteraction() {
        return spokenInteraction;
    }

    /**
     * Sets the value of the spokenInteraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpokenInteraction(String value) {
        this.spokenInteraction = value;
    }

    /**
     * Gets the value of the spokenProduction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpokenProduction() {
        return spokenProduction;
    }

    /**
     * Sets the value of the spokenProduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpokenProduction(String value) {
        this.spokenProduction = value;
    }

    /**
     * Gets the value of the writing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriting() {
        return writing;
    }

    /**
     * Sets the value of the writing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriting(String value) {
        this.writing = value;
    }

}