
package com.amadeus.xml.fmptbr_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information regarding estimated or actual dates and times of operational events
 * 
 * <p>Java class for DateAndTimeInformationType_182345S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeInformationType_182345S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateAndTimeDetails" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}DateAndTimeDetailsType_256192C" maxOccurs="400" minOccurs="0"/>
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
@XmlType(name = "DateAndTimeInformationType_182345S", propOrder = {
    "dateAndTimeDetails"
})
public class DateAndTimeInformationType182345S {

    protected List<DateAndTimeDetailsType256192C> dateAndTimeDetails;

    /**
     * Gets the value of the dateAndTimeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateAndTimeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateAndTimeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndTimeDetailsType256192C }
     * 
     * 
     */
    public List<DateAndTimeDetailsType256192C> getDateAndTimeDetails() {
        if (dateAndTimeDetails == null) {
            dateAndTimeDetails = new ArrayList<DateAndTimeDetailsType256192C>();
        }
        return this.dateAndTimeDetails;
    }

}
