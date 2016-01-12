
package com.amadeus.xml.smpres_13_1_ia;

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
 *         &lt;element name="responseDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}ResponseAnalysisDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="errorInformation" type="{http://xml.amadeus.com/SMPRES_13_1_IA}ErrorInformationTypeI" minOccurs="0"/>
 *         &lt;element name="warningInformation" type="{http://xml.amadeus.com/SMPRES_13_1_IA}WarningInformationTypeI" minOccurs="0"/>
 *         &lt;element name="seatRequestParameters" type="{http://xml.amadeus.com/SMPRES_13_1_IA}SeatRequestParametersTypeI" minOccurs="0"/>
 *         &lt;element name="seatmapInformation" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flightDateInformation" type="{http://xml.amadeus.com/SMPRES_13_1_IA}TravelProductInformationTypeI"/>
 *                   &lt;element name="seatmapErrorInfo" type="{http://xml.amadeus.com/SMPRES_13_1_IA}ErrorInformationTypeI" minOccurs="0"/>
 *                   &lt;element name="seatmapWarningInfo" type="{http://xml.amadeus.com/SMPRES_13_1_IA}WarningInformationTypeI" minOccurs="0"/>
 *                   &lt;element name="additionalProductInfo" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AdditionalProductDetailsTypeI" minOccurs="0"/>
 *                   &lt;element name="equipmentInformation" type="{http://xml.amadeus.com/SMPRES_13_1_IA}EquipmentInfoTypeI" minOccurs="0"/>
 *                   &lt;element name="cabin" maxOccurs="9" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="compartmentDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}CabinDetailsTypeI"/>
 *                             &lt;element name="cabinFacilities" type="{http://xml.amadeus.com/SMPRES_13_1_IA}CabinFacilitiesTypeI" maxOccurs="9" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="row" maxOccurs="999" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="rowDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}RowDetailsTypeI"/>
 *                             &lt;element name="cabinFacility" type="{http://xml.amadeus.com/SMPRES_13_1_IA}CabinFacilitiesTypeI" maxOccurs="9" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="freeText" type="{http://xml.amadeus.com/SMPRES_13_1_IA}InteractiveFreeTextTypeI" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="customerCentricData" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dummy" type="{http://xml.amadeus.com/SMPRES_13_1_IA}DummySegmentTypeI"/>
 *                             &lt;element name="travellerDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}TravellerInformationTypeI" maxOccurs="99" minOccurs="0"/>
 *                             &lt;element name="seatPrice" maxOccurs="999">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="seatPrice" type="{http://xml.amadeus.com/SMPRES_13_1_IA}MonetaryInformationTypeI"/>
 *                                       &lt;element name="taxDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}TaxTypeI" minOccurs="0"/>
 *                                       &lt;element name="rowDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}RowDetailsTypeI_168302S" maxOccurs="999"/>
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
    "responseDetails",
    "errorInformation",
    "warningInformation",
    "seatRequestParameters",
    "seatmapInformation"
})
@XmlRootElement(name = "Air_RetrieveSeatMapReply")
public class AirRetrieveSeatMapReply {

    protected ResponseAnalysisDetailsTypeI responseDetails;
    protected ErrorInformationTypeI errorInformation;
    protected WarningInformationTypeI warningInformation;
    protected SeatRequestParametersTypeI seatRequestParameters;
    protected List<AirRetrieveSeatMapReply.SeatmapInformation> seatmapInformation;

    /**
     * Gets the value of the responseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseAnalysisDetailsTypeI }
     *     
     */
    public ResponseAnalysisDetailsTypeI getResponseDetails() {
        return responseDetails;
    }

    /**
     * Sets the value of the responseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseAnalysisDetailsTypeI }
     *     
     */
    public void setResponseDetails(ResponseAnalysisDetailsTypeI value) {
        this.responseDetails = value;
    }

    /**
     * Gets the value of the errorInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorInformationTypeI }
     *     
     */
    public ErrorInformationTypeI getErrorInformation() {
        return errorInformation;
    }

    /**
     * Sets the value of the errorInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorInformationTypeI }
     *     
     */
    public void setErrorInformation(ErrorInformationTypeI value) {
        this.errorInformation = value;
    }

    /**
     * Gets the value of the warningInformation property.
     * 
     * @return
     *     possible object is
     *     {@link WarningInformationTypeI }
     *     
     */
    public WarningInformationTypeI getWarningInformation() {
        return warningInformation;
    }

    /**
     * Sets the value of the warningInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningInformationTypeI }
     *     
     */
    public void setWarningInformation(WarningInformationTypeI value) {
        this.warningInformation = value;
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
     * Gets the value of the seatmapInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatmapInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatmapInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirRetrieveSeatMapReply.SeatmapInformation }
     * 
     * 
     */
    public List<AirRetrieveSeatMapReply.SeatmapInformation> getSeatmapInformation() {
        if (seatmapInformation == null) {
            seatmapInformation = new ArrayList<AirRetrieveSeatMapReply.SeatmapInformation>();
        }
        return this.seatmapInformation;
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
     *         &lt;element name="flightDateInformation" type="{http://xml.amadeus.com/SMPRES_13_1_IA}TravelProductInformationTypeI"/>
     *         &lt;element name="seatmapErrorInfo" type="{http://xml.amadeus.com/SMPRES_13_1_IA}ErrorInformationTypeI" minOccurs="0"/>
     *         &lt;element name="seatmapWarningInfo" type="{http://xml.amadeus.com/SMPRES_13_1_IA}WarningInformationTypeI" minOccurs="0"/>
     *         &lt;element name="additionalProductInfo" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AdditionalProductDetailsTypeI" minOccurs="0"/>
     *         &lt;element name="equipmentInformation" type="{http://xml.amadeus.com/SMPRES_13_1_IA}EquipmentInfoTypeI" minOccurs="0"/>
     *         &lt;element name="cabin" maxOccurs="9" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="compartmentDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}CabinDetailsTypeI"/>
     *                   &lt;element name="cabinFacilities" type="{http://xml.amadeus.com/SMPRES_13_1_IA}CabinFacilitiesTypeI" maxOccurs="9" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="row" maxOccurs="999" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="rowDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}RowDetailsTypeI"/>
     *                   &lt;element name="cabinFacility" type="{http://xml.amadeus.com/SMPRES_13_1_IA}CabinFacilitiesTypeI" maxOccurs="9" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="freeText" type="{http://xml.amadeus.com/SMPRES_13_1_IA}InteractiveFreeTextTypeI" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="customerCentricData" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dummy" type="{http://xml.amadeus.com/SMPRES_13_1_IA}DummySegmentTypeI"/>
     *                   &lt;element name="travellerDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}TravellerInformationTypeI" maxOccurs="99" minOccurs="0"/>
     *                   &lt;element name="seatPrice" maxOccurs="999">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="seatPrice" type="{http://xml.amadeus.com/SMPRES_13_1_IA}MonetaryInformationTypeI"/>
     *                             &lt;element name="taxDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}TaxTypeI" minOccurs="0"/>
     *                             &lt;element name="rowDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}RowDetailsTypeI_168302S" maxOccurs="999"/>
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
        "flightDateInformation",
        "seatmapErrorInfo",
        "seatmapWarningInfo",
        "additionalProductInfo",
        "equipmentInformation",
        "cabin",
        "row",
        "freeText",
        "customerCentricData"
    })
    public static class SeatmapInformation {

        @XmlElement(required = true)
        protected TravelProductInformationTypeI flightDateInformation;
        protected ErrorInformationTypeI seatmapErrorInfo;
        protected WarningInformationTypeI seatmapWarningInfo;
        protected AdditionalProductDetailsTypeI additionalProductInfo;
        protected EquipmentInfoTypeI equipmentInformation;
        protected List<AirRetrieveSeatMapReply.SeatmapInformation.Cabin> cabin;
        protected List<AirRetrieveSeatMapReply.SeatmapInformation.Row> row;
        protected List<InteractiveFreeTextTypeI> freeText;
        protected List<AirRetrieveSeatMapReply.SeatmapInformation.CustomerCentricData> customerCentricData;

        /**
         * Gets the value of the flightDateInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TravelProductInformationTypeI }
         *     
         */
        public TravelProductInformationTypeI getFlightDateInformation() {
            return flightDateInformation;
        }

        /**
         * Sets the value of the flightDateInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelProductInformationTypeI }
         *     
         */
        public void setFlightDateInformation(TravelProductInformationTypeI value) {
            this.flightDateInformation = value;
        }

        /**
         * Gets the value of the seatmapErrorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ErrorInformationTypeI }
         *     
         */
        public ErrorInformationTypeI getSeatmapErrorInfo() {
            return seatmapErrorInfo;
        }

        /**
         * Sets the value of the seatmapErrorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorInformationTypeI }
         *     
         */
        public void setSeatmapErrorInfo(ErrorInformationTypeI value) {
            this.seatmapErrorInfo = value;
        }

        /**
         * Gets the value of the seatmapWarningInfo property.
         * 
         * @return
         *     possible object is
         *     {@link WarningInformationTypeI }
         *     
         */
        public WarningInformationTypeI getSeatmapWarningInfo() {
            return seatmapWarningInfo;
        }

        /**
         * Sets the value of the seatmapWarningInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link WarningInformationTypeI }
         *     
         */
        public void setSeatmapWarningInfo(WarningInformationTypeI value) {
            this.seatmapWarningInfo = value;
        }

        /**
         * Gets the value of the additionalProductInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalProductDetailsTypeI }
         *     
         */
        public AdditionalProductDetailsTypeI getAdditionalProductInfo() {
            return additionalProductInfo;
        }

        /**
         * Sets the value of the additionalProductInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalProductDetailsTypeI }
         *     
         */
        public void setAdditionalProductInfo(AdditionalProductDetailsTypeI value) {
            this.additionalProductInfo = value;
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
         * Gets the value of the cabin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirRetrieveSeatMapReply.SeatmapInformation.Cabin }
         * 
         * 
         */
        public List<AirRetrieveSeatMapReply.SeatmapInformation.Cabin> getCabin() {
            if (cabin == null) {
                cabin = new ArrayList<AirRetrieveSeatMapReply.SeatmapInformation.Cabin>();
            }
            return this.cabin;
        }

        /**
         * Gets the value of the row property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the row property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirRetrieveSeatMapReply.SeatmapInformation.Row }
         * 
         * 
         */
        public List<AirRetrieveSeatMapReply.SeatmapInformation.Row> getRow() {
            if (row == null) {
                row = new ArrayList<AirRetrieveSeatMapReply.SeatmapInformation.Row>();
            }
            return this.row;
        }

        /**
         * Gets the value of the freeText property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the freeText property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFreeText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InteractiveFreeTextTypeI }
         * 
         * 
         */
        public List<InteractiveFreeTextTypeI> getFreeText() {
            if (freeText == null) {
                freeText = new ArrayList<InteractiveFreeTextTypeI>();
            }
            return this.freeText;
        }

        /**
         * Gets the value of the customerCentricData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customerCentricData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomerCentricData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirRetrieveSeatMapReply.SeatmapInformation.CustomerCentricData }
         * 
         * 
         */
        public List<AirRetrieveSeatMapReply.SeatmapInformation.CustomerCentricData> getCustomerCentricData() {
            if (customerCentricData == null) {
                customerCentricData = new ArrayList<AirRetrieveSeatMapReply.SeatmapInformation.CustomerCentricData>();
            }
            return this.customerCentricData;
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
         *         &lt;element name="compartmentDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}CabinDetailsTypeI"/>
         *         &lt;element name="cabinFacilities" type="{http://xml.amadeus.com/SMPRES_13_1_IA}CabinFacilitiesTypeI" maxOccurs="9" minOccurs="0"/>
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
            "compartmentDetails",
            "cabinFacilities"
        })
        public static class Cabin {

            @XmlElement(required = true)
            protected CabinDetailsTypeI compartmentDetails;
            protected List<CabinFacilitiesTypeI> cabinFacilities;

            /**
             * Gets the value of the compartmentDetails property.
             * 
             * @return
             *     possible object is
             *     {@link CabinDetailsTypeI }
             *     
             */
            public CabinDetailsTypeI getCompartmentDetails() {
                return compartmentDetails;
            }

            /**
             * Sets the value of the compartmentDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link CabinDetailsTypeI }
             *     
             */
            public void setCompartmentDetails(CabinDetailsTypeI value) {
                this.compartmentDetails = value;
            }

            /**
             * Gets the value of the cabinFacilities property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cabinFacilities property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCabinFacilities().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CabinFacilitiesTypeI }
             * 
             * 
             */
            public List<CabinFacilitiesTypeI> getCabinFacilities() {
                if (cabinFacilities == null) {
                    cabinFacilities = new ArrayList<CabinFacilitiesTypeI>();
                }
                return this.cabinFacilities;
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
         *         &lt;element name="dummy" type="{http://xml.amadeus.com/SMPRES_13_1_IA}DummySegmentTypeI"/>
         *         &lt;element name="travellerDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}TravellerInformationTypeI" maxOccurs="99" minOccurs="0"/>
         *         &lt;element name="seatPrice" maxOccurs="999">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="seatPrice" type="{http://xml.amadeus.com/SMPRES_13_1_IA}MonetaryInformationTypeI"/>
         *                   &lt;element name="taxDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}TaxTypeI" minOccurs="0"/>
         *                   &lt;element name="rowDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}RowDetailsTypeI_168302S" maxOccurs="999"/>
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
            "dummy",
            "travellerDetails",
            "seatPrice"
        })
        public static class CustomerCentricData {

            @XmlElement(required = true)
            protected DummySegmentTypeI dummy;
            protected List<TravellerInformationTypeI> travellerDetails;
            @XmlElement(required = true)
            protected List<AirRetrieveSeatMapReply.SeatmapInformation.CustomerCentricData.SeatPrice> seatPrice;

            /**
             * Gets the value of the dummy property.
             * 
             * @return
             *     possible object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public DummySegmentTypeI getDummy() {
                return dummy;
            }

            /**
             * Sets the value of the dummy property.
             * 
             * @param value
             *     allowed object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public void setDummy(DummySegmentTypeI value) {
                this.dummy = value;
            }

            /**
             * Gets the value of the travellerDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the travellerDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTravellerDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TravellerInformationTypeI }
             * 
             * 
             */
            public List<TravellerInformationTypeI> getTravellerDetails() {
                if (travellerDetails == null) {
                    travellerDetails = new ArrayList<TravellerInformationTypeI>();
                }
                return this.travellerDetails;
            }

            /**
             * Gets the value of the seatPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the seatPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSeatPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirRetrieveSeatMapReply.SeatmapInformation.CustomerCentricData.SeatPrice }
             * 
             * 
             */
            public List<AirRetrieveSeatMapReply.SeatmapInformation.CustomerCentricData.SeatPrice> getSeatPrice() {
                if (seatPrice == null) {
                    seatPrice = new ArrayList<AirRetrieveSeatMapReply.SeatmapInformation.CustomerCentricData.SeatPrice>();
                }
                return this.seatPrice;
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
             *         &lt;element name="seatPrice" type="{http://xml.amadeus.com/SMPRES_13_1_IA}MonetaryInformationTypeI"/>
             *         &lt;element name="taxDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}TaxTypeI" minOccurs="0"/>
             *         &lt;element name="rowDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}RowDetailsTypeI_168302S" maxOccurs="999"/>
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
                "seatPrice",
                "taxDetails",
                "rowDetails"
            })
            public static class SeatPrice {

                @XmlElement(required = true)
                protected MonetaryInformationTypeI seatPrice;
                protected TaxTypeI taxDetails;
                @XmlElement(required = true)
                protected List<RowDetailsTypeI168302S> rowDetails;

                /**
                 * Gets the value of the seatPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI }
                 *     
                 */
                public MonetaryInformationTypeI getSeatPrice() {
                    return seatPrice;
                }

                /**
                 * Sets the value of the seatPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI }
                 *     
                 */
                public void setSeatPrice(MonetaryInformationTypeI value) {
                    this.seatPrice = value;
                }

                /**
                 * Gets the value of the taxDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TaxTypeI }
                 *     
                 */
                public TaxTypeI getTaxDetails() {
                    return taxDetails;
                }

                /**
                 * Sets the value of the taxDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TaxTypeI }
                 *     
                 */
                public void setTaxDetails(TaxTypeI value) {
                    this.taxDetails = value;
                }

                /**
                 * Gets the value of the rowDetails property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the rowDetails property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRowDetails().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link RowDetailsTypeI168302S }
                 * 
                 * 
                 */
                public List<RowDetailsTypeI168302S> getRowDetails() {
                    if (rowDetails == null) {
                        rowDetails = new ArrayList<RowDetailsTypeI168302S>();
                    }
                    return this.rowDetails;
                }

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
         *         &lt;element name="rowDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}RowDetailsTypeI"/>
         *         &lt;element name="cabinFacility" type="{http://xml.amadeus.com/SMPRES_13_1_IA}CabinFacilitiesTypeI" maxOccurs="9" minOccurs="0"/>
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
            "rowDetails",
            "cabinFacility"
        })
        public static class Row {

            @XmlElement(required = true)
            protected RowDetailsTypeI rowDetails;
            protected List<CabinFacilitiesTypeI> cabinFacility;

            /**
             * Gets the value of the rowDetails property.
             * 
             * @return
             *     possible object is
             *     {@link RowDetailsTypeI }
             *     
             */
            public RowDetailsTypeI getRowDetails() {
                return rowDetails;
            }

            /**
             * Sets the value of the rowDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link RowDetailsTypeI }
             *     
             */
            public void setRowDetails(RowDetailsTypeI value) {
                this.rowDetails = value;
            }

            /**
             * Gets the value of the cabinFacility property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cabinFacility property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCabinFacility().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CabinFacilitiesTypeI }
             * 
             * 
             */
            public List<CabinFacilitiesTypeI> getCabinFacility() {
                if (cabinFacility == null) {
                    cabinFacility = new ArrayList<CabinFacilitiesTypeI>();
                }
                return this.cabinFacility;
            }

        }

    }

}
