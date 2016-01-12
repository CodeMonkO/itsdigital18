
package com.amadeus.xml.fmptbr_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an item number
 * 
 * <p>Java class for ItemNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNumber" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}ItemNumberIdentificationType_192331C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNumberType", propOrder = {
    "itemNumber"
})
public class ItemNumberType {

    @XmlElement(required = true)
    protected ItemNumberIdentificationType192331C itemNumber;

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberIdentificationType192331C }
     *     
     */
    public ItemNumberIdentificationType192331C getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberIdentificationType192331C }
     *     
     */
    public void setItemNumber(ItemNumberIdentificationType192331C value) {
        this.itemNumber = value;
    }

}
