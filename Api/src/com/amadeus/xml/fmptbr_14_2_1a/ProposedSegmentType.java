
package com.amadeus.xml.fmptbr_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the parameters used for product quality
 * 
 * <p>Java class for ProposedSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposedSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightProposal" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}ProposedSegmentDetailsType" maxOccurs="9"/>
 *         &lt;element name="flightCharacteristic" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length0To3" minOccurs="0"/>
 *         &lt;element name="majCabin" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposedSegmentType", propOrder = {
    "flightProposal",
    "flightCharacteristic",
    "majCabin"
})
public class ProposedSegmentType {

    @XmlElement(required = true)
    protected List<ProposedSegmentDetailsType> flightProposal;
    protected String flightCharacteristic;
    protected String majCabin;

    /**
     * Gets the value of the flightProposal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightProposal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightProposal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProposedSegmentDetailsType }
     * 
     * 
     */
    public List<ProposedSegmentDetailsType> getFlightProposal() {
        if (flightProposal == null) {
            flightProposal = new ArrayList<ProposedSegmentDetailsType>();
        }
        return this.flightProposal;
    }

    /**
     * Gets the value of the flightCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightCharacteristic() {
        return flightCharacteristic;
    }

    /**
     * Sets the value of the flightCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightCharacteristic(String value) {
        this.flightCharacteristic = value;
    }

    /**
     * Gets the value of the majCabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajCabin() {
        return majCabin;
    }

    /**
     * Sets the value of the majCabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajCabin(String value) {
        this.majCabin = value;
    }

}
