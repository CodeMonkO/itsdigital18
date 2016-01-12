
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify traveller/personal details
 * 
 * <p>Java class for TravellerReferenceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerReferenceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ptc" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To6" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="traveller" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}TravellerDetailsType" maxOccurs="9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerReferenceInformationType", propOrder = {
    "ptc",
    "traveller"
})
public class TravellerReferenceInformationType {

    protected List<String> ptc;
    @XmlElement(required = true)
    protected List<TravellerDetailsType> traveller;

    /**
     * Gets the value of the ptc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPtc() {
        if (ptc == null) {
            ptc = new ArrayList<String>();
        }
        return this.ptc;
    }

    /**
     * Gets the value of the traveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraveller().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerDetailsType }
     * 
     * 
     */
    public List<TravellerDetailsType> getTraveller() {
        if (traveller == null) {
            traveller = new ArrayList<TravellerDetailsType>();
        }
        return this.traveller;
    }

}
