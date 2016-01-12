
package com.amadeus.xml.tipnrq_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contain passenger information
 * 
 * <p>Java class for GroupPassengerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupPassengerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerReference" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SegmentRepetitionControlTypeI"/>
 *         &lt;element name="travellersID" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SpecificTravellerTypeI" minOccurs="0"/>
 *         &lt;element name="psgDetailsInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="discountPtc" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareInformationTypeI_133428S"/>
 *                   &lt;element name="flequentFlyerDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
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
@XmlType(name = "GroupPassengerDetailsType", propOrder = {
    "passengerReference",
    "travellersID",
    "psgDetailsInfo"
})
public class GroupPassengerDetailsType {

    @XmlElement(required = true)
    protected SegmentRepetitionControlTypeI passengerReference;
    protected SpecificTravellerTypeI travellersID;
    @XmlElement(required = true)
    protected GroupPassengerDetailsType.PsgDetailsInfo psgDetailsInfo;

    /**
     * Gets the value of the passengerReference property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentRepetitionControlTypeI }
     *     
     */
    public SegmentRepetitionControlTypeI getPassengerReference() {
        return passengerReference;
    }

    /**
     * Sets the value of the passengerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentRepetitionControlTypeI }
     *     
     */
    public void setPassengerReference(SegmentRepetitionControlTypeI value) {
        this.passengerReference = value;
    }

    /**
     * Gets the value of the travellersID property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificTravellerTypeI }
     *     
     */
    public SpecificTravellerTypeI getTravellersID() {
        return travellersID;
    }

    /**
     * Sets the value of the travellersID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificTravellerTypeI }
     *     
     */
    public void setTravellersID(SpecificTravellerTypeI value) {
        this.travellersID = value;
    }

    /**
     * Gets the value of the psgDetailsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GroupPassengerDetailsType.PsgDetailsInfo }
     *     
     */
    public GroupPassengerDetailsType.PsgDetailsInfo getPsgDetailsInfo() {
        return psgDetailsInfo;
    }

    /**
     * Sets the value of the psgDetailsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupPassengerDetailsType.PsgDetailsInfo }
     *     
     */
    public void setPsgDetailsInfo(GroupPassengerDetailsType.PsgDetailsInfo value) {
        this.psgDetailsInfo = value;
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
     *         &lt;element name="discountPtc" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareInformationTypeI_133428S"/>
     *         &lt;element name="flequentFlyerDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
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
        "discountPtc",
        "flequentFlyerDetails"
    })
    public static class PsgDetailsInfo {

        @XmlElement(required = true)
        protected FareInformationTypeI133428S discountPtc;
        protected FrequentTravellerIdentificationCodeType flequentFlyerDetails;

        /**
         * Gets the value of the discountPtc property.
         * 
         * @return
         *     possible object is
         *     {@link FareInformationTypeI133428S }
         *     
         */
        public FareInformationTypeI133428S getDiscountPtc() {
            return discountPtc;
        }

        /**
         * Sets the value of the discountPtc property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareInformationTypeI133428S }
         *     
         */
        public void setDiscountPtc(FareInformationTypeI133428S value) {
            this.discountPtc = value;
        }

        /**
         * Gets the value of the flequentFlyerDetails property.
         * 
         * @return
         *     possible object is
         *     {@link FrequentTravellerIdentificationCodeType }
         *     
         */
        public FrequentTravellerIdentificationCodeType getFlequentFlyerDetails() {
            return flequentFlyerDetails;
        }

        /**
         * Sets the value of the flequentFlyerDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link FrequentTravellerIdentificationCodeType }
         *     
         */
        public void setFlequentFlyerDetails(FrequentTravellerIdentificationCodeType value) {
            this.flequentFlyerDetails = value;
        }

    }

}
