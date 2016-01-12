
package com.amadeus.xml.fmptbq_14_2_1a;

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
 *         &lt;element name="carrierFeeDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}SelectionDetailsInformationType"/>
 *         &lt;element name="otherSelectionDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}SelectionDetailsInformationTypeI" maxOccurs="98" minOccurs="0"/>
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
    "carrierFeeDetails",
    "otherSelectionDetails"
})
public class SelectionDetailsType {

    @XmlElement(required = true)
    protected SelectionDetailsInformationType carrierFeeDetails;
    protected List<SelectionDetailsInformationTypeI> otherSelectionDetails;

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

    /**
     * Gets the value of the otherSelectionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherSelectionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherSelectionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionDetailsInformationTypeI }
     * 
     * 
     */
    public List<SelectionDetailsInformationTypeI> getOtherSelectionDetails() {
        if (otherSelectionDetails == null) {
            otherSelectionDetails = new ArrayList<SelectionDetailsInformationTypeI>();
        }
        return this.otherSelectionDetails;
    }

}
