
package com.amadeus.xml.tipnrq_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify fare basis info
 * 
 * <p>Java class for FareQualifierDetailsTypeI_82845S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareQualifierDetailsTypeI_82845S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discountDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}DiscountPenaltyInformationTypeI_127142C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareQualifierDetailsTypeI_82845S", propOrder = {
    "discountDetails"
})
public class FareQualifierDetailsTypeI82845S {

    protected DiscountPenaltyInformationTypeI127142C discountDetails;

    /**
     * Gets the value of the discountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountPenaltyInformationTypeI127142C }
     *     
     */
    public DiscountPenaltyInformationTypeI127142C getDiscountDetails() {
        return discountDetails;
    }

    /**
     * Sets the value of the discountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountPenaltyInformationTypeI127142C }
     *     
     */
    public void setDiscountDetails(DiscountPenaltyInformationTypeI127142C value) {
        this.discountDetails = value;
    }

}
