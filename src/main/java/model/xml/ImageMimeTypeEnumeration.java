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
 * <p>Java class for ImageMimeTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageMimeTypeEnumeration">
 *   &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}MimeTypeEnumeration">
 *     &lt;enumeration value="image/jpeg"/>
 *     &lt;enumeration value="image/pjpeg"/>
 *     &lt;enumeration value="image/png"/>
 *     &lt;enumeration value="image/x-png"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageMimeTypeEnumeration")
@XmlEnum(MimeTypeEnumeration.class)
public enum ImageMimeTypeEnumeration {

    @XmlEnumValue("image/jpeg")
    IMAGE_JPEG(MimeTypeEnumeration.IMAGE_JPEG),
    @XmlEnumValue("image/pjpeg")
    IMAGE_PJPEG(MimeTypeEnumeration.IMAGE_PJPEG),
    @XmlEnumValue("image/png")
    IMAGE_PNG(MimeTypeEnumeration.IMAGE_PNG),
    @XmlEnumValue("image/x-png")
    IMAGE_X_PNG(MimeTypeEnumeration.IMAGE_X_PNG);
    private final MimeTypeEnumeration value;

    ImageMimeTypeEnumeration(MimeTypeEnumeration v) {
        value = v;
    }

    public MimeTypeEnumeration value() {
        return value;
    }

    public static ImageMimeTypeEnumeration fromValue(MimeTypeEnumeration v) {
        for (ImageMimeTypeEnumeration c: ImageMimeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
