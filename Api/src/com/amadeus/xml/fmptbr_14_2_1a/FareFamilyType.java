
package com.amadeus.xml.fmptbr_14_2_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * NEW FARE SEACH
 * 
 * <p>Java class for FareFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFamilyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refNumber" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}NumericInteger_Length1To3"/>
 *         &lt;element name="fareFamilyname" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="hierarchy" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}NumericInteger_Length1To4" minOccurs="0"/>
 *         &lt;element name="cabin" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="commercialFamilyDetails" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}FareFamilyDetailsType" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="description" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To100" minOccurs="0"/>
 *         &lt;element name="carrier" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length2To3" minOccurs="0"/>
 *         &lt;element name="services" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}ServicesReferencesType" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFamilyType", propOrder = {
    "refNumber",
    "fareFamilyname",
    "hierarchy",
    "cabin",
    "commercialFamilyDetails",
    "description",
    "carrier",
    "services"
})
public class FareFamilyType {

    @XmlElement(required = true)
    protected BigInteger refNumber;
    protected String fareFamilyname;
    protected BigInteger hierarchy;
    protected String cabin;
    protected List<FareFamilyDetailsType> commercialFamilyDetails;
    protected String description;
    protected String carrier;
    protected List<ServicesReferencesType> services;

    /**
     * Gets the value of the refNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefNumber() {
        return refNumber;
    }

    /**
     * Sets the value of the refNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefNumber(BigInteger value) {
        this.refNumber = value;
    }

    /**
     * Gets the value of the fareFamilyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareFamilyname() {
        return fareFamilyname;
    }

    /**
     * Sets the value of the fareFamilyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareFamilyname(String value) {
        this.fareFamilyname = value;
    }

    /**
     * Gets the value of the hierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHierarchy() {
        return hierarchy;
    }

    /**
     * Sets the value of the hierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHierarchy(BigInteger value) {
        this.hierarchy = value;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabin(String value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the commercialFamilyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialFamilyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialFamilyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareFamilyDetailsType }
     * 
     * 
     */
    public List<FareFamilyDetailsType> getCommercialFamilyDetails() {
        if (commercialFamilyDetails == null) {
            commercialFamilyDetails = new ArrayList<FareFamilyDetailsType>();
        }
        return this.commercialFamilyDetails;
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

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicesReferencesType }
     * 
     * 
     */
    public List<ServicesReferencesType> getServices() {
        if (services == null) {
            services = new ArrayList<ServicesReferencesType>();
        }
        return this.services;
    }

}
