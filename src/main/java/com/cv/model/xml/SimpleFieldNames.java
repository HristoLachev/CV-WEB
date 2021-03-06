//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.22 at 04:21:20 PM EEST 
//


package com.cv.model.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleFieldNames.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SimpleFieldNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LearnerInfo"/>
 *     &lt;enumeration value="LearnerInfo.Identification.PersonName"/>
 *     &lt;enumeration value="LearnerInfo.Identification.Demographics.Birthdate"/>
 *     &lt;enumeration value="LearnerInfo.CEFLanguageLevelsGrid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SimpleFieldNames")
@XmlEnum
public enum SimpleFieldNames {

    @XmlEnumValue("LearnerInfo")
    LEARNER_INFO("LearnerInfo"),
    @XmlEnumValue("LearnerInfo.Identification.PersonName")
    LEARNER_INFO_IDENTIFICATION_PERSON_NAME("LearnerInfo.Identification.PersonName"),
    @XmlEnumValue("LearnerInfo.Identification.Demographics.Birthdate")
    LEARNER_INFO_IDENTIFICATION_DEMOGRAPHICS_BIRTHDATE("LearnerInfo.Identification.Demographics.Birthdate"),
    @XmlEnumValue("LearnerInfo.CEFLanguageLevelsGrid")
    LEARNER_INFO_CEF_LANGUAGE_LEVELS_GRID("LearnerInfo.CEFLanguageLevelsGrid");
    private final String value;

    SimpleFieldNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SimpleFieldNames fromValue(String v) {
        for (SimpleFieldNames c: SimpleFieldNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
