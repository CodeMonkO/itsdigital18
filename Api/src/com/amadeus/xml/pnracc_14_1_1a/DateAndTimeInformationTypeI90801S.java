
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide date and time details relative to flight movements.
 * 
 * <p>Java class for DateAndTimeInformationTypeI_90801S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeInformationTypeI_90801S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateAndTimeDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}DateAndTimeDetailsTypeI_137003C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeInformationTypeI_90801S", propOrder = {
    "dateAndTimeDetails"
})
public class DateAndTimeInformationTypeI90801S {

    @XmlElement(required = true)
    protected DateAndTimeDetailsTypeI137003C dateAndTimeDetails;

    /**
     * Gets the value of the dateAndTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeDetailsTypeI137003C }
     *     
     */
    public DateAndTimeDetailsTypeI137003C getDateAndTimeDetails() {
        return dateAndTimeDetails;
    }

    /**
     * Sets the value of the dateAndTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeDetailsTypeI137003C }
     *     
     */
    public void setDateAndTimeDetails(DateAndTimeDetailsTypeI137003C value) {
        this.dateAndTimeDetails = value;
    }

}
