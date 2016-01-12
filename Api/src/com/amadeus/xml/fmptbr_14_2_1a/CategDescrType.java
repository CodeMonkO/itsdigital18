
package com.amadeus.xml.fmptbr_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify an ATPCO Fare Category
 * 
 * <p>Java class for CategDescrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategDescrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descriptionInfo" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}CategoryDescriptionType"/>
 *         &lt;element name="processIndicator" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategDescrType", propOrder = {
    "descriptionInfo",
    "processIndicator"
})
public class CategDescrType {

    @XmlElement(required = true)
    protected CategoryDescriptionType descriptionInfo;
    protected String processIndicator;

    /**
     * Gets the value of the descriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryDescriptionType }
     *     
     */
    public CategoryDescriptionType getDescriptionInfo() {
        return descriptionInfo;
    }

    /**
     * Sets the value of the descriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryDescriptionType }
     *     
     */
    public void setDescriptionInfo(CategoryDescriptionType value) {
        this.descriptionInfo = value;
    }

    /**
     * Gets the value of the processIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessIndicator() {
        return processIndicator;
    }

    /**
     * Sets the value of the processIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessIndicator(String value) {
        this.processIndicator = value;
    }

}
