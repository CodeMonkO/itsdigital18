
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information concerning an airline flight.
 * 
 * <p>Java class for AdditionalProductDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AdditionalProductType" minOccurs="0"/>
 *         &lt;element name="departureStationInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StationInformationType" minOccurs="0"/>
 *         &lt;element name="arrivalStationInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StationInformationType" minOccurs="0"/>
 *         &lt;element name="mileageDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}MileageTimeDetailsType" minOccurs="0"/>
 *         &lt;element name="travellerTimeDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TravellerTimeDetailsType" minOccurs="0"/>
 *         &lt;element name="equipmentInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ProductFacilitiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductDetailsType", propOrder = {
    "productDetails",
    "departureStationInfo",
    "arrivalStationInfo",
    "mileageDetails",
    "travellerTimeDetails",
    "equipmentInformation"
})
public class AdditionalProductDetailsType {

    protected AdditionalProductType productDetails;
    protected StationInformationType departureStationInfo;
    protected StationInformationType arrivalStationInfo;
    protected MileageTimeDetailsType mileageDetails;
    protected TravellerTimeDetailsType travellerTimeDetails;
    protected ProductFacilitiesType equipmentInformation;

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductType }
     *     
     */
    public AdditionalProductType getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductType }
     *     
     */
    public void setProductDetails(AdditionalProductType value) {
        this.productDetails = value;
    }

    /**
     * Gets the value of the departureStationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StationInformationType }
     *     
     */
    public StationInformationType getDepartureStationInfo() {
        return departureStationInfo;
    }

    /**
     * Sets the value of the departureStationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationInformationType }
     *     
     */
    public void setDepartureStationInfo(StationInformationType value) {
        this.departureStationInfo = value;
    }

    /**
     * Gets the value of the arrivalStationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StationInformationType }
     *     
     */
    public StationInformationType getArrivalStationInfo() {
        return arrivalStationInfo;
    }

    /**
     * Sets the value of the arrivalStationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationInformationType }
     *     
     */
    public void setArrivalStationInfo(StationInformationType value) {
        this.arrivalStationInfo = value;
    }

    /**
     * Gets the value of the mileageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MileageTimeDetailsType }
     *     
     */
    public MileageTimeDetailsType getMileageDetails() {
        return mileageDetails;
    }

    /**
     * Sets the value of the mileageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MileageTimeDetailsType }
     *     
     */
    public void setMileageDetails(MileageTimeDetailsType value) {
        this.mileageDetails = value;
    }

    /**
     * Gets the value of the travellerTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerTimeDetailsType }
     *     
     */
    public TravellerTimeDetailsType getTravellerTimeDetails() {
        return travellerTimeDetails;
    }

    /**
     * Sets the value of the travellerTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerTimeDetailsType }
     *     
     */
    public void setTravellerTimeDetails(TravellerTimeDetailsType value) {
        this.travellerTimeDetails = value;
    }

    /**
     * Gets the value of the equipmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFacilitiesType }
     *     
     */
    public ProductFacilitiesType getEquipmentInformation() {
        return equipmentInformation;
    }

    /**
     * Sets the value of the equipmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFacilitiesType }
     *     
     */
    public void setEquipmentInformation(ProductFacilitiesType value) {
        this.equipmentInformation = value;
    }

}
