
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="passengerReference" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}SegmentRepetitionControlTypeI"/>
 *         &lt;element name="psgDetailsInfo" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="discountPtc" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}FareInformationTypeI"/>
 *                   &lt;element name="flequentFlyerDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
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
    "psgDetailsInfo"
})
public class GroupPassengerDetailsType {

    @XmlElement(required = true)
    protected SegmentRepetitionControlTypeI passengerReference;
    protected List<GroupPassengerDetailsType.PsgDetailsInfo> psgDetailsInfo;

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
     * Gets the value of the psgDetailsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the psgDetailsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPsgDetailsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupPassengerDetailsType.PsgDetailsInfo }
     * 
     * 
     */
    public List<GroupPassengerDetailsType.PsgDetailsInfo> getPsgDetailsInfo() {
        if (psgDetailsInfo == null) {
            psgDetailsInfo = new ArrayList<GroupPassengerDetailsType.PsgDetailsInfo>();
        }
        return this.psgDetailsInfo;
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
     *         &lt;element name="discountPtc" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}FareInformationTypeI"/>
     *         &lt;element name="flequentFlyerDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
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
        protected FareInformationTypeI discountPtc;
        protected FrequentTravellerIdentificationCodeType flequentFlyerDetails;

        /**
         * Gets the value of the discountPtc property.
         * 
         * @return
         *     possible object is
         *     {@link FareInformationTypeI }
         *     
         */
        public FareInformationTypeI getDiscountPtc() {
            return discountPtc;
        }

        /**
         * Sets the value of the discountPtc property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareInformationTypeI }
         *     
         */
        public void setDiscountPtc(FareInformationTypeI value) {
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
