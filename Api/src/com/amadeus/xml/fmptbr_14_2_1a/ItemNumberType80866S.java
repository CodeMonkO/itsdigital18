
package com.amadeus.xml.fmptbr_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an item number
 * 
 * <p>Java class for ItemNumberType_80866S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNumberType_80866S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNumberDetails" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}ItemNumberIdentificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNumberType_80866S", propOrder = {
    "itemNumberDetails"
})
public class ItemNumberType80866S {

    @XmlElement(required = true)
    protected ItemNumberIdentificationType itemNumberDetails;

    /**
     * Gets the value of the itemNumberDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberIdentificationType }
     *     
     */
    public ItemNumberIdentificationType getItemNumberDetails() {
        return itemNumberDetails;
    }

    /**
     * Sets the value of the itemNumberDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberIdentificationType }
     *     
     */
    public void setItemNumberDetails(ItemNumberIdentificationType value) {
        this.itemNumberDetails = value;
    }

}
