
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * not the standard only used in fare quote message
 * 
 * <p>Java class for DateAndTimeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stopDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}DateAndTimeDetailsType_120762C" maxOccurs="2"/>
 *         &lt;element name="Dummy.NET" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeInformationType", propOrder = {
    "stopDetails"
})
public class DateAndTimeInformationType {

    @XmlElement(required = true)
    protected List<DateAndTimeDetailsType120762C> stopDetails;

    /**
     * Gets the value of the stopDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndTimeDetailsType120762C }
     * 
     * 
     */
    public List<DateAndTimeDetailsType120762C> getStopDetails() {
        if (stopDetails == null) {
            stopDetails = new ArrayList<DateAndTimeDetailsType120762C>();
        }
        return this.stopDetails;
    }

}
