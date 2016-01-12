
package com.amadeus.xml.smpreq_13_1_ia;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="travelProductIdent" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}TravelProductInformationTypeI"/>
 *         &lt;element name="seatRequestParameters" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}SeatRequestParametersTypeI" minOccurs="0"/>
 *         &lt;element name="productInformation" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}RelatedProductInformationTypeI" minOccurs="0"/>
 *         &lt;element name="frequentTravelerInfo" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}FrequentTravellerInformationTypeI" minOccurs="0"/>
 *         &lt;element name="resControlInfo" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}ReservationControlInformationTypeI" minOccurs="0"/>
 *         &lt;element name="equipmentInformation" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}EquipmentInfoTypeI" minOccurs="0"/>
 *         &lt;element name="additionalInfo" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AdditionalBusinessSourceInformationTypeI" minOccurs="0"/>
 *         &lt;element name="conversionRate" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}ConversionRateTypeI" minOccurs="0"/>
 *         &lt;element name="traveler" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="travelerInformation" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}TravellerInformationTypeI"/>
 *                   &lt;element name="frequentTravelerDetails" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}FrequentTravellerInformationTypeI" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="fareInfo" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}FareInformationTypeI" minOccurs="0"/>
 *                   &lt;element name="dateAndTimeInfo" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}DateAndTimeInformationTypeI" minOccurs="0"/>
 *                   &lt;element name="ticketDetails" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}TicketNumberTypeI" minOccurs="0"/>
 *                   &lt;element name="fareQualifierDetails" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}FareQualifierDetailsTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "travelProductIdent",
    "seatRequestParameters",
    "productInformation",
    "frequentTravelerInfo",
    "resControlInfo",
    "equipmentInformation",
    "additionalInfo",
    "conversionRate",
    "traveler"
})
@XmlRootElement(name = "Air_RetrieveSeatMap")
public class AirRetrieveSeatMap {

    @XmlElement(required = true)
    protected TravelProductInformationTypeI travelProductIdent;
    protected SeatRequestParametersTypeI seatRequestParameters;
    protected RelatedProductInformationTypeI productInformation;
    protected FrequentTravellerInformationTypeI frequentTravelerInfo;
    protected ReservationControlInformationTypeI resControlInfo;
    protected EquipmentInfoTypeI equipmentInformation;
    protected AdditionalBusinessSourceInformationTypeI additionalInfo;
    protected ConversionRateTypeI conversionRate;
    protected List<AirRetrieveSeatMap.Traveler> traveler;

    /**
     * Gets the value of the travelProductIdent property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationTypeI }
     *     
     */
    public TravelProductInformationTypeI getTravelProductIdent() {
        return travelProductIdent;
    }

    /**
     * Sets the value of the travelProductIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationTypeI }
     *     
     */
    public void setTravelProductIdent(TravelProductInformationTypeI value) {
        this.travelProductIdent = value;
    }

    /**
     * Gets the value of the seatRequestParameters property.
     * 
     * @return
     *     possible object is
     *     {@link SeatRequestParametersTypeI }
     *     
     */
    public SeatRequestParametersTypeI getSeatRequestParameters() {
        return seatRequestParameters;
    }

    /**
     * Sets the value of the seatRequestParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatRequestParametersTypeI }
     *     
     */
    public void setSeatRequestParameters(SeatRequestParametersTypeI value) {
        this.seatRequestParameters = value;
    }

    /**
     * Gets the value of the productInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedProductInformationTypeI }
     *     
     */
    public RelatedProductInformationTypeI getProductInformation() {
        return productInformation;
    }

    /**
     * Sets the value of the productInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedProductInformationTypeI }
     *     
     */
    public void setProductInformation(RelatedProductInformationTypeI value) {
        this.productInformation = value;
    }

    /**
     * Gets the value of the frequentTravelerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerInformationTypeI }
     *     
     */
    public FrequentTravellerInformationTypeI getFrequentTravelerInfo() {
        return frequentTravelerInfo;
    }

    /**
     * Sets the value of the frequentTravelerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerInformationTypeI }
     *     
     */
    public void setFrequentTravelerInfo(FrequentTravellerInformationTypeI value) {
        this.frequentTravelerInfo = value;
    }

    /**
     * Gets the value of the resControlInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public ReservationControlInformationTypeI getResControlInfo() {
        return resControlInfo;
    }

    /**
     * Sets the value of the resControlInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public void setResControlInfo(ReservationControlInformationTypeI value) {
        this.resControlInfo = value;
    }

    /**
     * Gets the value of the equipmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentInfoTypeI }
     *     
     */
    public EquipmentInfoTypeI getEquipmentInformation() {
        return equipmentInformation;
    }

