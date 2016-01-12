
package com.amadeus.xml.tipnrq_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify additional details about a particular traveller.
 * 
 * <p>Java class for SpecificTravellerTypeI_65902S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificTravellerTypeI_65902S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="travellerDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SpecificTravellerDetailsTypeI" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificTravellerTypeI_65902S", propOrder = {
    "travellerDetails"
})
public class SpecificTravellerTypeI65902S {

    protected List<SpecificTravellerDetailsTypeI> travellerDetails;

    /**
     * Gets the value of the travellerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravellerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificTravellerDetailsTypeI }
     * 
     * 
     */
    public List<SpecificTravellerDetailsTypeI> getTravellerDetails() {
        if (travellerDetails == null) {
            travellerDetails = new ArrayList<SpecificTravellerDetailsTypeI>();
        }
        return this.travellerDetails;
    }

}
