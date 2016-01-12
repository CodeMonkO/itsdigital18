
package com.amadeus.xml.tpcbrq_12_4_1a;

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
 *         &lt;element name="departureCity" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}LocationTypeI" minOccurs="0"/>
 *         &lt;element name="arrivalCity" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}LocationTypeI" minOccurs="0"/>
 *         &lt;element name="airlineDetail" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}CompanyIdentificationTypeI" minOccurs="0"/>
 *         &lt;element name="segmentDetail" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ProductIdentificationDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="ticketingStatus" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
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
    "departureCity",
    "arrivalCity",
    "airlineDetail",
    "segmentDetail",
    "ticketingStatus"
})
public class TravelProductInformationTypeI {

    protected LocationTypeI departureCity;
    protected LocationTypeI arrivalCity;
    protected CompanyIdentificationTypeI airlineDetail;
    protected ProductIdentificationDetailsTypeI segmentDetail;
    protected String ticketingStatus;

    /**
     * Gets the value of the departureCity property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getDepartureCity() {
        return departureCity;
    }

    /**
     * Sets the value of the departureCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setDepartureCity(LocationTypeI value) {
        this.departureCity = value;
    }

    /**
     * Gets the value of the arrivalCity property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getArrivalCity() {
        return arrivalCity;
    }

    /**
     * Sets the value of the arrivalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setArrivalCity(LocationTypeI value) {
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
