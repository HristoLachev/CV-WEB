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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains information about the available contact methods for the individual.
 * 			
 * 
 * <p>Java class for ContactMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="Use" type="{http://europass.cedefop.europa.eu/Europass}LabelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMethodType", propOrder = {
    "contact",
    "use"
})
@XmlSeeAlso({
    TelephoneType.class,
    ContactEmailType.class,
    ContactAddressType.class,
    WebsiteType.class,
    OrganisationalWebsiteType.class,
    InstantMessagingType.class
})
public abstract class ContactMethodType {

    @XmlElement(name = "Contact")
    protected Object contact;
    @XmlElement(name = "Use")
    protected LabelType use;

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContact(Object value) {
        this.contact = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link LabelType }
     *     
     */
    public LabelType getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelType }
     *     
     */
    public void setUse(LabelType value) {
        this.use = value;
    }

}
