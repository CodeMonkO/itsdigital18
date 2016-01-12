
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the details for a hotel transaction.
 * 
 * <p>Java class for HotelProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelProductInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="preferredAmenities" type="{http://xml.amadeus.com/PNRACC_14_1_1A}HotelFacilityType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelProductInformationType", propOrder = {
    "preferredAmenities"
})
public class HotelProductInformationType {

    @XmlElement(required = true)
    protected HotelFacilityType preferredAmenities;

    /**
     * Gets the value of the preferredAmenities property.
     * 
     * @return
     *     possible object is
     *     {@link HotelFacilityType }
     *     
     */
    public HotelFacilityType getPreferredAmenities() {
        return preferredAmenities;
    }

    /**
     * Sets the value of the preferredAmenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelFacilityType }
     *     
     */
    public void setPreferredAmenities(HotelFacilityType value) {
        this.preferredAmenities = value;
    }

}
