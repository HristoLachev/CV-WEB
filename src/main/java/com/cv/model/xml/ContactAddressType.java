//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.22 at 04:21:20 PM EEST 
//

package com.cv.model.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Defines the contact address of an individual.
 * 
 * 
 * <p>
 * Java class for ContactAddressType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ContactAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}ContactMethodType">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{http://europass.cedefop.europa.eu/Europass}AddressInfoType" minOccurs="0"/>
 *         &lt;element name="Use" type="{http://europass.cedefop.europa.eu/Europass}LabelType" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactAddressType", propOrder = { "contact" })
public class ContactAddressType {

	@XmlElement(name = "Contact")
	protected AddressInfoType contact;

	public AddressInfoType getContact() {
		return contact;
	}

	public void setContact(AddressInfoType value) {
		this.contact = value;
	}

}
