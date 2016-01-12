
package com.amadeus.xml.fmptbr_14_2_1a;

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
 *         &lt;element name="carrierFeeDetails" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}SelectionDetailsInformationType"/>
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
    "carrierFeeDetails"
})
public class SelectionDetailsType {

    @XmlElement(required = true)
    protected SelectionDetailsInformationType carrierFeeDetails;

    /**
     * Gets the value of the carrierFeeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsInformationType }
     *     
     */
    public SelectionDetailsInformationType getCarrierFeeDetails() {
        return carrierFeeDetails;
    }

    /**
     * Sets the value of the carrierFeeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsInformationType }
     *     
     */
    public void setCarrierFeeDetails(SelectionDetailsInformationType value) {
        this.carrierFeeDetails = value;
    }

}
