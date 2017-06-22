//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.22 at 04:21:20 PM EEST 
//


package model.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateFieldFormatPattern.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateFieldFormatPattern">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="text/short"/>
 *     &lt;enumeration value="text/long"/>
 *     &lt;enumeration value="text/long/suffix"/>
 *     &lt;enumeration value="text/long/texts"/>
 *     &lt;enumeration value="numeric/long"/>
 *     &lt;enumeration value="numeric/medium"/>
 *     &lt;enumeration value="numeric/short"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DateFieldFormatPattern")
@XmlEnum
public enum DateFieldFormatPattern {

    @XmlEnumValue("text/short")
    TEXT_SHORT("text/short"),
    @XmlEnumValue("text/long")
    TEXT_LONG("text/long"),
    @XmlEnumValue("text/long/suffix")
    TEXT_LONG_SUFFIX("text/long/suffix"),
    @XmlEnumValue("text/long/texts")
    TEXT_LONG_TEXTS("text/long/texts"),
    @XmlEnumValue("numeric/long")
    NUMERIC_LONG("numeric/long"),
    @XmlEnumValue("numeric/medium")
    NUMERIC_MEDIUM("numeric/medium"),
    @XmlEnumValue("numeric/short")
    NUMERIC_SHORT("numeric/short");
    private final String value;

    DateFieldFormatPattern(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateFieldFormatPattern fromValue(String v) {
        for (DateFieldFormatPattern c: DateFieldFormatPattern.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
