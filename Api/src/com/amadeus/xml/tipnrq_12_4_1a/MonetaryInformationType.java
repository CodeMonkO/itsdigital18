
package com.amadeus.xml.tipnrq_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey monetary amounts, rates and percentages.
 * 
 * <p>Java class for MonetaryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monetaryDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}MonetaryInformationDetailsType_209983C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationType", propOrder = {
    "monetaryDetails"
})
public class MonetaryInformationType {

    @XmlElement(required = true)
    protected MonetaryInformationDetailsType209983C monetaryDetails;

    /**
     * Gets the value of the monetaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsType209983C }
     *     
     */
    public MonetaryInformationDetailsType209983C getMonetaryDetails() {
        return monetaryDetails;
    }

    /**
     * Sets the value of the monetaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsType209983C }
     *     
     */
    public void setMonetaryDetails(MonetaryInformationDetailsType209983C value) {
        this.monetaryDetails = value;
    }

}
