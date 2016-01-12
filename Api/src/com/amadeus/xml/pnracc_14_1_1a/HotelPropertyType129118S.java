
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the Hotel Property information
 * 
 * <p>Java class for HotelPropertyType_129118S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelPropertyType_129118S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotelReference" type="{http://xml.amadeus.com/PNRACC_14_1_1A}HotelUniqueIdType_188138C" minOccurs="0"/>
 *         &lt;element name="hotelName" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To99" minOccurs="0"/>
 *         &lt;element name="fireSafetyIndicator" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPropertyType_129118S", propOrder = {
    "hotelReference",
    "hotelName",
    "fireSafetyIndicator"
})
public class HotelPropertyType129118S {

    protected HotelUniqueIdType188138C hotelReference;
    protected String hotelName;
    protected String fireSafetyIndicator;

    /**
     * Gets the value of the hotelReference property.
     * 
     * @return
     *     possible object is
     *     {@link HotelUniqueIdType188138C }
     *     
     */
    public HotelUniqueIdType188138C getHotelReference() {
        return hotelReference;
    }

    /**
     * Sets the value of the hotelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelUniqueIdType188138C }
     *     
     */
    public void setHotelReference(HotelUniqueIdType188138C value) {
        this.hotelReference = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the fireSafetyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFireSafetyIndicator() {
        return fireSafetyIndicator;
    }

    /**
     * Sets the value of the fireSafetyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFireSafetyIndicator(String value) {
        this.fireSafetyIndicator = value;
    }

}
