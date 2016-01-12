
package com.amadeus.xml.smpreq_13_1_ia;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the number of seats for a specific class of service.
 * 
 * <p>Java class for ConfigurationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classDesignator" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaString_Length1To1"/>
 *         &lt;element name="numberOfSeats" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="characteristic" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaNumericString_Length1To17" maxOccurs="26" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationDetailsTypeI", propOrder = {
    "classDesignator",
    "numberOfSeats",
    "characteristic"
})
public class ConfigurationDetailsTypeI {

    @XmlElement(required = true)
    protected String classDesignator;
    protected BigInteger numberOfSeats;
    protected List<String> characteristic;

    /**
     * Gets the value of the classDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassDesignator() {
        return classDesignator;
    }

    /**
     * Sets the value of the classDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDesignator(String value) {
        this.classDesignator = value;
    }

    /**
     * Gets the value of the numberOfSeats property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * Sets the value of the numberOfSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSeats(BigInteger value) {
        this.numberOfSeats = value;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<String>();
        }
        return this.characteristic;
    }

}
