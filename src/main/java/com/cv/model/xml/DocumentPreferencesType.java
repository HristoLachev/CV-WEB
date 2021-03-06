//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.22 at 04:21:20 PM EEST 
//


package com.cv.model.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://europass.cedefop.europa.eu/Europass}FieldNames" />
 *                 &lt;attribute name="show" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="format" type="{http://europass.cedefop.europa.eu/Europass}SimpleFieldFormats" />
 *                 &lt;attribute name="order" type="{http://europass.cedefop.europa.eu/Europass}OrderNames" />
 *                 &lt;attribute name="position" type="{http://europass.cedefop.europa.eu/Europass}PositionNames" />
 *                 &lt;attribute name="justify" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://europass.cedefop.europa.eu/Europass}DocumentTypeEnumeration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentPreferencesType", propOrder = {
    "field"
})
public class DocumentPreferencesType {

    @XmlElement(name = "Field")
    protected List<DocumentPreferencesType.Field> field;
    @XmlAttribute(name = "type", required = true)
    protected DocumentTypeEnumeration type;

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentPreferencesType.Field }
     * 
     * 
     */
    public List<DocumentPreferencesType.Field> getField() {
        if (field == null) {
            field = new ArrayList<DocumentPreferencesType.Field>();
        }
        return this.field;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeEnumeration }
     *     
     */
    public DocumentTypeEnumeration getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeEnumeration }
     *     
     */
    public void setType(DocumentTypeEnumeration value) {
        this.type = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" use="required" type="{http://europass.cedefop.europa.eu/Europass}FieldNames" />
     *       &lt;attribute name="show" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="format" type="{http://europass.cedefop.europa.eu/Europass}SimpleFieldFormats" />
     *       &lt;attribute name="order" type="{http://europass.cedefop.europa.eu/Europass}OrderNames" />
     *       &lt;attribute name="position" type="{http://europass.cedefop.europa.eu/Europass}PositionNames" />
     *       &lt;attribute name="justify" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Field {

        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "show")
        protected Boolean show;
        @XmlAttribute(name = "format")
        protected String format;
        @XmlAttribute(name = "order")
        protected OrderNames order;
        @XmlAttribute(name = "position")
        protected PositionNames position;
        @XmlAttribute(name = "justify")
        protected Boolean justify;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the show property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShow() {
            return show;
        }

        /**
         * Sets the value of the show property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShow(Boolean value) {
            this.show = value;
        }

        /**
         * Gets the value of the format property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormat() {
            return format;
        }

        /**
         * Sets the value of the format property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormat(String value) {
            this.format = value;
        }

        /**
         * Gets the value of the order property.
         * 
         * @return
         *     possible object is
         *     {@link OrderNames }
         *     
         */
        public OrderNames getOrder() {
            return order;
        }

        /**
         * Sets the value of the order property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderNames }
         *     
         */
        public void setOrder(OrderNames value) {
            this.order = value;
        }

        /**
         * Gets the value of the position property.
         * 
         * @return
         *     possible object is
         *     {@link PositionNames }
         *     
         */
        public PositionNames getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link PositionNames }
         *     
         */
        public void setPosition(PositionNames value) {
            this.position = value;
        }

        /**
         * Gets the value of the justify property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isJustify() {
            return justify;
        }

        /**
         * Sets the value of the justify property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setJustify(Boolean value) {
            this.justify = value;
        }

    }

}
