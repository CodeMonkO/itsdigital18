
package com.amadeus.xml.tpcbrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Exchange and link unique identifiers
 * 
 * <p>Java class for ItemReferencesAndVersionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemReferencesAndVersionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequenceSection" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}UniqueIdDescriptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemReferencesAndVersionsType", propOrder = {
    "sequenceSection"
})
public class ItemReferencesAndVersionsType {

    protected UniqueIdDescriptionType sequenceSection;

    /**
     * Gets the value of the sequenceSection property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdDescriptionType }
     *     
     */
    public UniqueIdDescriptionType getSequenceSection() {
        return sequenceSection;
    }

    /**
     * Sets the value of the sequenceSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdDescriptionType }
     *     
     */
    public void setSequenceSection(UniqueIdDescriptionType value) {
        this.sequenceSection = value;
    }

}
