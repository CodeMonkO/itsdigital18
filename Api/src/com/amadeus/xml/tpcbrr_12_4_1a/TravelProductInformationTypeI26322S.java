
package com.amadeus.xml.tpcbrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationTypeI_26322S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationTypeI_26322S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departureCity" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}LocationTypeI_47688C" minOccurs="0"/>
 *         &lt;element name="arrivalCity" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}LocationTypeI_47688C" minOccurs="0"/>
 *         &lt;element name="airlineDetail" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CompanyIdentificationTypeI" minOccurs="0"/>
 *         &lt;element name="segmentDetail" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ProductIdentificationDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="ticketingStatus" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationTypeI_26322S", propOrder = {
    "departureCity",
    "arrivalCity",
    "airlineDetail",
    "segmentDetail",
    "ticketingStatus"
})
public class TravelProductInformationTypeI26322S {

    protected LocationTypeI47688C departureCity;
    protected LocationTypeI47688C arrivalCity;
    protected CompanyIdentificationTypeI airlineDetail;
    protected ProductIdentificationDetailsTypeI segmentDetail;
    protected String ticketingStatus;

    /**
     * Gets the value of the departureCity property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI47688C }
     *     
     */
    public LocationTypeI47688C getDepartureCity() {
        return departureCity;
    }

    /**
     * Sets the value of the departureCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI47688C }
     *     
     */
    public void setDepartureCity(LocationTypeI47688C value) {
        this.departureCity = value;
    }

    /**
     * Gets the value of the arrivalCity property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI47688C }
     *     
     */
    public LocationTypeI47688C getArrivalCity() {
        return arrivalCity;
    }

    /**
     * Sets the value of the arrivalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI47688C }
     *     
     */
    public void setArrivalCity(LocationTypeI47688C value) {
        this.arrivalCity = value;
    }

    /**
     * Gets the value of the airlineDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public CompanyIdentificationTypeI getAirlineDetail() {
        return airlineDetail;
    }

    /**
     * Sets the value of the airlineDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public void setAirlineDetail(CompanyIdentificationTypeI value) {
        this.airlineDetail = value;
    }

    /**
     * Gets the value of the segmentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public ProductIdentificationDetailsTypeI getSegmentDetail() {
        return segmentDetail;
    }

    /**
     * Sets the value of the segmentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public void setSegmentDetail(ProductIdentificationDetailsTypeI value) {
        this.segmentDetail = value;
    }

    /**
     * Gets the value of the ticketingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingStatus() {
        return ticketingStatus;
    }

    /**
     * Sets the value of the ticketingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingStatus(String value) {
        this.ticketingStatus = value;
    }

}
