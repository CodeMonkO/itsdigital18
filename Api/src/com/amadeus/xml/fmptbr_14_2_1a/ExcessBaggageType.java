
package com.amadeus.xml.fmptbr_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcessBaggageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcessBaggageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baggageDetails" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}BaggageDetailsType" minOccurs="0"/>
 *         &lt;element name="bagTagDetails" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}BagtagDetailsType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessBaggageType", propOrder = {
    "baggageDetails",
    "bagTagDetails"
})
public class ExcessBaggageType {

    protected BaggageDetailsType baggageDetails;
    protected List<BagtagDetailsType> bagTagDetails;

    /**
     * Gets the value of the baggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailsType }
     *     
     */
    public BaggageDetailsType getBaggageDetails() {
        return baggageDetails;
    }

    /**
     * Sets the value of the baggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailsType }
     *     
     */
    public void setBaggageDetails(BaggageDetailsType value) {
        this.baggageDetails = value;
    }

    /**
     * Gets the value of the bagTagDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagTagDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagTagDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagtagDetailsType }
     * 
     * 
     */
    public List<BagtagDetailsType> getBagTagDetails() {
        if (bagTagDetails == null) {
            bagTagDetails = new ArrayList<BagtagDetailsType>();
        }
        return this.bagTagDetails;
    }

}
