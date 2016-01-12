
package com.amadeus.xml.fmptbr_14_2_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information regarding Requested Segments
 * 
 * <p>Java class for OriginAndDestinationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginAndDestinationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="segRef" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}NumericInteger_Length1To2"/>
 *         &lt;element name="locationForcing" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}ItineraryDetailsType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginAndDestinationRequestType", propOrder = {
    "segRef",
    "locationForcing"
})
public class OriginAndDestinationRequestType {

    @XmlElement(required = true)
    protected BigInteger segRef;
    protected List<ItineraryDetailsType> locationForcing;

    /**
     * Gets the value of the segRef property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSegRef() {
        return segRef;
    }

    /**
     * Sets the value of the segRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSegRef(BigInteger value) {
        this.segRef = value;
    }

    /**
     * Gets the value of the locationForcing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationForcing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationForcing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryDetailsType }
     * 
     * 
     */
    public List<ItineraryDetailsType> getLocationForcing() {
        if (locationForcing == null) {
            locationForcing = new ArrayList<ItineraryDetailsType>();
        }
        return this.locationForcing;
    }

}