    /**
     * Sets the value of the equipmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentInfoTypeI }
     *     
     */
    public void setEquipmentInformation(EquipmentInfoTypeI value) {
        this.equipmentInformation = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalBusinessSourceInformationTypeI }
     *     
     */
    public AdditionalBusinessSourceInformationTypeI getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalBusinessSourceInformationTypeI }
     *     
     */
    public void setAdditionalInfo(AdditionalBusinessSourceInformationTypeI value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateTypeI }
     *     
     */
    public ConversionRateTypeI getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateTypeI }
     *     
     */
    public void setConversionRate(ConversionRateTypeI value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the traveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirRetrieveSeatMap.Traveler }
     * 
     * 
     */
    public List<AirRetrieveSeatMap.Traveler> getTraveler() {
        if (traveler == null) {
            traveler = new ArrayList<AirRetrieveSeatMap.Traveler>();
        }
        return this.traveler;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="travelerInformation" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}TravellerInformationTypeI"/>
     *         &lt;element name="frequentTravelerDetails" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}FrequentTravellerInformationTypeI" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}FareInformationTypeI" minOccurs="0"/>
     *         &lt;element name="dateAndTimeInfo" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}DateAndTimeInformationTypeI" minOccurs="0"/>
     *         &lt;element name="ticketDetails" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}TicketNumberTypeI" minOccurs="0"/>
     *         &lt;element name="fareQualifierDetails" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}FareQualifierDetailsTypeI" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "travelerInformation",
        "frequentTravelerDetails",
        "fareInfo",
        "dateAndTimeInfo",
        "ticketDetails",
        "fareQualifierDetails"
    })
    public static class Traveler {

        @XmlElement(required = true)
        protected TravellerInformationTypeI travelerInformation;
        protected List<FrequentTravellerInformationTypeI> frequentTravelerDetails;
        protected FareInformationTypeI fareInfo;
        protected DateAndTimeInformationTypeI dateAndTimeInfo;
        protected TicketNumberTypeI ticketDetails;
        protected FareQualifierDetailsTypeI fareQualifierDetails;

        /**
         * Gets the value of the travelerInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TravellerInformationTypeI }
         *     
         */
        public TravellerInformationTypeI getTravelerInformation() {
            return travelerInformation;
        }

        /**
         * Sets the value of the travelerInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravellerInformationTypeI }
         *     
         */
        public void setTravelerInformation(TravellerInformationTypeI value) {
            this.travelerInformation = value;
        }

        /**
         * Gets the value of the frequentTravelerDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the frequentTravelerDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFrequentTravelerDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FrequentTravellerInformationTypeI }
         * 
         * 
         */
        public List<FrequentTravellerInformationTypeI> getFrequentTravelerDetails() {
            if (frequentTravelerDetails == null) {
                frequentTravelerDetails = new ArrayList<FrequentTravellerInformationTypeI>();
            }
            return this.frequentTravelerDetails;
        }

        /**
         * Gets the value of the fareInfo property.
         * 
         * @return
         *     possible object is
         *     {@link FareInformationTypeI }
         *     
         */
        public FareInformationTypeI getFareInfo() {
            return fareInfo;
        }

        /**
         * Sets the value of the fareInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareInformationTypeI }
         *     
         */
        public void setFareInfo(FareInformationTypeI value) {
            this.fareInfo = value;
        }

        /**
         * Gets the value of the dateAndTimeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link DateAndTimeInformationTypeI }
         *     
         */
        public DateAndTimeInformationTypeI getDateAndTimeInfo() {
            return dateAndTimeInfo;
        }

        /**
         * Sets the value of the dateAndTimeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateAndTimeInformationTypeI }
         *     
         */
        public void setDateAndTimeInfo(DateAndTimeInformationTypeI value) {
            this.dateAndTimeInfo = value;
        }

        /**
         * Gets the value of the ticketDetails property.
         * 
         * @return
         *     possible object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public TicketNumberTypeI getTicketDetails() {
            return ticketDetails;
        }

        /**
         * Sets the value of the ticketDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public void setTicketDetails(TicketNumberTypeI value) {
            this.ticketDetails = value;
        }

        /**
         * Gets the value of the fareQualifierDetails property.
         * 
         * @return
         *     possible object is
         *     {@link FareQualifierDetailsTypeI }
         *     
         */
        public FareQualifierDetailsTypeI getFareQualifierDetails() {
            return fareQualifierDetails;
        }

        /**
         * Sets the value of the fareQualifierDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareQualifierDetailsTypeI }
         *     
         */
        public void setFareQualifierDetails(FareQualifierDetailsTypeI value) {
            this.fareQualifierDetails = value;
        }

    }

}
