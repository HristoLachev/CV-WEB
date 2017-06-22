//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.22 at 04:21:20 PM EEST 
//


package model.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the base-64 encoded bytes of a JPEG or PNG image file that represents the personal photo of an individual.
 * 				Restricts the FileDataType by excluding the Name sub-element and specifying that the MimeType accepts values from the ImageMimeTypeEnumeration.
 * 			
 * 
 * <p>Java class for PhotoDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhotoDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}FileDataType">
 *       &lt;sequence>
 *         &lt;element name="MimeType" type="{http://europass.cedefop.europa.eu/Europass}ImageMimeTypeEnumeration"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="MetadataList" type="{http://europass.cedefop.europa.eu/Europass}MetadataListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhotoDataType")
@XmlSeeAlso({
    SignatureDataType.class
})
public class PhotoDataType
    extends FileDataType
{


}