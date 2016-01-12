
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FerryAccomodationPackageDescriptionType_39395G complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FerryAccomodationPackageDescriptionType_39395G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageCode" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ProductInformationTypeI_20557S"/>
 *         &lt;element name="hotelInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}HotelPropertyType_26378S" minOccurs="0"/>
 *         &lt;element name="hotelCheckInInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_132956S" minOccurs="0"/>
 *         &lt;element name="areaCodeInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}PlaceLocationIdentificationTypeU_24573S" minOccurs="0"/>
 *         &lt;element name="numberOfNights" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumberOfUnitsType_20156S" minOccurs="0"/>
 *         &lt;element name="hotelItemPrice" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TariffInformationTypeU_129133S" minOccurs="0"/>
 *         &lt;element name="roomInfoGroup" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="roomDetailsInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}HotelRoomType_129126S"/>
 *                   &lt;element name="numberOfRooms" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumberOfUnitsType_20156S" minOccurs="0"/>
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
@XmlType(name = "FerryAccomodationPackageDescriptionType_39395G", propOrder = {
    "packageCode",
    "hotelInformation",
    "hotelCheckInInformation",
    "areaCodeInfo",
    "numberOfNights",
    "hotelItemPrice",
    "roomInfoGroup"
})
public class FerryAccomodationPackageDescriptionType39395G {

    @XmlElement(required = true)
    protected ProductInformationTypeI20557S packageCode;
    protected HotelPropertyType26378S hotelInformation;
    protected StructuredDateTimeInformationType132956S hotelCheckInInformation;
    protected PlaceLocationIdentificationTypeU24573S areaCodeInfo;
    protected NumberOfUnitsType20156S numberOfNights;
    protected TariffInformationTypeU129133S hotelItemPrice;
    protected List<FerryAccomodationPackageDescriptionType39395G.RoomInfoGroup> roomInfoGroup;

    /**
     * Gets the value of the packageCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationTypeI20557S }
     *     
     */
    public ProductInformationTypeI20557S getPackageCode() {
        return packageCode;
    }

    /**
     * Sets the value of the packageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationTypeI20557S }
     *     
     */
    public void setPackageCode(ProductInformationTypeI20557S value) {
        this.packageCode = value;
    }

    /**
     * Gets the value of the hotelInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HotelPropertyType26378S }
     *     
     */
    public HotelPropertyType26378S getHotelInformation() {
        return hotelInformation;
    }

    /**
     * Sets the value of the hotelInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPropertyType26378S }
     *     
     */
    public void setHotelInformation(HotelPropertyType26378S value) {
        this.hotelInformation = value;
    }

    /**
     * Gets the value of the hotelCheckInInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType132956S }
     *     
     */
    public StructuredDateTimeInformationType132956S getHotelCheckInInformation() {
        return hotelCheckInInformation;
    }

    /**
     * Sets the value of the hotelCheckInInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType132956S }
     *     
     */
    public void setHotelCheckInInformation(StructuredDateTimeInformationType132956S value) {
        this.hotelCheckInInformation = value;
    }

    /**
     * Gets the value of the areaCodeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceLocationIdentificationTypeU24573S }
     *     
     */
    public PlaceLocationIdentificationTypeU24573S getAreaCodeInfo() {
        return areaCodeInfo;
    }

    /**
     * Sets the value of the areaCodeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceLocationIdentificationTypeU24573S }
     *     
     */
    public void setAreaCodeInfo(PlaceLocationIdentificationTypeU24573S value) {
        this.areaCodeInfo = value;
    }

    /**
     * Gets the value of the numberOfNights property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsType20156S }
     *     
     */
    public NumberOfUnitsType20156S getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * Sets the value of the numberOfNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsType20156S }
     *     
     */
    public void setNumberOfNights(NumberOfUnitsType20156S value) {
        this.numberOfNights = value;
    }

    /**
     * Gets the value of the hotelItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationTypeU129133S }
     *     
     */
    public TariffInformationTypeU129133S getHotelItemPrice() {
        return hotelItemPrice;
    }

    /**
     * Sets the value of the hotelItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationTypeU129133S }
     *     
     */
    public void setHotelItemPrice(TariffInformationTypeU129133S value) {
        this.hotelItemPrice = value;
    }

    /**
     * Gets the value of the roomInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryAccomodationPackageDescriptionType39395G.RoomInfoGroup }
     * 
     * 
     */
    public List<FerryAccomodationPackageDescriptionType39395G.RoomInfoGroup> getRoomInfoGroup() {
        if (roomInfoGroup == null) {
            roomInfoGroup = new ArrayList<FerryAccomodationPackageDescriptionType39395G.RoomInfoGroup>();
        }
        return this.roomInfoGroup;
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
     *         &lt;element name="roomDetailsInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}HotelRoomType_129126S"/>
     *         &lt;element name="numberOfRooms" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumberOfUnitsType_20156S" minOccurs="0"/>
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
        "roomDetailsInformation",
        "numberOfRooms"
    })
    public static class RoomInfoGroup {

        @XmlElement(required = true)
        protected HotelRoomType129126S roomDetailsInformation;
        protected NumberOfUnitsType20156S numberOfRooms;

        /**
         * Gets the value of the roomDetailsInformation property.
         * 
         * @return
         *     possible object is
         *     {@link HotelRoomType129126S }
         *     
         */
        public HotelRoomType129126S getRoomDetailsInformation() {
            return roomDetailsInformation;
        }

        /**
         * Sets the value of the roomDetailsInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelRoomType129126S }
         *     
         */
        public void setRoomDetailsInformation(HotelRoomType129126S value) {
            this.roomDetailsInformation = value;
        }

        /**
         * Gets the value of the numberOfRooms property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType20156S }
         *     
         */
        public NumberOfUnitsType20156S getNumberOfRooms() {
            return numberOfRooms;
        }

        /**
         * Sets the value of the numberOfRooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType20156S }
         *     
         */
        public void setNumberOfRooms(NumberOfUnitsType20156S value) {
            this.numberOfRooms = value;
        }

    }

}
