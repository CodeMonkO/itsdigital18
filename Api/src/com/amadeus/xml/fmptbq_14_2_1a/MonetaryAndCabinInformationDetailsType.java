
package com.amadeus.xml.fmptbq_14_2_1a;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonetaryAndCabinInformationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryAndCabinInformationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amountType" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length0To3" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}NumericDecimal_Length1To18"/>
 *         &lt;element name="currency" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="locationId" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaString_Length3To5" minOccurs="0"/>
 *         &lt;element name="cabinClassDesignator" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaString_Length1To1" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryAndCabinInformationDetailsType", propOrder = {
    "amountType",
    "amount",
    "currency",
    "locationId",
    "cabinClassDesignator"
})
public class MonetaryAndCabinInformationDetailsType {

    protected String amountType;
    @XmlElement(required = true)
    protected BigDecimal amount;
    protected String currency;
    protected String locationId;
    protected List<String> cabinClassDesignator;

    /**
     * Gets the value of the amountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountType(String value) {
        this.amountType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the cabinClassDesignator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinClassDesignator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinClassDesignator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCabinClassDesignator() {
        if (cabinClassDesignator == null) {
            cabinClassDesignator = new ArrayList<String>();
        }
        return this.cabinClassDesignator;
    }

}
