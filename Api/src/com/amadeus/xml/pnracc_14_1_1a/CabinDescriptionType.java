
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To describe a Cabin in a ship
 * 
 * <p>Java class for CabinDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}CabinIdentificationType" minOccurs="0"/>
 *         &lt;element name="cabinDescription" type="{http://xml.amadeus.com/PNRACC_14_1_1A}CabinDescriptionDetailsType" minOccurs="0"/>
 *         &lt;element name="deckPlanName" type="{http://xml.amadeus.com/PNRACC_14_1_1A}DeckType" minOccurs="0"/>
 *         &lt;element name="cabinStatus" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinDescriptionType", propOrder = {
    "cabinDetails",
    "cabinDescription",
    "deckPlanName",
    "cabinStatus"
})
public class CabinDescriptionType {

    protected CabinIdentificationType cabinDetails;
    protected CabinDescriptionDetailsType cabinDescription;
    protected DeckType deckPlanName;
    protected String cabinStatus;

    /**
     * Gets the value of the cabinDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CabinIdentificationType }
     *     
     */
    public CabinIdentificationType getCabinDetails() {
        return cabinDetails;
    }

    /**
     * Sets the value of the cabinDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinIdentificationType }
     *     
     */
    public void setCabinDetails(CabinIdentificationType value) {
        this.cabinDetails = value;
    }

    /**
     * Gets the value of the cabinDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CabinDescriptionDetailsType }
     *     
     */
    public CabinDescriptionDetailsType getCabinDescription() {
        return cabinDescription;
    }

    /**
     * Sets the value of the cabinDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinDescriptionDetailsType }
     *     
     */
    public void setCabinDescription(CabinDescriptionDetailsType value) {
        this.cabinDescription = value;
    }

    /**
     * Gets the value of the deckPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link DeckType }
     *     
     */
    public DeckType getDeckPlanName() {
        return deckPlanName;
    }

    /**
     * Sets the value of the deckPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckType }
     *     
     */
    public void setDeckPlanName(DeckType value) {
        this.deckPlanName = value;
    }

    /**
     * Gets the value of the cabinStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinStatus() {
        return cabinStatus;
    }

    /**
     * Sets the value of the cabinStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinStatus(String value) {
        this.cabinStatus = value;
    }

}
