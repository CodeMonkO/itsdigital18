
package com.amadeus.xml.tautcr_04_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UniqueIdDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniqueIdDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iDSequenceNumber" type="{http://xml.amadeus.com/TAUTCR_04_1_1A}NumericInteger_Length1To11"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniqueIdDescriptionType", propOrder = {
    "idSequenceNumber"
})
public class UniqueIdDescriptionType {

    @XmlElement(name = "iDSequenceNumber", required = true)
    protected BigInteger idSequenceNumber;

    /**
     * Gets the value of the idSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDSequenceNumber() {
        return idSequenceNumber;
    }

    /**
     * Sets the value of the idSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDSequenceNumber(BigInteger value) {
        this.idSequenceNumber = value;
    }

}
