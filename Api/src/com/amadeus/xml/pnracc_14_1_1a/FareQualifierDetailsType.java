
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the details which qualify a fare
 * 
 * <p>Java class for FareQualifierDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareQualifierDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareCategories" type="{http://xml.amadeus.com/PNRACC_14_1_1A}FareCategoryCodesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareQualifierDetailsType", propOrder = {
    "fareCategories"
})
public class FareQualifierDetailsType {

    protected FareCategoryCodesType fareCategories;

    /**
     * Gets the value of the fareCategories property.
     * 
     * @return
     *     possible object is
     *     {@link FareCategoryCodesType }
     *     
     */
    public FareCategoryCodesType getFareCategories() {
        return fareCategories;
    }

    /**
     * Sets the value of the fareCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareCategoryCodesType }
     *     
     */
    public void setFareCategories(FareCategoryCodesType value) {
        this.fareCategories = value;
    }

}
