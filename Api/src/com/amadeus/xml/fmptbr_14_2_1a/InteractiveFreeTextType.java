
package com.amadeus.xml.fmptbr_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide free form or coded text information.
 * 
 * <p>Java class for InteractiveFreeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractiveFreeTextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeTextQualification" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}FreeTextQualificationTypeI" minOccurs="0"/>
 *         &lt;element name="freeText" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To50" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractiveFreeTextType", propOrder = {
    "freeTextQualification",
    "freeText"
})
public class InteractiveFreeTextType {

    protected FreeTextQualificationTypeI freeTextQualification;
    protected String freeText;

    /**
     * Gets the value of the freeTextQualification property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextQualificationTypeI }
     *     
     */
    public FreeTextQualificationTypeI getFreeTextQualification() {
        return freeTextQualification;
    }

    /**
     * Sets the value of the freeTextQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextQualificationTypeI }
     *     
     */
    public void setFreeTextQualification(FreeTextQualificationTypeI value) {
        this.freeTextQualification = value;
    }

    /**
     * Gets the value of the freeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

}
