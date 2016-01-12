
package com.amadeus.xml.tipnrr_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate the type and function of a message or part of a message.
 * 
 * <p>Java class for MessageFunctionBusinessDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageFunctionBusinessDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessFunction" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="messageFunction" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="responsibleAgency" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="additionalMessageFunction" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}AlphaNumericString_Length1To3" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageFunctionBusinessDetailsTypeI", propOrder = {
    "businessFunction",
    "messageFunction",
    "responsibleAgency",
    "additionalMessageFunction"
})
public class MessageFunctionBusinessDetailsTypeI {

    protected String businessFunction;
    protected String messageFunction;
    protected String responsibleAgency;
    protected List<String> additionalMessageFunction;

    /**
     * Gets the value of the businessFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessFunction() {
        return businessFunction;
    }

    /**
     * Sets the value of the businessFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessFunction(String value) {
        this.businessFunction = value;
    }

    /**
     * Gets the value of the messageFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageFunction() {
        return messageFunction;
    }

    /**
     * Sets the value of the messageFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageFunction(String value) {
        this.messageFunction = value;
    }

    /**
     * Gets the value of the responsibleAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleAgency() {
        return responsibleAgency;
    }

    /**
     * Sets the value of the responsibleAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleAgency(String value) {
        this.responsibleAgency = value;
    }

    /**
     * Gets the value of the additionalMessageFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalMessageFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalMessageFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalMessageFunction() {
        if (additionalMessageFunction == null) {
            additionalMessageFunction = new ArrayList<String>();
        }
        return this.additionalMessageFunction;
    }

}
