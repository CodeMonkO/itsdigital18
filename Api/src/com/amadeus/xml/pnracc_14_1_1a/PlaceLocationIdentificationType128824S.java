
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a place or a location and/or related locations.
 * 
 * <p>Java class for PlaceLocationIdentificationType_128824S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceLocationIdentificationType_128824S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationType" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="firstLocationDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}RelatedLocationOneIdentificationType_187710C" minOccurs="0"/>
 *         &lt;element name="secondLocationDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}RelatedLocationTwoIdentificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceLocationIdentificationType_128824S", propOrder = {
    "locationType",
    "firstLocationDetails",
    "secondLocationDetails"
})
public class PlaceLocationIdentificationType128824S {

    @XmlElement(required = true)
    protected String locationType;
    protected RelatedLocationOneIdentificationType187710C firstLocationDetails;
    protected RelatedLocationTwoIdentificationType secondLocationDetails;

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the firstLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedLocationOneIdentificationType187710C }
     *     
     */
    public RelatedLocationOneIdentificationType187710C getFirstLocationDetails() {
        return firstLocationDetails;
    }

    /**
     * Sets the value of the firstLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedLocationOneIdentificationType187710C }
     *     
     */
    public void setFirstLocationDetails(RelatedLocationOneIdentificationType187710C value) {
        this.firstLocationDetails = value;
    }

    /**
     * Gets the value of the secondLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedLocationTwoIdentificationType }
     *     
     */
    public RelatedLocationTwoIdentificationType getSecondLocationDetails() {
        return secondLocationDetails;
    }

    /**
     * Sets the value of the secondLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedLocationTwoIdentificationType }
     *     
     */
    public void setSecondLocationDetails(RelatedLocationTwoIdentificationType value) {
        this.secondLocationDetails = value;
    }

}
