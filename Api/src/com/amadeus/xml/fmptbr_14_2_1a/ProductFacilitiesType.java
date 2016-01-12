
package com.amadeus.xml.fmptbr_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Level of access
 * 
 * <p>Java class for ProductFacilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductFacilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastSeatAvailable" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="levelOfAccess" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="electronicTicketing" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="operationalSuffix" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="productDetailQualifier" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="flightCharacteristic" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To3" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductFacilitiesType", propOrder = {
    "lastSeatAvailable",
    "levelOfAccess",
    "electronicTicketing",
    "operationalSuffix",
    "productDetailQualifier",
    "flightCharacteristic"
})
public class ProductFacilitiesType {

    protected String lastSeatAvailable;
    protected String levelOfAccess;
    protected String electronicTicketing;
    protected String operationalSuffix;
    protected String productDetailQualifier;
    protected List<String> flightCharacteristic;

    /**
     * Gets the value of the lastSeatAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSeatAvailable() {
        return lastSeatAvailable;
    }

    /**
     * Sets the value of the lastSeatAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSeatAvailable(String value) {
        this.lastSeatAvailable = value;
    }

    /**
     * Gets the value of the levelOfAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelOfAccess() {
        return levelOfAccess;
    }

    /**
     * Sets the value of the levelOfAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelOfAccess(String value) {
        this.levelOfAccess = value;
    }

    /**
     * Gets the value of the electronicTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicTicketing() {
        return electronicTicketing;
    }

    /**
     * Sets the value of the electronicTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicTicketing(String value) {
        this.electronicTicketing = value;
    }

    /**
     * Gets the value of the operationalSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalSuffix() {
        return operationalSuffix;
    }

    /**
     * Sets the value of the operationalSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationalSuffix(String value) {
        this.operationalSuffix = value;
    }

    /**
     * Gets the value of the productDetailQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDetailQualifier() {
        return productDetailQualifier;
    }

    /**
     * Sets the value of the productDetailQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDetailQualifier(String value) {
        this.productDetailQualifier = value;
    }

    /**
     * Gets the value of the flightCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlightCharacteristic() {
        if (flightCharacteristic == null) {
            flightCharacteristic = new ArrayList<String>();
        }
        return this.flightCharacteristic;
    }

}
