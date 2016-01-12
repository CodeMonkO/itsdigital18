
package com.amadeus.xml.smpres_13_1_ia;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the status of a specific seat.
 * 
 * <p>Java class for SeatOccupationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatOccupationDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seatColumn" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To1"/>
 *         &lt;element name="seatOccupation" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="seatCharacteristic" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To2" maxOccurs="38" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatOccupationDetailsTypeI", propOrder = {
    "seatColumn",
    "seatOccupation",
    "seatCharacteristic"
})
public class SeatOccupationDetailsTypeI {

    @XmlElement(required = true)
    protected String seatColumn;
    protected String seatOccupation;
    protected List<String> seatCharacteristic;

    /**
     * Gets the value of the seatColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatColumn() {
        return seatColumn;
    }

    /**
     * Sets the value of the seatColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatColumn(String value) {
        this.seatColumn = value;
    }

    /**
     * Gets the value of the seatOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatOccupation() {
        return seatOccupation;
    }

    /**
     * Sets the value of the seatOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatOccupation(String value) {
        this.seatOccupation = value;
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
