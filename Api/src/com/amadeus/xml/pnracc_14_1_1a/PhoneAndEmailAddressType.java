
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a phone or email address
 * 
 * <p>Java class for PhoneAndEmailAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneAndEmailAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneOrEmailType" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To4"/>
 *         &lt;element name="telephoneNumber" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredTelephoneNumberType_187460C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneAndEmailAddressType", propOrder = {
    "phoneOrEmailType",
    "telephoneNumber"
})
public class PhoneAndEmailAddressType {

    @XmlElement(required = true)
    protected String phoneOrEmailType;
    protected StructuredTelephoneNumberType187460C telephoneNumber;

    /**
     * Gets the value of the phoneOrEmailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneOrEmailType() {
        return phoneOrEmailType;
    }

    /**
     * Sets the value of the phoneOrEmailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneOrEmailType(String value) {
        this.phoneOrEmailType = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTelephoneNumberType187460C }
     *     
     */
    public StructuredTelephoneNumberType187460C getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTelephoneNumberType187460C }
     *     
     */
    public void setTelephoneNumber(StructuredTelephoneNumberType187460C value) {
        this.telephoneNumber = value;
    }

}
