
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * User Identification
 * 
 * <p>Java class for UserIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="officeIdentification" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}OriginatorIdentificationDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="officeType" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="officeCode" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIdentificationType", propOrder = {
    "officeIdentification",
    "officeType",
    "officeCode"
})
public class UserIdentificationType {

    protected OriginatorIdentificationDetailsTypeI officeIdentification;
    protected String officeType;
    protected String officeCode;

    /**
     * Gets the value of the officeIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI }
     *     
     */
    public OriginatorIdentificationDetailsTypeI getOfficeIdentification() {
        return officeIdentification;
    }

    /**
     * Sets the value of the officeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI }
     *     
     */
    public void setOfficeIdentification(OriginatorIdentificationDetailsTypeI value) {
        this.officeIdentification = value;
    }

    /**
     * Gets the value of the officeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeType() {
        return officeType;
    }

    /**
     * Sets the value of the officeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeType(String value) {
        this.officeType = value;
    }

    /**
     * Gets the value of the officeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCode(String value) {
        this.officeCode = value;
    }

}
