
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify frequent traveler information.
 * 
 * <p>Java class for FrequentTravellerIdentificationCodeType_177150S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerIdentificationCodeType_177150S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequentTravellerDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}FrequentTravellerIdentificationType_249074C" maxOccurs="99"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerIdentificationCodeType_177150S", propOrder = {
    "frequentTravellerDetails"
})
public class FrequentTravellerIdentificationCodeType177150S {

    @XmlElement(required = true)
    protected List<FrequentTravellerIdentificationType249074C> frequentTravellerDetails;

    /**
     * Gets the value of the frequentTravellerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequentTravellerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequentTravellerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequentTravellerIdentificationType249074C }
     * 
     * 
     */
    public List<FrequentTravellerIdentificationType249074C> getFrequentTravellerDetails() {
        if (frequentTravellerDetails == null) {
            frequentTravellerDetails = new ArrayList<FrequentTravellerIdentificationType249074C>();
        }
        return this.frequentTravellerDetails;
    }

}
