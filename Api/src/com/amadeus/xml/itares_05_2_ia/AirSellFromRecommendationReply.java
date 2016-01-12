
package com.amadeus.xml.itares_05_2_ia;

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
 *         &lt;element name="message" type="{http://xml.amadeus.com/ITARES_05_2_IA}MessageActionDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="errorAtMessageLevel" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="errorSegment" type="{http://xml.amadeus.com/ITARES_05_2_IA}ApplicationErrorInformationType"/>
 *                   &lt;element name="informationText" type="{http://xml.amadeus.com/ITARES_05_2_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="itineraryDetails" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="originDestination" type="{http://xml.amadeus.com/ITARES_05_2_IA}OriginAndDestinationDetailsTypeI"/>
 *                   &lt;element name="errorItinerarylevel" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="errorSegment" type="{http://xml.amadeus.com/ITARES_05_2_IA}ApplicationErrorInformationType"/>
 *                             &lt;element name="informationText" type="{http://xml.amadeus.com/ITARES_05_2_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="segmentInformation" maxOccurs="9" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="flightDetails" type="{http://xml.amadeus.com/ITARES_05_2_IA}TravelProductInformationTypeI"/>
 *                             &lt;element name="apdSegment" type="{http://xml.amadeus.com/ITARES_05_2_IA}AdditionalProductDetailsTypeI" minOccurs="0"/>
 *                             &lt;element name="actionDetails" type="{http://xml.amadeus.com/ITARES_05_2_IA}RelatedProductInformationTypeI"/>
 *                             &lt;element name="informationText" type="{http://xml.amadeus.com/ITARES_05_2_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                             &lt;element name="errorAtSegmentLevel" maxOccurs="5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="errorSegment" type="{http://xml.amadeus.com/ITARES_05_2_IA}ApplicationErrorInformationType"/>
 *                                       &lt;element name="informationText" type="{http://xml.amadeus.com/ITARES_05_2_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
    "message",
    "errorAtMessageLevel",
    "itineraryDetails"
})
@XmlRootElement(name = "Air_SellFromRecommendationReply")
public class AirSellFromRecommendationReply {

    protected MessageActionDetailsTypeI message;
    protected List<AirSellFromRecommendationReply.ErrorAtMessageLevel> errorAtMessageLevel;
    protected List<AirSellFromRecommendationReply.ItineraryDetails> itineraryDetails;

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
     * Gets the value of the errorAtMessageLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorAtMessageLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorAtMessageLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSellFromRecommendationReply.ErrorAtMessageLevel }
     * 
     * 
     */
    public List<AirSellFromRecommendationReply.ErrorAtMessageLevel> getErrorAtMessageLevel() {
        if (errorAtMessageLevel == null) {
            errorAtMessageLevel = new ArrayList<AirSellFromRecommendationReply.ErrorAtMessageLevel>();
        }
        return this.errorAtMessageLevel;
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
     * {@link AirSellFromRecommendationReply.ItineraryDetails }
     * 
     * 
     */
    public List<AirSellFromRecommendationReply.ItineraryDetails> getItineraryDetails() {
        if (itineraryDetails == null) {
            itineraryDetails = new ArrayList<AirSellFromRecommendationReply.ItineraryDetails>();
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
     *         &lt;element name="errorSegment" type="{http://xml.amadeus.com/ITARES_05_2_IA}ApplicationErrorInformationType"/>
     *         &lt;element name="informationText" type="{http://xml.amadeus.com/ITARES_05_2_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
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
        "errorSegment",
        "informationText"
    })
    public static class ErrorAtMessageLevel {

        @XmlElement(required = true)
        protected ApplicationErrorInformationType errorSegment;
        protected InteractiveFreeTextTypeI informationText;

        /**
         * Gets the value of the errorSegment property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationErrorInformationType }
         *     
         */
        public ApplicationErrorInformationType getErrorSegment() {
            return errorSegment;
        }

        /**
         * Sets the value of the errorSegment property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationErrorInformationType }
         *     
         */
        public void setErrorSegment(ApplicationErrorInformationType value) {
            this.errorSegment = value;
        }

        /**
         * Gets the value of the informationText property.
         * 
         * @return
         *     possible object is
         *     {@link InteractiveFreeTextTypeI }
         *     
         */
        public InteractiveFreeTextTypeI getInformationText() {
            return informationText;
        }

        /**
         * Sets the value of the informationText property.
         * 
         * @param value
         *     allowed object is
         *     {@link InteractiveFreeTextTypeI }
         *     
         */
        public void setInformationText(InteractiveFreeTextTypeI value) {
            this.informationText = value;
        }

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
     *         &lt;element name="originDestination" type="{http://xml.amadeus.com/ITARES_05_2_IA}OriginAndDestinationDetailsTypeI"/>
     *         &lt;element name="errorItinerarylevel" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="errorSegment" type="{http://xml.amadeus.com/ITARES_05_2_IA}ApplicationErrorInformationType"/>
     *                   &lt;element name="informationText" type="{http://xml.amadeus.com/ITARES_05_2_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="segmentInformation" maxOccurs="9" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="flightDetails" type="{http://xml.amadeus.com/ITARES_05_2_IA}TravelProductInformationTypeI"/>
     *                   &lt;element name="apdSegment" type="{http://xml.amadeus.com/ITARES_05_2_IA}AdditionalProductDetailsTypeI" minOccurs="0"/>
     *                   &lt;element name="actionDetails" type="{http://xml.amadeus.com/ITARES_05_2_IA}RelatedProductInformationTypeI"/>
     *                   &lt;element name="informationText" type="{http://xml.amadeus.com/ITARES_05_2_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
     *                   &lt;element name="errorAtSegmentLevel" maxOccurs="5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="errorSegment" type="{http://xml.amadeus.com/ITARES_05_2_IA}ApplicationErrorInformationType"/>
     *                             &lt;element name="informationText" type="{http://xml.amadeus.com/ITARES_05_2_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
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
        "originDestination",
        "errorItinerarylevel",
        "segmentInformation"
    })
    public static class ItineraryDetails {

        @XmlElement(required = true)
        protected OriginAndDestinationDetailsTypeI originDestination;
        protected List<AirSellFromRecommendationReply.ItineraryDetails.ErrorItinerarylevel> errorItinerarylevel;
        protected List<AirSellFromRecommendationReply.ItineraryDetails.SegmentInformation> segmentInformation;

        /**
         * Gets the value of the originDestination property.
         * 
         * @return
         *     possible object is
         *     {@link OriginAndDestinationDetailsTypeI }
         *     
         */
        public OriginAndDestinationDetailsTypeI getOriginDestination() {
            return originDestination;
        }

        /**
         * Sets the value of the originDestination property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginAndDestinationDetailsTypeI }
         *     
         */
        public void setOriginDestination(OriginAndDestinationDetailsTypeI value) {
            this.originDestination = value;
        }

        /**
         * Gets the value of the errorItinerarylevel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the errorItinerarylevel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getErrorItinerarylevel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirSellFromRecommendationReply.ItineraryDetails.ErrorItinerarylevel }
         * 
         * 
         */
        public List<AirSellFromRecommendationReply.ItineraryDetails.ErrorItinerarylevel> getErrorItinerarylevel() {
            if (errorItinerarylevel == null) {
                errorItinerarylevel = new ArrayList<AirSellFromRecommendationReply.ItineraryDetails.ErrorItinerarylevel>();
            }
            return this.errorItinerarylevel;
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
         * {@link AirSellFromRecommendationReply.ItineraryDetails.SegmentInformation }
         * 
         * 
         */
        public List<AirSellFromRecommendationReply.ItineraryDetails.SegmentInformation> getSegmentInformation() {
            if (segmentInformation == null) {
                segmentInformation = new ArrayList<AirSellFromRecommendationReply.ItineraryDetails.SegmentInformation>();
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
         *         &lt;element name="errorSegment" type="{http://xml.amadeus.com/ITARES_05_2_IA}ApplicationErrorInformationType"/>
         *         &lt;element name="informationText" type="{http://xml.amadeus.com/ITARES_05_2_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
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
            "errorSegment",
            "informationText"
        })
        public static class ErrorItinerarylevel {

            @XmlElement(required = true)
            protected ApplicationErrorInformationType errorSegment;
            protected InteractiveFreeTextTypeI informationText;

            /**
             * Gets the value of the errorSegment property.
             * 
             * @return
             *     possible object is
             *     {@link ApplicationErrorInformationType }
             *     
             */
            public ApplicationErrorInformationType getErrorSegment() {
                return errorSegment;
            }

            /**
             * Sets the value of the errorSegment property.
             * 
             * @param value
             *     allowed object is
             *     {@link ApplicationErrorInformationType }
             *     
             */
            public void setErrorSegment(ApplicationErrorInformationType value) {
                this.errorSegment = value;
            }

            /**
             * Gets the value of the informationText property.
             * 
             * @return
             *     possible object is
             *     {@link InteractiveFreeTextTypeI }
             *     
             */
            public InteractiveFreeTextTypeI getInformationText() {
                return informationText;
            }

            /**
             * Sets the value of the informationText property.
             * 
             * @param value
             *     allowed object is
             *     {@link InteractiveFreeTextTypeI }
             *     
             */
            public void setInformationText(InteractiveFreeTextTypeI value) {
                this.informationText = value;
            }

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
         *         &lt;element name="flightDetails" type="{http://xml.amadeus.com/ITARES_05_2_IA}TravelProductInformationTypeI"/>
         *         &lt;element name="apdSegment" type="{http://xml.amadeus.com/ITARES_05_2_IA}AdditionalProductDetailsTypeI" minOccurs="0"/>
         *         &lt;element name="actionDetails" type="{http://xml.amadeus.com/ITARES_05_2_IA}RelatedProductInformationTypeI"/>
         *         &lt;element name="informationText" type="{http://xml.amadeus.com/ITARES_05_2_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
         *         &lt;element name="errorAtSegmentLevel" maxOccurs="5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="errorSegment" type="{http://xml.amadeus.com/ITARES_05_2_IA}ApplicationErrorInformationType"/>
         *                   &lt;element name="informationText" type="{http://xml.amadeus.com/ITARES_05_2_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
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
            "flightDetails",
            "apdSegment",
            "actionDetails",
            "informationText",
            "errorAtSegmentLevel"
        })
        public static class SegmentInformation {

            @XmlElement(required = true)
            protected TravelProductInformationTypeI flightDetails;
            protected AdditionalProductDetailsTypeI apdSegment;
            @XmlElement(required = true)
            protected RelatedProductInformationTypeI actionDetails;
            protected InteractiveFreeTextTypeI informationText;
            protected List<AirSellFromRecommendationReply.ItineraryDetails.SegmentInformation.ErrorAtSegmentLevel> errorAtSegmentLevel;

            /**
             * Gets the value of the flightDetails property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformationTypeI }
             *     
             */
            public TravelProductInformationTypeI getFlightDetails() {
                return flightDetails;
            }

            /**
             * Sets the value of the flightDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformationTypeI }
             *     
             */
            public void setFlightDetails(TravelProductInformationTypeI value) {
                this.flightDetails = value;
            }

            /**
             * Gets the value of the apdSegment property.
             * 
             * @return
             *     possible object is
             *     {@link AdditionalProductDetailsTypeI }
             *     
             */
            public AdditionalProductDetailsTypeI getApdSegment() {
                return apdSegment;
            }

            /**
             * Sets the value of the apdSegment property.
             * 
             * @param value
             *     allowed object is
             *     {@link AdditionalProductDetailsTypeI }
             *     
             */
            public void setApdSegment(AdditionalProductDetailsTypeI value) {
                this.apdSegment = value;
            }

            /**
             * Gets the value of the actionDetails property.
             * 
             * @return
             *     possible object is
             *     {@link RelatedProductInformationTypeI }
             *     
             */
            public RelatedProductInformationTypeI getActionDetails() {
                return actionDetails;
            }

            /**
             * Sets the value of the actionDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link RelatedProductInformationTypeI }
             *     
             */
            public void setActionDetails(RelatedProductInformationTypeI value) {
                this.actionDetails = value;
            }

            /**
             * Gets the value of the informationText property.
             * 
             * @return
             *     possible object is
             *     {@link InteractiveFreeTextTypeI }
             *     
             */
            public InteractiveFreeTextTypeI getInformationText() {
                return informationText;
            }

            /**
             * Sets the value of the informationText property.
             * 
             * @param value
             *     allowed object is
             *     {@link InteractiveFreeTextTypeI }
             *     
             */
            public void setInformationText(InteractiveFreeTextTypeI value) {
                this.informationText = value;
            }

            /**
             * Gets the value of the errorAtSegmentLevel property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the errorAtSegmentLevel property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getErrorAtSegmentLevel().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirSellFromRecommendationReply.ItineraryDetails.SegmentInformation.ErrorAtSegmentLevel }
             * 
             * 
             */
            public List<AirSellFromRecommendationReply.ItineraryDetails.SegmentInformation.ErrorAtSegmentLevel> getErrorAtSegmentLevel() {
                if (errorAtSegmentLevel == null) {
                    errorAtSegmentLevel = new ArrayList<AirSellFromRecommendationReply.ItineraryDetails.SegmentInformation.ErrorAtSegmentLevel>();
                }
                return this.errorAtSegmentLevel;
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
             *         &lt;element name="errorSegment" type="{http://xml.amadeus.com/ITARES_05_2_IA}ApplicationErrorInformationType"/>
             *         &lt;element name="informationText" type="{http://xml.amadeus.com/ITARES_05_2_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
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
                "errorSegment",
                "informationText"
            })
            public static class ErrorAtSegmentLevel {

                @XmlElement(required = true)
                protected ApplicationErrorInformationType errorSegment;
                protected InteractiveFreeTextTypeI informationText;

                /**
                 * Gets the value of the errorSegment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ApplicationErrorInformationType }
                 *     
                 */
                public ApplicationErrorInformationType getErrorSegment() {
                    return errorSegment;
                }

                /**
                 * Sets the value of the errorSegment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ApplicationErrorInformationType }
                 *     
                 */
                public void setErrorSegment(ApplicationErrorInformationType value) {
                    this.errorSegment = value;
                }

                /**
                 * Gets the value of the informationText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InteractiveFreeTextTypeI }
                 *     
                 */
                public InteractiveFreeTextTypeI getInformationText() {
                    return informationText;
                }

                /**
                 * Sets the value of the informationText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InteractiveFreeTextTypeI }
                 *     
                 */
                public void setInformationText(InteractiveFreeTextTypeI value) {
                    this.informationText = value;
                }

            }

        }

    }

}
