
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Convey coded key and corresponding value
 * 
 * <p>Java class for CodedAttributeInformationType_188409C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedAttributeInformationType_188409C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeType" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To5"/>
 *         &lt;element name="attributeDescription" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To256" minOccurs="0"/>
 *         &lt;element name="language" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="encoding" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To8" minOccurs="0"/>
 *         &lt;element name="source" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedAttributeInformationType_188409C", propOrder = {
    "attributeType",
    "attributeDescription",
    "language",
    "encoding",
    "source"
})
public class CodedAttributeInformationType188409C {

    @XmlElement(required = true)
    protected String attributeType;
    protected String attributeDescription;
    protected String language;
    protected String encoding;
    protected String source;

    /**
     * Gets the value of the attributeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeType(String value) {
        this.attributeType = value;
    }

    /**
     * Gets the value of the attributeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeDescription() {
        return attributeDescription;
    }

    /**
     * Sets the value of the attributeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeDescription(String value) {
        this.attributeDescription = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
