
package com.amadeus.xml.fmptbr_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information about discounts and penalties
 * 
 * <p>Java class for DiscountAndPenaltyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountAndPenaltyInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feeIdentification" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="feeInformation" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}DiscountPenaltyMonetaryInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountAndPenaltyInformationType", propOrder = {
    "feeIdentification",
    "feeInformation"
})
public class DiscountAndPenaltyInformationType {

    protected String feeIdentification;
    protected DiscountPenaltyMonetaryInformationType feeInformation;

    /**
     * Gets the value of the feeIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeIdentification() {
        return feeIdentification;
    }

    /**
     * Sets the value of the feeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeIdentification(String value) {
        this.feeIdentification = value;
    }

    /**
     * Gets the value of the feeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountPenaltyMonetaryInformationType }
     *     
     */
    public DiscountPenaltyMonetaryInformationType getFeeInformation() {
        return feeInformation;
    }

    /**
     * Sets the value of the feeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountPenaltyMonetaryInformationType }
     *     
     */
    public void setFeeInformation(DiscountPenaltyMonetaryInformationType value) {
        this.feeInformation = value;
    }

}
