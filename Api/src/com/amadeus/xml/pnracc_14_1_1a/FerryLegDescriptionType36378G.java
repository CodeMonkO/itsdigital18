
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FerryLegDescriptionType_36378G complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FerryLegDescriptionType_36378G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sailingDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TravelProductInformationTypeU_24954S"/>
 *         &lt;element name="shipDescription" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ShipIdentificationType_24553S" minOccurs="0"/>
 *         &lt;element name="sailingLegCheckInInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_21109S" minOccurs="0"/>
 *         &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ReferenceInformationTypeI_25132S" minOccurs="0"/>
 *         &lt;element name="priceInfoGroup" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="routePriceInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TariffInformationTypeU_129133S"/>
 *                   &lt;element name="passengerCategoryType" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AttributeTypeU"/>
 *                   &lt;element name="numberOfPassengers" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumberOfUnitsType_20156S"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="vehicleInfoGroup" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vehicleInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}VehicleTypeU"/>
 *                   &lt;element name="numberOfBicycles" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumberOfUnitsType_20156S" minOccurs="0"/>
 *                   &lt;element name="vehicleRoutePrice" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TariffInformationTypeU_129133S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="serviceInfoGroup" maxOccurs="18" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AttributeTypeU_20529S"/>
 *                   &lt;element name="numberOfServices" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumberOfUnitsType_20156S" minOccurs="0"/>
 *                   &lt;element name="serviceRoutePrice" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TariffInformationTypeU_129133S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="animalInfoGroup" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="animalInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SpecificDataInformationTypeI"/>
 *                   &lt;element name="animalRoutePrice" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TariffInformationTypeU_129133S" minOccurs="0"/>
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
@XmlType(name = "FerryLegDescriptionType_36378G", propOrder = {
    "sailingDetails",
    "shipDescription",
    "sailingLegCheckInInformation",
    "passengerAssociation",
    "priceInfoGroup",
    "vehicleInfoGroup",
    "serviceInfoGroup",
    "animalInfoGroup"
})
public class FerryLegDescriptionType36378G {

    @XmlElement(required = true)
    protected TravelProductInformationTypeU24954S sailingDetails;
    protected ShipIdentificationType24553S shipDescription;
    protected StructuredDateTimeInformationType21109S sailingLegCheckInInformation;
    protected ReferenceInformationTypeI25132S passengerAssociation;
    protected List<FerryLegDescriptionType36378G.PriceInfoGroup> priceInfoGroup;
    protected List<FerryLegDescriptionType36378G.VehicleInfoGroup> vehicleInfoGroup;
    protected List<FerryLegDescriptionType36378G.ServiceInfoGroup> serviceInfoGroup;
    protected List<FerryLegDescriptionType36378G.AnimalInfoGroup> animalInfoGroup;

    /**
     * Gets the value of the sailingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationTypeU24954S }
     *     
     */
    public TravelProductInformationTypeU24954S getSailingDetails() {
        return sailingDetails;
    }

    /**
     * Sets the value of the sailingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationTypeU24954S }
     *     
     */
    public void setSailingDetails(TravelProductInformationTypeU24954S value) {
        this.sailingDetails = value;
    }

    /**
     * Gets the value of the shipDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ShipIdentificationType24553S }
     *     
     */
    public ShipIdentificationType24553S getShipDescription() {
        return shipDescription;
    }

    /**
     * Sets the value of the shipDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipIdentificationType24553S }
     *     
     */
    public void setShipDescription(ShipIdentificationType24553S value) {
        this.shipDescription = value;
    }

    /**
     * Gets the value of the sailingLegCheckInInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType21109S }
     *     
     */
    public StructuredDateTimeInformationType21109S getSailingLegCheckInInformation() {
        return sailingLegCheckInInformation;
    }

    /**
     * Sets the value of the sailingLegCheckInInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType21109S }
     *     
     */
    public void setSailingLegCheckInInformation(StructuredDateTimeInformationType21109S value) {
        this.sailingLegCheckInInformation = value;
    }

    /**
     * Gets the value of the passengerAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformationTypeI25132S }
     *     
     */
    public ReferenceInformationTypeI25132S getPassengerAssociation() {
        return passengerAssociation;
    }

    /**
     * Sets the value of the passengerAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformationTypeI25132S }
     *     
     */
    public void setPassengerAssociation(ReferenceInformationTypeI25132S value) {
        this.passengerAssociation = value;
    }

