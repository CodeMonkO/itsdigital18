
package com.amadeus.xml.tpcbrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boardPointDetails" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}LocationTypeI" minOccurs="0"/>
 *         &lt;element name="offpointDetails" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}LocationTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationTypeI", propOrder = {
    "boardPointDetails",
    "offpointDetails"
})
public class TravelProductInformationTypeI {

    protected LocationTypeI boardPointDetails;
    protected LocationTypeI offpointDetails;

    /**
     * Gets the value of the boardPointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getBoardPointDetails() {
        return boardPointDetails;
    }

    /**
     * Sets the value of the boardPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setBoardPointDetails(LocationTypeI value) {
        this.boardPointDetails = value;
    }

    /**
     * Gets the value of the offpointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getOffpointDetails() {
        return offpointDetails;
    }

    /**
     * Sets the value of the offpointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setOffpointDetails(LocationTypeI value) {
        this.offpointDetails = value;
    }

}
