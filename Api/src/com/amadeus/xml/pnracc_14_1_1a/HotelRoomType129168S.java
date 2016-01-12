
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the hotel room information
 * 
 * <p>Java class for HotelRoomType_129168S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomType_129168S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomRateIdentifier" type="{http://xml.amadeus.com/PNRACC_14_1_1A}HotelRoomRateInformationType_188211C" minOccurs="0"/>
 *         &lt;element name="bookingCode" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="guestCountDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumberOfUnitDetailsTypeI_18670C" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="roomTypeOverride" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomType_129168S", propOrder = {
    "roomRateIdentifier",
    "bookingCode",
    "guestCountDetails",
    "roomTypeOverride"
})
public class HotelRoomType129168S {

    protected HotelRoomRateInformationType188211C roomRateIdentifier;
    protected String bookingCode;
    protected List<NumberOfUnitDetailsTypeI18670C> guestCountDetails;
    protected String roomTypeOverride;

    /**
     * Gets the value of the roomRateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomRateInformationType188211C }
     *     
     */
    public HotelRoomRateInformationType188211C getRoomRateIdentifier() {
        return roomRateIdentifier;
    }

    /**
     * Sets the value of the roomRateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomRateInformationType188211C }
     *     
     */
    public void setRoomRateIdentifier(HotelRoomRateInformationType188211C value) {
        this.roomRateIdentifier = value;
    }

    /**
     * Gets the value of the bookingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * Sets the value of the bookingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * Gets the value of the guestCountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestCountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestCountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfUnitDetailsTypeI18670C }
     * 
     * 
     */
    public List<NumberOfUnitDetailsTypeI18670C> getGuestCountDetails() {
        if (guestCountDetails == null) {
            guestCountDetails = new ArrayList<NumberOfUnitDetailsTypeI18670C>();
        }
        return this.guestCountDetails;
    }

    /**
     * Gets the value of the roomTypeOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeOverride() {
        return roomTypeOverride;
    }

    /**
     * Sets the value of the roomTypeOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeOverride(String value) {
        this.roomTypeOverride = value;
    }

}