    /**
     * Gets the value of the priceInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryLegDescriptionType36378G.PriceInfoGroup }
     * 
     * 
     */
    public List<FerryLegDescriptionType36378G.PriceInfoGroup> getPriceInfoGroup() {
        if (priceInfoGroup == null) {
            priceInfoGroup = new ArrayList<FerryLegDescriptionType36378G.PriceInfoGroup>();
        }
        return this.priceInfoGroup;
    }

    /**
     * Gets the value of the vehicleInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryLegDescriptionType36378G.VehicleInfoGroup }
     * 
     * 
     */
    public List<FerryLegDescriptionType36378G.VehicleInfoGroup> getVehicleInfoGroup() {
        if (vehicleInfoGroup == null) {
            vehicleInfoGroup = new ArrayList<FerryLegDescriptionType36378G.VehicleInfoGroup>();
        }
        return this.vehicleInfoGroup;
    }

    /**
     * Gets the value of the serviceInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryLegDescriptionType36378G.ServiceInfoGroup }
     * 
     * 
     */
    public List<FerryLegDescriptionType36378G.ServiceInfoGroup> getServiceInfoGroup() {
        if (serviceInfoGroup == null) {
            serviceInfoGroup = new ArrayList<FerryLegDescriptionType36378G.ServiceInfoGroup>();
        }
        return this.serviceInfoGroup;
    }

