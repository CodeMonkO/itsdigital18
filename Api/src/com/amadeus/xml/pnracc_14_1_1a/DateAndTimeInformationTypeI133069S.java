
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide date and time details relative to flight movements.
 * 
 * <p>Java class for DateAndTimeInformationTypeI_133069S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeInformationTypeI_133069S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateAndTimeDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}DateAndTimeDetailsTypeI_193059C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeInformationTypeI_133069S", propOrder = {
    "dateAndTimeDetails"
})
public class DateAndTimeInformationTypeI133069S {

    @XmlElement(required = true)
    protected DateAndTimeDetailsTypeI193059C dateAndTimeDetails;

    /**
     * Gets the value of the dateAndTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeDetailsTypeI193059C }
     *     
     */
    public DateAndTimeDetailsTypeI193059C getDateAndTimeDetails() {
        return dateAndTimeDetails;
    }

    /**
     * Sets the value of the dateAndTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeDetailsTypeI193059C }
     *     
     */
    public void setDateAndTimeDetails(DateAndTimeDetailsTypeI193059C value) {
        this.dateAndTimeDetails = value;
    }

}
