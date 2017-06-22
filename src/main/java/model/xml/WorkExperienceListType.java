//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.22 at 04:21:20 PM EEST 
//


package model.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Contains an list of work experiences. The order of those experiences is defined by the related printing preferences.
 *             
 * 
 * <p>Java class for WorkExperienceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkExperienceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkExperience" type="{http://europass.cedefop.europa.eu/Europass}WorkExperienceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkExperienceListType", propOrder = {
    "workExperience"
})
public class WorkExperienceListType {

    @XmlElement(name = "WorkExperience")
    protected List<WorkExperienceType> workExperience;

    /**
     * Gets the value of the workExperience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workExperience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkExperience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkExperienceType }
     * 
     * 
     */
    public List<WorkExperienceType> getWorkExperience() {
        if (workExperience == null) {
            workExperience = new ArrayList<WorkExperienceType>();
        }
        return this.workExperience;
    }

}
