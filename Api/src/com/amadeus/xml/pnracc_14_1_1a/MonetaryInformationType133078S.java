
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey monetary amounts, rates and percentages.
 * 
 * <p>Java class for MonetaryInformationType_133078S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationType_133078S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monetaryDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}MonetaryInformationDetailsTypeI_193080C"/>
 *         &lt;element name="otherMonetaryDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}MonetaryInformationDetailsTypeI_193080C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationType_133078S", propOrder = {
    "monetaryDetails",
    "otherMonetaryDetails"
})
public class MonetaryInformationType133078S {

    @XmlElement(required = true)
    protected MonetaryInformationDetailsTypeI193080C monetaryDetails;
    protected MonetaryInformationDetailsTypeI193080C otherMonetaryDetails;

    /**
     * Gets the value of the monetaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsTypeI193080C }
     *     
     */
    public MonetaryInformationDetailsTypeI193080C getMonetaryDetails() {
        return monetaryDetails;
    }

    /**
     * Sets the value of the monetaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsTypeI193080C }
     *     
     */
    public void setMonetaryDetails(MonetaryInformationDetailsTypeI193080C value) {
        this.monetaryDetails = value;
    }

    /**
     * Gets the value of the otherMonetaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsTypeI193080C }
     *     
     */
    public MonetaryInformationDetailsTypeI193080C getOtherMonetaryDetails() {
        return otherMonetaryDetails;
    }

    /**
     * Sets the value of the otherMonetaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsTypeI193080C }
     *     
     */
    public void setOtherMonetaryDetails(MonetaryInformationDetailsTypeI193080C value) {
        this.otherMonetaryDetails = value;
    }

}
