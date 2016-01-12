
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information concerning a tour.
 * 
 * <p>Java class for TourInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tourInformationDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TourDetailsTypeI_192827C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourInformationTypeI", propOrder = {
    "tourInformationDetails"
})
public class TourInformationTypeI {

    @XmlElement(required = true)
    protected TourDetailsTypeI192827C tourInformationDetails;

    /**
     * Gets the value of the tourInformationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TourDetailsTypeI192827C }
     *     
     */
    public TourDetailsTypeI192827C getTourInformationDetails() {
        return tourInformationDetails;
    }

    /**
     * Sets the value of the tourInformationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourDetailsTypeI192827C }
     *     
     */
    public void setTourInformationDetails(TourDetailsTypeI192827C value) {
        this.tourInformationDetails = value;
    }

}
