
package com.amadeus.xml.itareq_05_2_ia;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify details concerning the marriage status of travel product.
 * 
 * <p>Java class for MarriageControlDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarriageControlDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relation" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="marriageIdentifier" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}NumericInteger_Length1To10" minOccurs="0"/>
 *         &lt;element name="lineNumber" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}NumericInteger_Length1To6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarriageControlDetailsTypeI", propOrder = {
    "relation",
    "marriageIdentifier",
    "lineNumber"
})
public class MarriageControlDetailsTypeI {

    protected String relation;
    protected BigInteger marriageIdentifier;
    protected BigInteger lineNumber;

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

    /**
     * Gets the value of the marriageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarriageIdentifier() {
        return marriageIdentifier;
    }

    /**
     * Sets the value of the marriageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarriageIdentifier(BigInteger value) {
        this.marriageIdentifier = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

}
