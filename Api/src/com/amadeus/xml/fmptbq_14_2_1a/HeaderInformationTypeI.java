
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify header information applicable to the entire message.
 * 
 * <p>Java class for HeaderInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="dateTimePeriodDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}DateTimePeriodDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="productIdentification" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To35" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderInformationTypeI", propOrder = {
    "status",
    "dateTimePeriodDetails",
    "referenceNumber",
    "productIdentification"
})
public class HeaderInformationTypeI {

    protected List<String> status;
    protected DateTimePeriodDetailsTypeI dateTimePeriodDetails;
    protected String referenceNumber;
    protected List<String> productIdentification;

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatus() {
        if (status == null) {
            status = new ArrayList<String>();
        }
        return this.status;
    }

    /**
     * Gets the value of the dateTimePeriodDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetailsTypeI }
     *     
     */
    public DateTimePeriodDetailsTypeI getDateTimePeriodDetails() {
        return dateTimePeriodDetails;
    }

    /**
     * Sets the value of the dateTimePeriodDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetailsTypeI }
     *     
     */
    public void setDateTimePeriodDetails(DateTimePeriodDetailsTypeI value) {
        this.dateTimePeriodDetails = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductIdentification() {
        if (productIdentification == null) {
            productIdentification = new ArrayList<String>();
        }
        return this.productIdentification;
    }

}
