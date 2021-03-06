//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.22 at 04:21:20 PM EEST 
//


package com.cv.model.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Describes the opening salutation to the expected reader of this cover letter.
 *             
 * 
 * <p>Java class for OpeningSalutationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpeningSalutationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Salutation" type="{http://europass.cedefop.europa.eu/Europass}OpeningSalutationSalutationType" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://europass.cedefop.europa.eu/Europass}PersonNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpeningSalutationType", propOrder = {
    "salutation",
    "personName"
})
public class OpeningSalutationType {

    @XmlElement(name = "Salutation")
    protected OpeningSalutationSalutationType salutation;
    @XmlElement(name = "PersonName")
    protected PersonNameType personName;

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningSalutationSalutationType }
     *     
     */
    public OpeningSalutationSalutationType getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningSalutationSalutationType }
     *     
     */
    public void setSalutation(OpeningSalutationSalutationType value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

}
