
package com.amadeus.xml.tipnrr_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey monetary amounts, rates and percentages.
 * 
 * <p>Java class for MonetaryInformationType_157205S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationType_157205S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monetaryDetails" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationDetailsType_223848C"/>
 *         &lt;element name="otherMonetaryDetails" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationDetailsType_223848C" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationType_157205S", propOrder = {
    "monetaryDetails",
    "otherMonetaryDetails"
})
public class MonetaryInformationType157205S {

    @XmlElement(required = true)
    protected MonetaryInformationDetailsType223848C monetaryDetails;
    protected List<MonetaryInformationDetailsType223848C> otherMonetaryDetails;

    /**
     * Gets the value of the monetaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsType223848C }
     *     
     */
    public MonetaryInformationDetailsType223848C getMonetaryDetails() {
        return monetaryDetails;
    }

    /**
     * Sets the value of the monetaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsType223848C }
     *     
     */
    public void setMonetaryDetails(MonetaryInformationDetailsType223848C value) {
        this.monetaryDetails = value;
    }

    /**
     * Gets the value of the otherMonetaryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherMonetaryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherMonetaryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationDetailsType223848C }
     * 
     * 
     */
    public List<MonetaryInformationDetailsType223848C> getOtherMonetaryDetails() {
        if (otherMonetaryDetails == null) {
            otherMonetaryDetails = new ArrayList<MonetaryInformationDetailsType223848C>();
        }
        return this.otherMonetaryDetails;
    }

}
