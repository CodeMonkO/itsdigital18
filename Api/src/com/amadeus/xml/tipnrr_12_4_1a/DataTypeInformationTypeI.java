
package com.amadeus.xml.tipnrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of data to be sent and to qualify the data when required.
 * 
 * <p>Java class for DataTypeInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataTypeInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="statusEvent" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTypeInformationTypeI", propOrder = {
    "type",
    "statusEvent"
})
public class DataTypeInformationTypeI {

    @XmlElement(required = true)
    protected String type;
    protected String statusEvent;

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
     * Gets the value of the statusEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusEvent() {
        return statusEvent;
    }

    /**
     * Sets the value of the statusEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusEvent(String value) {
        this.statusEvent = value;
    }

}
