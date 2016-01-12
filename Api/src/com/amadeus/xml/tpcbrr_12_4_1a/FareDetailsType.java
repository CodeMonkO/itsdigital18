
package com.amadeus.xml.tpcbrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareCategory" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDetailsType", propOrder = {
    "fareCategory"
})
public class FareDetailsType {

    protected String fareCategory;

    /**
     * Gets the value of the fareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCategory() {
        return fareCategory;
    }

    /**
     * Sets the value of the fareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCategory(String value) {
        this.fareCategory = value;
    }

}
