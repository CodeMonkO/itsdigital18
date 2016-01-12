
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information regarding estimated or actual dates and times of operational events
 * 
 * <p>Java class for DateAndTimeInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTimeDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}DateAndTimeDetailsTypeI_120740C" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeInformationTypeI", propOrder = {
    "dateTimeDetails"
})
public class DateAndTimeInformationTypeI {

    protected List<DateAndTimeDetailsTypeI120740C> dateTimeDetails;

    /**
     * Gets the value of the dateTimeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTimeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTimeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndTimeDetailsTypeI120740C }
     * 
     * 
     */
    public List<DateAndTimeDetailsTypeI120740C> getDateTimeDetails() {
        if (dateTimeDetails == null) {
            dateTimeDetails = new ArrayList<DateAndTimeDetailsTypeI120740C>();
        }
        return this.dateTimeDetails;
    }

}
