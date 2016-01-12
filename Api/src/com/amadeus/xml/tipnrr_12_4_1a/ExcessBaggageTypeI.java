
package com.amadeus.xml.tipnrr_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information concerning excess baggage charges and the associated baggage details.
 * 
 * <p>Java class for ExcessBaggageTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcessBaggageTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="excessBaggageDetails" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ExcessBaggageDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="baggageDetails" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}BaggageDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="otherBaggageDetails" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}BaggageDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="extraBaggageDetails" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}BaggageDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="bagTagDetails" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}BagtagDetailsTypeI" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessBaggageTypeI", propOrder = {
    "excessBaggageDetails",
    "baggageDetails",
    "otherBaggageDetails",
    "extraBaggageDetails",
    "bagTagDetails"
})
public class ExcessBaggageTypeI {

    protected ExcessBaggageDetailsTypeI excessBaggageDetails;
    protected BaggageDetailsTypeI baggageDetails;
    protected BaggageDetailsTypeI otherBaggageDetails;
    protected BaggageDetailsTypeI extraBaggageDetails;
    protected List<BagtagDetailsTypeI> bagTagDetails;

    /**
     * Gets the value of the excessBaggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExcessBaggageDetailsTypeI }
     *     
     */
    public ExcessBaggageDetailsTypeI getExcessBaggageDetails() {
        return excessBaggageDetails;
    }

    /**
     * Sets the value of the excessBaggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcessBaggageDetailsTypeI }
     *     
     */
    public void setExcessBaggageDetails(ExcessBaggageDetailsTypeI value) {
        this.excessBaggageDetails = value;
    }

    /**
     * Gets the value of the baggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public BaggageDetailsTypeI getBaggageDetails() {
        return baggageDetails;
    }

    /**
     * Sets the value of the baggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public void setBaggageDetails(BaggageDetailsTypeI value) {
        this.baggageDetails = value;
    }

    /**
     * Gets the value of the otherBaggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public BaggageDetailsTypeI getOtherBaggageDetails() {
        return otherBaggageDetails;
    }

    /**
     * Sets the value of the otherBaggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public void setOtherBaggageDetails(BaggageDetailsTypeI value) {
        this.otherBaggageDetails = value;
    }

    /**
     * Gets the value of the extraBaggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public BaggageDetailsTypeI getExtraBaggageDetails() {
        return extraBaggageDetails;
    }

    /**
     * Sets the value of the extraBaggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public void setExtraBaggageDetails(BaggageDetailsTypeI value) {
        this.extraBaggageDetails = value;
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
     * {@link BagtagDetailsTypeI }
     * 
     * 
     */
    public List<BagtagDetailsTypeI> getBagTagDetails() {
        if (bagTagDetails == null) {
            bagTagDetails = new ArrayList<BagtagDetailsTypeI>();
        }
        return this.bagTagDetails;
    }

}
