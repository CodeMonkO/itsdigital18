
package com.amadeus.xml.smpreq_13_1_ia;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of seat requested.
 * 
 * <p>Java class for GenericDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinClassDesignator" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="noSmokingIndicator" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="cabinClass" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}NumericInteger_Length1To1" minOccurs="0"/>
 *         &lt;element name="compartmentDesignator" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="seatCharacteristic" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AMA_EDICodesetType_Length1to2" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericDetailsTypeI", propOrder = {
    "cabinClassDesignator",
    "noSmokingIndicator",
    "cabinClass",
    "compartmentDesignator",
    "seatCharacteristic"
})
public class GenericDetailsTypeI {

    protected String cabinClassDesignator;
    protected String noSmokingIndicator;
    protected BigInteger cabinClass;
    protected String compartmentDesignator;
    protected List<String> seatCharacteristic;

    /**
     * Gets the value of the cabinClassDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClassDesignator() {
        return cabinClassDesignator;
    }

    /**
     * Sets the value of the cabinClassDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClassDesignator(String value) {
        this.cabinClassDesignator = value;
    }

    /**
     * Gets the value of the noSmokingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSmokingIndicator() {
        return noSmokingIndicator;
    }

    /**
     * Sets the value of the noSmokingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSmokingIndicator(String value) {
        this.noSmokingIndicator = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCabinClass(BigInteger value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the compartmentDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompartmentDesignator() {
        return compartmentDesignator;
    }

    /**
     * Sets the value of the compartmentDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompartmentDesignator(String value) {
        this.compartmentDesignator = value;
    }

    /**
     * Gets the value of the seatCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeatCharacteristic() {
        if (seatCharacteristic == null) {
            seatCharacteristic = new ArrayList<String>();
        }
        return this.seatCharacteristic;
    }

}
