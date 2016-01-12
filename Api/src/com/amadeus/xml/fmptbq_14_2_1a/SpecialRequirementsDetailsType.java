
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify special requests or service s information relating to a traveller
 * 
 * <p>Java class for SpecialRequirementsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceRequirementsInfo" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}SpecialRequirementsTypeDetailsType"/>
 *         &lt;element name="seatDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}SpecialRequirementsDataDetailsType" maxOccurs="999" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDetailsType", propOrder = {
    "serviceRequirementsInfo",
    "seatDetails"
})
public class SpecialRequirementsDetailsType {

    @XmlElement(required = true)
    protected SpecialRequirementsTypeDetailsType serviceRequirementsInfo;
    protected List<SpecialRequirementsDataDetailsType> seatDetails;

    /**
     * Gets the value of the serviceRequirementsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsTypeDetailsType }
     *     
     */
    public SpecialRequirementsTypeDetailsType getServiceRequirementsInfo() {
        return serviceRequirementsInfo;
    }

    /**
     * Sets the value of the serviceRequirementsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsTypeDetailsType }
     *     
     */
    public void setServiceRequirementsInfo(SpecialRequirementsTypeDetailsType value) {
        this.serviceRequirementsInfo = value;
    }

    /**
     * Gets the value of the seatDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialRequirementsDataDetailsType }
     * 
     * 
     */
    public List<SpecialRequirementsDataDetailsType> getSeatDetails() {
        if (seatDetails == null) {
            seatDetails = new ArrayList<SpecialRequirementsDataDetailsType>();
        }
        return this.seatDetails;
    }

}
