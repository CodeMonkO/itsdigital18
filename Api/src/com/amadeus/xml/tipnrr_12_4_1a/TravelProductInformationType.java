
package com.amadeus.xml.tipnrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boardPointDetails" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}LocationTypeI_208252C" minOccurs="0"/>
 *         &lt;element name="offpointDetails" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}LocationTypeI_208252C" minOccurs="0"/>
 *         &lt;element name="flightTypeDetails" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ProductTypeDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationType", propOrder = {
    "boardPointDetails",
    "offpointDetails",
    "flightTypeDetails"
})
public class TravelProductInformationType {

    protected LocationTypeI208252C boardPointDetails;
    protected LocationTypeI208252C offpointDetails;
    protected ProductTypeDetailsType flightTypeDetails;

    /**
     * Gets the value of the boardPointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI208252C }
     *     
     */
    public LocationTypeI208252C getBoardPointDetails() {
        return boardPointDetails;
    }

    /**
     * Sets the value of the boardPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI208252C }
     *     
     */
    public void setBoardPointDetails(LocationTypeI208252C value) {
        this.boardPointDetails = value;
    }

    /**
     * Gets the value of the offpointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI208252C }
     *     
     */
    public LocationTypeI208252C getOffpointDetails() {
        return offpointDetails;
    }

    /**
     * Sets the value of the offpointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI208252C }
     *     
     */
    public void setOffpointDetails(LocationTypeI208252C value) {
        this.offpointDetails = value;
    }

    /**
     * Gets the value of the flightTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsType }
     *     
     */
    public ProductTypeDetailsType getFlightTypeDetails() {
        return flightTypeDetails;
    }

    /**
     * Sets the value of the flightTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsType }
     *     
     */
    public void setFlightTypeDetails(ProductTypeDetailsType value) {
        this.flightTypeDetails = value;
    }

}
