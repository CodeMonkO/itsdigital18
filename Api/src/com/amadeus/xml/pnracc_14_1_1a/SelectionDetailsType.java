
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the details for making a selection.
 * 
 * <p>Java class for SelectionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookingChannel" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SelectionDetailsInformationTypeU" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionDetailsType", propOrder = {
    "bookingChannel"
})
public class SelectionDetailsType {

    @XmlElement(required = true)
    protected List<SelectionDetailsInformationTypeU> bookingChannel;

    /**
     * Gets the value of the bookingChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionDetailsInformationTypeU }
     * 
     * 
     */
    public List<SelectionDetailsInformationTypeU> getBookingChannel() {
        if (bookingChannel == null) {
            bookingChannel = new ArrayList<SelectionDetailsInformationTypeU>();
        }
        return this.bookingChannel;
    }

}
