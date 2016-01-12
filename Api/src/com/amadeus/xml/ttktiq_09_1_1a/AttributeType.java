
package com.amadeus.xml.ttktiq_09_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for AttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteriaDetails" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}AttributeInformationTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType", propOrder = {
    "criteriaDetails"
})
public class AttributeType {

    @XmlElement(required = true)
    protected AttributeInformationTypeU criteriaDetails;

    /**
     * Gets the value of the criteriaDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeInformationTypeU }
     *     
     */
    public AttributeInformationTypeU getCriteriaDetails() {
        return criteriaDetails;
    }

    /**
     * Sets the value of the criteriaDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeInformationTypeU }
     *     
     */
    public void setCriteriaDetails(AttributeInformationTypeU value) {
        this.criteriaDetails = value;
    }

}