    /**
     * Gets the value of the animalInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryLegDescriptionType36378G.AnimalInfoGroup }
     * 
     * 
     */
    public List<FerryLegDescriptionType36378G.AnimalInfoGroup> getAnimalInfoGroup() {
        if (animalInfoGroup == null) {
            animalInfoGroup = new ArrayList<FerryLegDescriptionType36378G.AnimalInfoGroup>();
        }
        return this.animalInfoGroup;
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
     *         &lt;element name="animalInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SpecificDataInformationTypeI"/>
     *         &lt;element name="animalRoutePrice" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TariffInformationTypeU_129133S" minOccurs="0"/>
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
        "animalInformation",
        "animalRoutePrice"
    })
    public static class AnimalInfoGroup {

        @XmlElement(required = true)
        protected SpecificDataInformationTypeI animalInformation;
        protected TariffInformationTypeU129133S animalRoutePrice;

        /**
         * Gets the value of the animalInformation property.
         * 
         * @return
         *     possible object is
         *     {@link SpecificDataInformationTypeI }
         *     
         */
        public SpecificDataInformationTypeI getAnimalInformation() {
            return animalInformation;
        }

        /**
         * Sets the value of the animalInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecificDataInformationTypeI }
         *     
         */
        public void setAnimalInformation(SpecificDataInformationTypeI value) {
            this.animalInformation = value;
        }

        /**
         * Gets the value of the animalRoutePrice property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformationTypeU129133S }
         *     
         */
        public TariffInformationTypeU129133S getAnimalRoutePrice() {
            return animalRoutePrice;
        }

        /**
         * Sets the value of the animalRoutePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformationTypeU129133S }
         *     
         */
        public void setAnimalRoutePrice(TariffInformationTypeU129133S value) {
            this.animalRoutePrice = value;
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
     *         &lt;element name="routePriceInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TariffInformationTypeU_129133S"/>
     *         &lt;element name="passengerCategoryType" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AttributeTypeU"/>
     *         &lt;element name="numberOfPassengers" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumberOfUnitsType_20156S"/>
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
        "routePriceInformation",
        "passengerCategoryType",
        "numberOfPassengers"
    })
    public static class PriceInfoGroup {

        @XmlElement(required = true)
        protected TariffInformationTypeU129133S routePriceInformation;
        @XmlElement(required = true)
        protected AttributeTypeU passengerCategoryType;
        @XmlElement(required = true)
        protected NumberOfUnitsType20156S numberOfPassengers;

        /**
         * Gets the value of the routePriceInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformationTypeU129133S }
         *     
         */
        public TariffInformationTypeU129133S getRoutePriceInformation() {
            return routePriceInformation;
        }

        /**
         * Sets the value of the routePriceInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformationTypeU129133S }
         *     
         */
        public void setRoutePriceInformation(TariffInformationTypeU129133S value) {
            this.routePriceInformation = value;
        }

        /**
         * Gets the value of the passengerCategoryType property.
         * 
         * @return
         *     possible object is
         *     {@link AttributeTypeU }
         *     
         */
        public AttributeTypeU getPassengerCategoryType() {
            return passengerCategoryType;
        }

        /**
         * Sets the value of the passengerCategoryType property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributeTypeU }
         *     
         */
        public void setPassengerCategoryType(AttributeTypeU value) {
            this.passengerCategoryType = value;
        }

        /**
         * Gets the value of the numberOfPassengers property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType20156S }
         *     
         */
        public NumberOfUnitsType20156S getNumberOfPassengers() {
            return numberOfPassengers;
        }

        /**
         * Sets the value of the numberOfPassengers property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType20156S }
         *     
         */
        public void setNumberOfPassengers(NumberOfUnitsType20156S value) {
            this.numberOfPassengers = value;
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
     *         &lt;element name="serviceInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AttributeTypeU_20529S"/>
     *         &lt;element name="numberOfServices" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumberOfUnitsType_20156S" minOccurs="0"/>
     *         &lt;element name="serviceRoutePrice" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TariffInformationTypeU_129133S" minOccurs="0"/>
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
        "serviceInformation",
        "numberOfServices",
        "serviceRoutePrice"
    })
    public static class ServiceInfoGroup {

        @XmlElement(required = true)
        protected AttributeTypeU20529S serviceInformation;
        protected NumberOfUnitsType20156S numberOfServices;
        protected TariffInformationTypeU129133S serviceRoutePrice;

        /**
         * Gets the value of the serviceInformation property.
         * 
         * @return
         *     possible object is
         *     {@link AttributeTypeU20529S }
         *     
         */
        public AttributeTypeU20529S getServiceInformation() {
            return serviceInformation;
        }

        /**
         * Sets the value of the serviceInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributeTypeU20529S }
         *     
         */
        public void setServiceInformation(AttributeTypeU20529S value) {
            this.serviceInformation = value;
        }

        /**
         * Gets the value of the numberOfServices property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType20156S }
         *     
         */
        public NumberOfUnitsType20156S getNumberOfServices() {
            return numberOfServices;
        }

        /**
         * Sets the value of the numberOfServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType20156S }
         *     
         */
        public void setNumberOfServices(NumberOfUnitsType20156S value) {
            this.numberOfServices = value;
        }

        /**
         * Gets the value of the serviceRoutePrice property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformationTypeU129133S }
         *     
         */
        public TariffInformationTypeU129133S getServiceRoutePrice() {
            return serviceRoutePrice;
        }

        /**
         * Sets the value of the serviceRoutePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformationTypeU129133S }
         *     
         */
        public void setServiceRoutePrice(TariffInformationTypeU129133S value) {
            this.serviceRoutePrice = value;
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
     *         &lt;element name="vehicleInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}VehicleTypeU"/>
     *         &lt;element name="numberOfBicycles" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumberOfUnitsType_20156S" minOccurs="0"/>
     *         &lt;element name="vehicleRoutePrice" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TariffInformationTypeU_129133S" minOccurs="0"/>
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
        "vehicleInformation",
        "numberOfBicycles",
        "vehicleRoutePrice"
    })
    public static class VehicleInfoGroup {

        @XmlElement(required = true)
        protected VehicleTypeU vehicleInformation;
        protected NumberOfUnitsType20156S numberOfBicycles;
        protected TariffInformationTypeU129133S vehicleRoutePrice;

        /**
         * Gets the value of the vehicleInformation property.
         * 
         * @return
         *     possible object is
         *     {@link VehicleTypeU }
         *     
         */
        public VehicleTypeU getVehicleInformation() {
            return vehicleInformation;
        }

        /**
         * Sets the value of the vehicleInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleTypeU }
         *     
         */
        public void setVehicleInformation(VehicleTypeU value) {
            this.vehicleInformation = value;
        }

        /**
         * Gets the value of the numberOfBicycles property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType20156S }
         *     
         */
        public NumberOfUnitsType20156S getNumberOfBicycles() {
            return numberOfBicycles;
        }

        /**
         * Sets the value of the numberOfBicycles property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType20156S }
         *     
         */
        public void setNumberOfBicycles(NumberOfUnitsType20156S value) {
            this.numberOfBicycles = value;
        }

        /**
         * Gets the value of the vehicleRoutePrice property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformationTypeU129133S }
         *     
         */
        public TariffInformationTypeU129133S getVehicleRoutePrice() {
            return vehicleRoutePrice;
        }

        /**
         * Sets the value of the vehicleRoutePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformationTypeU129133S }
         *     
         */
        public void setVehicleRoutePrice(TariffInformationTypeU129133S value) {
            this.vehicleRoutePrice = value;
        }

    }

}
