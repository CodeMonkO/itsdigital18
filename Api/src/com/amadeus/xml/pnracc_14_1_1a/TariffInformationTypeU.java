
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify tariff details relating to a service or product.
 * 
 * <p>Java class for TariffInformationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInformationTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TariffInformationDetailsTypeU_188150C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInformationTypeU", propOrder = {
    "priceDetails"
})
public class TariffInformationTypeU {

    @XmlElement(required = true)
    protected TariffInformationDetailsTypeU188150C priceDetails;

    /**
     * Gets the value of the priceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationDetailsTypeU188150C }
     *     
     */
    public TariffInformationDetailsTypeU188150C getPriceDetails() {
        return priceDetails;
    }

    /**
     * Sets the value of the priceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationDetailsTypeU188150C }
     *     
     */
    public void setPriceDetails(TariffInformationDetailsTypeU188150C value) {
        this.priceDetails = value;
    }

}
