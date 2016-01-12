
package com.amadeus.xml.fmptbq_14_2_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalProductDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipmentType" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="operatingDay" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To7" minOccurs="0"/>
 *         &lt;element name="techStopNumber" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}NumericInteger_Length1To2" minOccurs="0"/>
 *         &lt;element name="locationId" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaString_Length3To5" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductDetailsType", propOrder = {
    "equipmentType",
    "operatingDay",
    "techStopNumber",
    "locationId"
})
public class AdditionalProductDetailsType {

    protected String equipmentType;
    protected String operatingDay;
    protected BigInteger techStopNumber;
    protected List<String> locationId;

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentType(String value) {
        this.equipmentType = value;
    }

    /**
     * Gets the value of the operatingDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingDay() {
        return operatingDay;
    }

    /**
     * Sets the value of the operatingDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingDay(String value) {
        this.operatingDay = value;
    }

    /**
     * Gets the value of the techStopNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTechStopNumber() {
        return techStopNumber;
    }

    /**
     * Sets the value of the techStopNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTechStopNumber(BigInteger value) {
        this.techStopNumber = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocationId() {
        if (locationId == null) {
            locationId = new ArrayList<String>();
        }
        return this.locationId;
    }

}
