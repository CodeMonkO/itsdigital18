
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FerryAccomodationPackageDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FerryAccomodationPackageDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageCode" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ProductInformationTypeI"/>
 *         &lt;element name="hotelInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}HotelPropertyType_129121S" minOccurs="0"/>
 *         &lt;element name="hotelCheckInInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_128682S" minOccurs="0"/>
 *         &lt;element name="areaCodeInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}PlaceLocationIdentificationTypeU" minOccurs="0"/>
 *         &lt;element name="numberOfNights" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumberOfUnitsType_129120S" minOccurs="0"/>
 *         &lt;element name="hotelItemPrice" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TariffInformationTypeU" minOccurs="0"/>
 *         &lt;element name="roomInfoGroup" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="roomDetailsInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}HotelRoomType_129126S"/>
 *                   &lt;element name="numberOfRooms" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumberOfUnitsType_129120S" minOccurs="0"/>
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
@XmlType(name = "FerryAccomodationPackageDescriptionType", propOrder = {
    "packageCode",
    "hotelInformation",
    "hotelCheckInInformation",
    "areaCodeInfo",
    "numberOfNights",
    "hotelItemPrice",
    "roomInfoGroup"
})
public class FerryAccomodationPackageDescriptionType {

    @XmlElement(required = true)
    protected ProductInformationTypeI packageCode;
    protected HotelPropertyType129121S hotelInformation;
    protected StructuredDateTimeInformationType128682S hotelCheckInInformation;
    protected PlaceLocationIdentificationTypeU areaCodeInfo;
    protected NumberOfUnitsType129120S numberOfNights;
    protected TariffInformationTypeU hotelItemPrice;
    protected List<FerryAccomodationPackageDescriptionType.RoomInfoGroup> roomInfoGroup;

    /**
     * Gets the value of the packageCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationTypeI }
     *     
     */
    public ProductInformationTypeI getPackageCode() {
        return packageCode;
    }

    /**
     * Sets the value of the packageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationTypeI }
     *     
     */
    public void setPackageCode(ProductInformationTypeI value) {
        this.packageCode = value;
    }

    /**
     * Gets the value of the hotelInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HotelPropertyType129121S }
     *     
     */
    public HotelPropertyType129121S getHotelInformation() {
        return hotelInformation;
    }

    /**
     * Sets the value of the hotelInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPropertyType129121S }
     *     
     */
    public void setHotelInformation(HotelPropertyType129121S value) {
        this.hotelInformation = value;
    }

    /**
     * Gets the value of the hotelCheckInInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType128682S }
     *     
     */
    public StructuredDateTimeInformationType128682S getHotelCheckInInformation() {
        return hotelCheckInInformation;
    }

    /**
     * Sets the value of the hotelCheckInInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType128682S }
     *     
     */
    public void setHotelCheckInInformation(StructuredDateTimeInformationType128682S value) {
        this.hotelCheckInInformation = value;
    }

    /**
     * Gets the value of the areaCodeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceLocationIdentificationTypeU }
     *     
     */
    public PlaceLocationIdentificationTypeU getAreaCodeInfo() {
        return areaCodeInfo;
    }

    /**
     * Sets the value of the areaCodeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceLocationIdentificationTypeU }
     *     
     */
    public void setAreaCodeInfo(PlaceLocationIdentificationTypeU value) {
        this.areaCodeInfo = value;
    }

    /**
     * Gets the value of the numberOfNights property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsType129120S }
     *     
     */
    public NumberOfUnitsType129120S getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * Sets the value of the numberOfNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsType129120S }
     *     
     */
    public void setNumberOfNights(NumberOfUnitsType129120S value) {
        this.numberOfNights = value;
    }

    /**
     * Gets the value of the hotelItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationTypeU }
     *     
     */
    public TariffInformationTypeU getHotelItemPrice() {
        return hotelItemPrice;
    }

    /**
     * Sets the value of the hotelItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationTypeU }
     *     
     */
    public void setHotelItemPrice(TariffInformationTypeU value) {
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
     * {@link FerryAccomodationPackageDescriptionType.RoomInfoGroup }
     * 
     * 
     */
    public List<FerryAccomodationPackageDescriptionType.RoomInfoGroup> getRoomInfoGroup() {
        if (roomInfoGroup == null) {
            roomInfoGroup = new ArrayList<FerryAccomodationPackageDescriptionType.RoomInfoGroup>();
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
     *         &lt;element name="numberOfRooms" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumberOfUnitsType_129120S" minOccurs="0"/>
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
        protected NumberOfUnitsType129120S numberOfRooms;

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
         *     {@link NumberOfUnitsType129120S }
         *     
         */
        public NumberOfUnitsType129120S getNumberOfRooms() {
            return numberOfRooms;
        }

        /**
         * Sets the value of the numberOfRooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType129120S }
         *     
         */
        public void setNumberOfRooms(NumberOfUnitsType129120S value) {
            this.numberOfRooms = value;
        }

    }

}
