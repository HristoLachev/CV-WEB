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
 * 
 *                 Defines an organisation providing employment by extending the abstract organisation type to include information about the business sector the company belongs to.
 *             
 * 
 * <p>Java class for EmployerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://europass.cedefop.europa.eu/Europass}OrganisationType">
 *       &lt;sequence>
 *         &lt;element name="Sector" type="{http://europass.cedefop.europa.eu/Europass}BusinesSectorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployerType", propOrder = {
    "sector"
})
public class EmployerType
    extends OrganisationType
{

    @XmlElement(name = "Sector")
    protected BusinesSectorType sector;

    /**
     * Gets the value of the sector property.
     * 
     * @return
     *     possible object is
     *     {@link BusinesSectorType }
     *     
     */
    public BusinesSectorType getSector() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinesSectorType }
     *     
     */
    public void setSector(BusinesSectorType value) {
        this.sector = value;
    }

}
