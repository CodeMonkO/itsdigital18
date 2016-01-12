
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a unit of equipment.
 * 
 * <p>Java class for EquipmentDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentDetailsTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="sizeTypeDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}EquipmentTypeAndSizeTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentDetailsTypeU", propOrder = {
    "type",
    "sizeTypeDetails"
})
public class EquipmentDetailsTypeU {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected EquipmentTypeAndSizeTypeU sizeTypeDetails;

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
     * Gets the value of the sizeTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentTypeAndSizeTypeU }
     *     
     */
    public EquipmentTypeAndSizeTypeU getSizeTypeDetails() {
        return sizeTypeDetails;
    }

    /**
     * Sets the value of the sizeTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentTypeAndSizeTypeU }
     *     
     */
    public void setSizeTypeDetails(EquipmentTypeAndSizeTypeU value) {
        this.sizeTypeDetails = value;
    }

}
