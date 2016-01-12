
package com.amadeus.xml.smpreq_13_1_ia;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify row information for a means of transport.
 * 
 * <p>Java class for RangeOfRowsDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeOfRowsDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seatRowNumber" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}NumericInteger_Length1To3"/>
 *         &lt;element name="numberOfRows" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="seatColumn" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaNumericString_Length1To1" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeOfRowsDetailsTypeI", propOrder = {
    "seatRowNumber",
    "numberOfRows",
    "seatColumn"
})
public class RangeOfRowsDetailsTypeI {

    @XmlElement(required = true)
    protected BigInteger seatRowNumber;
    protected BigInteger numberOfRows;
    protected List<String> seatColumn;

    /**
     * Gets the value of the seatRowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeatRowNumber() {
        return seatRowNumber;
    }

    /**
     * Sets the value of the seatRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeatRowNumber(BigInteger value) {
        this.seatRowNumber = value;
    }

    /**
     * Gets the value of the numberOfRows property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRows() {
        return numberOfRows;
    }

    /**
     * Sets the value of the numberOfRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRows(BigInteger value) {
        this.numberOfRows = value;
    }

    /**
     * Gets the value of the seatColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeatColumn() {
        if (seatColumn == null) {
            seatColumn = new ArrayList<String>();
        }
        return this.seatColumn;
    }

}
