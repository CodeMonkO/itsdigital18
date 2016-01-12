
package com.amadeus.xml.smpres_13_1_ia;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the characteristics of a row on a means of transport.
 * 
 * <p>Java class for RowCharacteristicsDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowCharacteristicsDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rowCharacteristic" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To3"/>
 *         &lt;element name="otherRowCharacteristic" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To3" maxOccurs="8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowCharacteristicsDetailsTypeI", propOrder = {
    "rowCharacteristic",
    "otherRowCharacteristic"
})
public class RowCharacteristicsDetailsTypeI {

    @XmlElement(required = true)
    protected String rowCharacteristic;
    protected List<String> otherRowCharacteristic;

    /**
     * Gets the value of the rowCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowCharacteristic() {
        return rowCharacteristic;
    }

    /**
     * Sets the value of the rowCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowCharacteristic(String value) {
        this.rowCharacteristic = value;
    }

    /**
     * Gets the value of the otherRowCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherRowCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherRowCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherRowCharacteristic() {
        if (otherRowCharacteristic == null) {
            otherRowCharacteristic = new ArrayList<String>();
        }
        return this.otherRowCharacteristic;
    }

}
