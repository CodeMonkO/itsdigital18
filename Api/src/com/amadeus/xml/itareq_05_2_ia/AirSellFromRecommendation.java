
package com.amadeus.xml.itareq_05_2_ia;

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
 *         &lt;element name="messageActionDetails" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}MessageActionDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="recordLocator" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}ReservationControlInformationTypeI" minOccurs="0"/>
 *         &lt;element name="itineraryDetails" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="originDestinationDetails" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}OriginAndDestinationDetailsTypeI"/>
 *                   &lt;element name="message" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}MessageActionDetailsTypeI" minOccurs="0"/>
 *                   &lt;element name="segmentInformation" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="travelProductInformation" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}TravelProductInformationTypeI"/>
 *                             &lt;element name="relatedproductInformation" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}RelatedProductInformationTypeI"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "messageActionDetails",
    "recordLocator",
    "itineraryDetails"
})
@XmlRootElement(name = "Air_SellFromRecommendation")
public class AirSellFromRecommendation {

    protected MessageActionDetailsTypeI messageActionDetails;
    protected ReservationControlInformationTypeI recordLocator;
    protected List<AirSellFromRecommendation.ItineraryDetails> itineraryDetails;

    /**
     * Gets the value of the messageActionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MessageActionDetailsTypeI }
     *     
     */
    public MessageActionDetailsTypeI getMessageActionDetails() {
        return messageActionDetails;
    }

    /**
     * Sets the value of the messageActionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageActionDetailsTypeI }
     *     
     */
    public void setMessageActionDetails(MessageActionDetailsTypeI value) {
        this.messageActionDetails = value;
    }

    /**
     * Gets the value of the recordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public ReservationControlInformationTypeI getRecordLocator() {
        return recordLocator;
    }

    /**
     * Sets the value of the recordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public void setRecordLocator(ReservationControlInformationTypeI value) {
        this.recordLocator = value;
    }

    /**
     * Gets the value of the itineraryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSellFromRecommendation.ItineraryDetails }
     * 
     * 
     */
    public List<AirSellFromRecommendation.ItineraryDetails> getItineraryDetails() {
        if (itineraryDetails == null) {
            itineraryDetails = new ArrayList<AirSellFromRecommendation.ItineraryDetails>();
        }
        return this.itineraryDetails;
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
     *         &lt;element name="originDestinationDetails" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}OriginAndDestinationDetailsTypeI"/>
     *         &lt;element name="message" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}MessageActionDetailsTypeI" minOccurs="0"/>
     *         &lt;element name="segmentInformation" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="travelProductInformation" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}TravelProductInformationTypeI"/>
     *                   &lt;element name="relatedproductInformation" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}RelatedProductInformationTypeI"/>
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
        "originDestinationDetails",
        "message",
        "segmentInformation"
    })
    public static class ItineraryDetails {

        @XmlElement(required = true)
        protected OriginAndDestinationDetailsTypeI originDestinationDetails;
        protected MessageActionDetailsTypeI message;
        @XmlElement(required = true)
        protected List<AirSellFromRecommendation.ItineraryDetails.SegmentInformation> segmentInformation;

        /**
         * Gets the value of the originDestinationDetails property.
         * 
         * @return
         *     possible object is
         *     {@link OriginAndDestinationDetailsTypeI }
         *     
         */
        public OriginAndDestinationDetailsTypeI getOriginDestinationDetails() {
            return originDestinationDetails;
        }

        /**
         * Sets the value of the originDestinationDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginAndDestinationDetailsTypeI }
         *     
         */
        public void setOriginDestinationDetails(OriginAndDestinationDetailsTypeI value) {
            this.originDestinationDetails = value;
        }

        /**
         * Gets the value of the message property.
         * 
         * @return
         *     possible object is
         *     {@link MessageActionDetailsTypeI }
         *     
         */
        public MessageActionDetailsTypeI getMessage() {
            return message;
        }

        /**
         * Sets the value of the message property.
         * 
         * @param value
         *     allowed object is
         *     {@link MessageActionDetailsTypeI }
         *     
         */
        public void setMessage(MessageActionDetailsTypeI value) {
            this.message = value;
        }

        /**
         * Gets the value of the segmentInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirSellFromRecommendation.ItineraryDetails.SegmentInformation }
         * 
         * 
         */
        public List<AirSellFromRecommendation.ItineraryDetails.SegmentInformation> getSegmentInformation() {
            if (segmentInformation == null) {
                segmentInformation = new ArrayList<AirSellFromRecommendation.ItineraryDetails.SegmentInformation>();
            }
            return this.segmentInformation;
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
         *         &lt;element name="travelProductInformation" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}TravelProductInformationTypeI"/>
         *         &lt;element name="relatedproductInformation" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}RelatedProductInformationTypeI"/>
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
            "travelProductInformation",
            "relatedproductInformation"
        })
        public static class SegmentInformation {

            @XmlElement(required = true)
            protected TravelProductInformationTypeI travelProductInformation;
            @XmlElement(required = true)
            protected RelatedProductInformationTypeI relatedproductInformation;

            /**
             * Gets the value of the travelProductInformation property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformationTypeI }
             *     
             */
            public TravelProductInformationTypeI getTravelProductInformation() {
                return travelProductInformation;
            }

            /**
             * Sets the value of the travelProductInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformationTypeI }
             *     
             */
            public void setTravelProductInformation(TravelProductInformationTypeI value) {
                this.travelProductInformation = value;
            }

            /**
             * Gets the value of the relatedproductInformation property.
             * 
             * @return
             *     possible object is
             *     {@link RelatedProductInformationTypeI }
             *     
             */
            public RelatedProductInformationTypeI getRelatedproductInformation() {
                return relatedproductInformation;
            }

            /**
             * Sets the value of the relatedproductInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link RelatedProductInformationTypeI }
             *     
             */
            public void setRelatedproductInformation(RelatedProductInformationTypeI value) {
                this.relatedproductInformation = value;
            }

        }

    }

}
