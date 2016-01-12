
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify monetary information details
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
 *         &lt;element name="moneyInfo" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}MonetaryInformationDetailsTypeI"/>
 *         &lt;element name="additionalMoneyInfo" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}MonetaryInformationDetailsTypeI_194597C" maxOccurs="19" minOccurs="0"/>
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
    "moneyInfo",
    "additionalMoneyInfo"
})
public class MonetaryInformationType {

    @XmlElement(required = true)
    protected MonetaryInformationDetailsTypeI moneyInfo;
    protected List<MonetaryInformationDetailsTypeI194597C> additionalMoneyInfo;

    /**
     * Gets the value of the moneyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsTypeI }
     *     
     */
    public MonetaryInformationDetailsTypeI getMoneyInfo() {
        return moneyInfo;
    }

    /**
     * Sets the value of the moneyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsTypeI }
     *     
     */
    public void setMoneyInfo(MonetaryInformationDetailsTypeI value) {
        this.moneyInfo = value;
    }

    /**
     * Gets the value of the additionalMoneyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalMoneyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalMoneyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationDetailsTypeI194597C }
     * 
     * 
     */
    public List<MonetaryInformationDetailsTypeI194597C> getAdditionalMoneyInfo() {
        if (additionalMoneyInfo == null) {
            additionalMoneyInfo = new ArrayList<MonetaryInformationDetailsTypeI194597C>();
        }
        return this.additionalMoneyInfo;
    }

}
