
package com.amadeus.xml.pnrspl_14_1_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * determine the element to split
 * 
 * <p>Java class for SplitPNRDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitPNRDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://xml.amadeus.com/PNRSPL_14_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="quantity" type="{http://xml.amadeus.com/PNRSPL_14_1_1A}NumericInteger_Length1To2" minOccurs="0"/>
 *         &lt;element name="tattoo" type="{http://xml.amadeus.com/PNRSPL_14_1_1A}AlphaNumericString_Length1To5" maxOccurs="49" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitPNRDetailsType", propOrder = {
    "type",
    "quantity",
    "tattoo"
})
public class SplitPNRDetailsType {

    @XmlElement(required = true)
    protected String type;
    protected BigInteger quantity;
    protected List<String> tattoo;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the tattoo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tattoo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTattoo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTattoo() {
        if (tattoo == null) {
            tattoo = new ArrayList<String>();
        }
        return this.tattoo;
    }

}
