
package com.amadeus.xml.smpres_13_1_ia;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the status of a column of seats.
 * 
 * <p>Java class for CabinWidthAndColumnDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinWidthAndColumnDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seatColumn" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To1"/>
 *         &lt;element name="description" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To2" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinWidthAndColumnDetailsTypeI", propOrder = {
    "seatColumn",
    "description"
})
public class CabinWidthAndColumnDetailsTypeI {

    @XmlElement(required = true)
    protected String seatColumn;
    protected List<String> description;

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
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

}
