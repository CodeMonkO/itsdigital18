
package com.amadeus.xml.smpres_13_1_ia;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the individual seat information for seats in a particular row.
 * 
 * <p>Java class for RowDetailsTypeI_168302S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowDetailsTypeI_168302S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seatRowNumber" type="{http://xml.amadeus.com/SMPRES_13_1_IA}NumericInteger_Length1To3"/>
 *         &lt;element name="seatOccupationDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}SeatOccupationDetailsTypeI_237903C" maxOccurs="12" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowDetailsTypeI_168302S", propOrder = {
    "seatRowNumber",
    "seatOccupationDetails"
})
public class RowDetailsTypeI168302S {

    @XmlElement(required = true)
    protected BigInteger seatRowNumber;
    protected List<SeatOccupationDetailsTypeI237903C> seatOccupationDetails;

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
     * Gets the value of the seatOccupationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatOccupationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatOccupationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatOccupationDetailsTypeI237903C }
     * 
     * 
     */
    public List<SeatOccupationDetailsTypeI237903C> getSeatOccupationDetails() {
        if (seatOccupationDetails == null) {
            seatOccupationDetails = new ArrayList<SeatOccupationDetailsTypeI237903C>();
        }
        return this.seatOccupationDetails;
    }

}
