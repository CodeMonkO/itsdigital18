
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the free text
 * 
 * <p>Java class for FreeTextInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeTextInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeTextDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}FreeTextDetailsType"/>
 *         &lt;element name="freeText" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To70"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeTextInformationType", propOrder = {
    "freeTextDetails",
    "freeText"
})
public class FreeTextInformationType {

    @XmlElement(required = true)
    protected FreeTextDetailsType freeTextDetails;
    @XmlElement(required = true)
    protected String freeText;

    /**
     * Gets the value of the freeTextDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextDetailsType }
     *     
     */
    public FreeTextDetailsType getFreeTextDetails() {
        return freeTextDetails;
    }

    /**
     * Sets the value of the freeTextDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextDetailsType }
     *     
     */
    public void setFreeTextDetails(FreeTextDetailsType value) {
        this.freeTextDetails = value;
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
