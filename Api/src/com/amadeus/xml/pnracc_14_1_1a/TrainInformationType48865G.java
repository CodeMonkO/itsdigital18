
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Group together rail segment business data
 * 
 * <p>Java class for TrainInformationType_48865G complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainInformationType_48865G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}CompanyInformationType_132975S"/>
 *         &lt;element name="updatePermission" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StatusTypeI_20923S" minOccurs="0"/>
 *         &lt;element name="tripDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TrainDataType_48813G"/>
 *         &lt;element name="openSegment" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StatusTypeI_132979S" minOccurs="0"/>
 *         &lt;element name="journeyDirection" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TravelItineraryInformationTypeI_129342S" minOccurs="0"/>
 *         &lt;element name="providerTattoo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ItemReferencesAndVersionsType_20992S" minOccurs="0"/>
 *         &lt;element name="serviceInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}FreeTextInformationType_20551S" minOccurs="0"/>
 *         &lt;element name="classInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ClassConfigurationDetailsType_132973S"/>
 *         &lt;element name="accommodationInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AccommodationAllocationInformationTypeU" minOccurs="0"/>
 *         &lt;element name="coachInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}CoachProductInformationType" minOccurs="0"/>
 *         &lt;element name="reservableStatus" type="{http://xml.amadeus.com/PNRACC_14_1_1A}QuantityAndActionTypeU_132977S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainInformationType_48865G", propOrder = {
    "companyInfo",
    "updatePermission",
    "tripDetails",
    "openSegment",
    "journeyDirection",
    "providerTattoo",
    "serviceInfo",
    "classInfo",
    "accommodationInfo",
    "coachInfo",
    "reservableStatus"
})
public class TrainInformationType48865G {

    @XmlElement(required = true)
    protected CompanyInformationType132975S companyInfo;
    protected StatusTypeI20923S updatePermission;
    @XmlElement(required = true)
    protected TrainDataType48813G tripDetails;
    protected StatusTypeI132979S openSegment;
    protected TravelItineraryInformationTypeI129342S journeyDirection;
    protected ItemReferencesAndVersionsType20992S providerTattoo;
    protected FreeTextInformationType20551S serviceInfo;
    @XmlElement(required = true)
    protected ClassConfigurationDetailsType132973S classInfo;
    protected AccommodationAllocationInformationTypeU accommodationInfo;
    protected CoachProductInformationType coachInfo;
    protected QuantityAndActionTypeU132977S reservableStatus;

    /**
     * Gets the value of the companyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType132975S }
     *     
     */
    public CompanyInformationType132975S getCompanyInfo() {
        return companyInfo;
    }

    /**
     * Sets the value of the companyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType132975S }
     *     
     */
    public void setCompanyInfo(CompanyInformationType132975S value) {
        this.companyInfo = value;
    }

    /**
     * Gets the value of the updatePermission property.
     * 
     * @return
     *     possible object is
     *     {@link StatusTypeI20923S }
     *     
     */
    public StatusTypeI20923S getUpdatePermission() {
        return updatePermission;
    }

    /**
     * Sets the value of the updatePermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTypeI20923S }
     *     
     */
    public void setUpdatePermission(StatusTypeI20923S value) {
        this.updatePermission = value;
    }

    /**
     * Gets the value of the tripDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TrainDataType48813G }
     *     
     */
    public TrainDataType48813G getTripDetails() {
        return tripDetails;
    }

    /**
     * Sets the value of the tripDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainDataType48813G }
     *     
     */
    public void setTripDetails(TrainDataType48813G value) {
        this.tripDetails = value;
    }

    /**
     * Gets the value of the openSegment property.
     * 
     * @return
     *     possible object is
     *     {@link StatusTypeI132979S }
     *     
     */
    public StatusTypeI132979S getOpenSegment() {
        return openSegment;
    }

    /**
     * Sets the value of the openSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTypeI132979S }
     *     
     */
    public void setOpenSegment(StatusTypeI132979S value) {
        this.openSegment = value;
    }

    /**
     * Gets the value of the journeyDirection property.
     * 
     * @return
     *     possible object is
     *     {@link TravelItineraryInformationTypeI129342S }
     *     
     */
    public TravelItineraryInformationTypeI129342S getJourneyDirection() {
        return journeyDirection;
    }

    /**
     * Sets the value of the journeyDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelItineraryInformationTypeI129342S }
     *     
     */
    public void setJourneyDirection(TravelItineraryInformationTypeI129342S value) {
        this.journeyDirection = value;
    }

    /**
     * Gets the value of the providerTattoo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReferencesAndVersionsType20992S }
     *     
     */
    public ItemReferencesAndVersionsType20992S getProviderTattoo() {
        return providerTattoo;
    }

    /**
     * Sets the value of the providerTattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReferencesAndVersionsType20992S }
     *     
     */
    public void setProviderTattoo(ItemReferencesAndVersionsType20992S value) {
        this.providerTattoo = value;
    }

    /**
     * Gets the value of the serviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType20551S }
     *     
     */
    public FreeTextInformationType20551S getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Sets the value of the serviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType20551S }
     *     
     */
    public void setServiceInfo(FreeTextInformationType20551S value) {
        this.serviceInfo = value;
    }

    /**
     * Gets the value of the classInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClassConfigurationDetailsType132973S }
     *     
     */
    public ClassConfigurationDetailsType132973S getClassInfo() {
        return classInfo;
    }

    /**
     * Sets the value of the classInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassConfigurationDetailsType132973S }
     *     
     */
    public void setClassInfo(ClassConfigurationDetailsType132973S value) {
        this.classInfo = value;
    }

    /**
     * Gets the value of the accommodationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationAllocationInformationTypeU }
     *     
     */
    public AccommodationAllocationInformationTypeU getAccommodationInfo() {
        return accommodationInfo;
    }

    /**
     * Sets the value of the accommodationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationAllocationInformationTypeU }
     *     
     */
    public void setAccommodationInfo(AccommodationAllocationInformationTypeU value) {
        this.accommodationInfo = value;
    }

    /**
     * Gets the value of the coachInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CoachProductInformationType }
     *     
     */
    public CoachProductInformationType getCoachInfo() {
        return coachInfo;
    }

    /**
     * Sets the value of the coachInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoachProductInformationType }
     *     
     */
    public void setCoachInfo(CoachProductInformationType value) {
        this.coachInfo = value;
    }

    /**
     * Gets the value of the reservableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndActionTypeU132977S }
     *     
     */
    public QuantityAndActionTypeU132977S getReservableStatus() {
        return reservableStatus;
    }

    /**
     * Sets the value of the reservableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndActionTypeU132977S }
     *     
     */
    public void setReservableStatus(QuantityAndActionTypeU132977S value) {
        this.reservableStatus = value;
    }

}
