
package com.amadeus.xml.tipnrr_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To designate system specific combinations of fare types and fare groupings
 * 
 * <p>Java class for FareTypeGroupingInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareTypeGroupingInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pricingGroup" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}AlphaNumericString_Length1To35" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareTypeGroupingInformationTypeI", propOrder = {
    "pricingGroup"
})
public class FareTypeGroupingInformationTypeI {

    protected List<String> pricingGroup;

    /**
     * Gets the value of the pricingGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPricingGroup() {
        if (pricingGroup == null) {
            pricingGroup = new ArrayList<String>();
        }
        return this.pricingGroup;
    }

}
