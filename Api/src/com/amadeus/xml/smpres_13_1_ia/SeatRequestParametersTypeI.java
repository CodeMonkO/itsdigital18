
package com.amadeus.xml.smpres_13_1_ia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the selection criteria for a seat map request.
 * 
 * <p>Java class for SeatRequestParametersTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatRequestParametersTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genericDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}GenericDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="rangeOfRowsDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}RangeOfRowsDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="processingIndicator" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="description" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRequestParametersTypeI", propOrder = {
    "genericDetails",
    "rangeOfRowsDetails",
    "processingIndicator",
    "referenceNumber",
    "description"
})
public class SeatRequestParametersTypeI {

    protected GenericDetailsTypeI genericDetails;
    protected RangeOfRowsDetailsTypeI rangeOfRowsDetails;
    protected String processingIndicator;
    protected String referenceNumber;
    protected String description;

    /**
     * Gets the value of the genericDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GenericDetailsTypeI }
     *     
     */
    public GenericDetailsTypeI getGenericDetails() {
        return genericDetails;
    }

    /**
     * Sets the value of the genericDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericDetailsTypeI }
     *     
     */
    public void setGenericDetails(GenericDetailsTypeI value) {
        this.genericDetails = value;
    }

    /**
     * Gets the value of the rangeOfRowsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RangeOfRowsDetailsTypeI }
     *     
     */
    public RangeOfRowsDetailsTypeI getRangeOfRowsDetails() {
        return rangeOfRowsDetails;
    }

    /**
     * Sets the value of the rangeOfRowsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeOfRowsDetailsTypeI }
     *     
     */
    public void setRangeOfRowsDetails(RangeOfRowsDetailsTypeI value) {
        this.rangeOfRowsDetails = value;
    }

    /**
     * Gets the value of the processingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingIndicator() {
        return processingIndicator;
    }

    /**
     * Sets the value of the processingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingIndicator(String value) {
        this.processingIndicator = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
