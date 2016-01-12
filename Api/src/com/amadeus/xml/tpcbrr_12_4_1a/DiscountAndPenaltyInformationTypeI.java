
package com.amadeus.xml.tpcbrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information about discounts and penalties
 * 
 * <p>Java class for DiscountAndPenaltyInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountAndPenaltyInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="penDisData" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DiscountPenaltyMonetaryInformationTypeI_29792C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountAndPenaltyInformationTypeI", propOrder = {
    "penDisData"
})
public class DiscountAndPenaltyInformationTypeI {

    protected DiscountPenaltyMonetaryInformationTypeI29792C penDisData;

    /**
     * Gets the value of the penDisData property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountPenaltyMonetaryInformationTypeI29792C }
     *     
     */
    public DiscountPenaltyMonetaryInformationTypeI29792C getPenDisData() {
        return penDisData;
    }

    /**
     * Sets the value of the penDisData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountPenaltyMonetaryInformationTypeI29792C }
     *     
     */
    public void setPenDisData(DiscountPenaltyMonetaryInformationTypeI29792C value) {
        this.penDisData = value;
    }

}
