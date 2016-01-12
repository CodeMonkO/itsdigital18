
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the Hotel Property information
 * 
 * <p>Java class for HotelPropertyType_129121S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelPropertyType_129121S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotelReference" type="{http://xml.amadeus.com/PNRACC_14_1_1A}HotelUniqueIdType_188143C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPropertyType_129121S", propOrder = {
    "hotelReference"
})
public class HotelPropertyType129121S {

    protected HotelUniqueIdType188143C hotelReference;

    /**
     * Gets the value of the hotelReference property.
     * 
     * @return
     *     possible object is
     *     {@link HotelUniqueIdType188143C }
     *     
     */
    public HotelUniqueIdType188143C getHotelReference() {
        return hotelReference;
    }

    /**
     * Sets the value of the hotelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelUniqueIdType188143C }
     *     
     */
    public void setHotelReference(HotelUniqueIdType188143C value) {
        this.hotelReference = value;
    }

}
