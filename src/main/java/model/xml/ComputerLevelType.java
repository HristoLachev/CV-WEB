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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputerLevelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComputerLevelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Information" type="{http://europass.cedefop.europa.eu/Europass}ICTLevelType" minOccurs="0"/>
 *         &lt;element name="Communication" type="{http://europass.cedefop.europa.eu/Europass}ICTLevelType" minOccurs="0"/>
 *         &lt;element name="ContentCreation" type="{http://europass.cedefop.europa.eu/Europass}ICTLevelType" minOccurs="0"/>
 *         &lt;element name="Safety" type="{http://europass.cedefop.europa.eu/Europass}ICTLevelType" minOccurs="0"/>
 *         &lt;element name="ProblemSolving" type="{http://europass.cedefop.europa.eu/Europass}ICTLevelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputerLevelType", propOrder = {
    "information",
    "communication",
    "contentCreation",
    "safety",
    "problemSolving"
})
public class ComputerLevelType {

    @XmlElement(name = "Information")
    @XmlSchemaType(name = "string")
    protected ICTLevelType information;
    @XmlElement(name = "Communication")
    @XmlSchemaType(name = "string")
    protected ICTLevelType communication;
    @XmlElement(name = "ContentCreation")
    @XmlSchemaType(name = "string")
    protected ICTLevelType contentCreation;
    @XmlElement(name = "Safety")
    @XmlSchemaType(name = "string")
    protected ICTLevelType safety;
    @XmlElement(name = "ProblemSolving")
    @XmlSchemaType(name = "string")
    protected ICTLevelType problemSolving;

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link ICTLevelType }
     *     
     */
    public ICTLevelType getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICTLevelType }
     *     
     */
    public void setInformation(ICTLevelType value) {
        this.information = value;
    }

    /**
     * Gets the value of the communication property.
     * 
     * @return
     *     possible object is
     *     {@link ICTLevelType }
     *     
     */
    public ICTLevelType getCommunication() {
        return communication;
    }

    /**
     * Sets the value of the communication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICTLevelType }
     *     
     */
    public void setCommunication(ICTLevelType value) {
        this.communication = value;
    }

    /**
     * Gets the value of the contentCreation property.
     * 
     * @return
     *     possible object is
     *     {@link ICTLevelType }
     *     
     */
    public ICTLevelType getContentCreation() {
        return contentCreation;
    }

    /**
     * Sets the value of the contentCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICTLevelType }
     *     
     */
    public void setContentCreation(ICTLevelType value) {
        this.contentCreation = value;
    }

    /**
     * Gets the value of the safety property.
     * 
     * @return
     *     possible object is
     *     {@link ICTLevelType }
     *     
     */
    public ICTLevelType getSafety() {
        return safety;
    }

    /**
     * Sets the value of the safety property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICTLevelType }
     *     
     */
    public void setSafety(ICTLevelType value) {
        this.safety = value;
    }

    /**
     * Gets the value of the problemSolving property.
     * 
     * @return
     *     possible object is
     *     {@link ICTLevelType }
     *     
     */
    public ICTLevelType getProblemSolving() {
        return problemSolving;
    }

    /**
     * Sets the value of the problemSolving property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICTLevelType }
     *     
     */
    public void setProblemSolving(ICTLevelType value) {
        this.problemSolving = value;
    }

}
