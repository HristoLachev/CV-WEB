//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.22 at 04:21:20 PM EEST 
//


package model.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Defines a computer skill, which is modelled with one unstructured (free text) Description element, 
 *                 and it may provide additional information about proficiency level, and verification organization.
 *                 It may also accept Documentation information (reference document).
 *             
 * 
 * <p>Java class for ComputerSkillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComputerSkillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}SkillType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProficiencyLevel" type="{http://europass.cedefop.europa.eu/Europass}ComputerLevelType" minOccurs="0"/>
 *         &lt;element name="VerifiedBy" type="{http://europass.cedefop.europa.eu/Europass}ComputerCertificateListType" minOccurs="0"/>
 *         &lt;element name="Documentation" type="{http://europass.cedefop.europa.eu/Europass}IntraDocumentDocumentationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputerSkillType")
public class ComputerSkillType
    extends SkillType
{


}
