
package com.amadeus.xml.fmptbr_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information related to a ticket
 * 
 * <p>Java class for PricingTicketingSubsequentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingSubsequentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paxFareNum" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To3" maxOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingSubsequentType", propOrder = {
    "paxFareNum"
})
public class PricingTicketingSubsequentType {

    @XmlElement(required = true)
    protected List<String> paxFareNum;

    /**
     * Gets the value of the paxFareNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxFareNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxFareNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaxFareNum() {
        if (paxFareNum == null) {
            paxFareNum = new ArrayList<String>();
        }
        return this.paxFareNum;
    }

}
