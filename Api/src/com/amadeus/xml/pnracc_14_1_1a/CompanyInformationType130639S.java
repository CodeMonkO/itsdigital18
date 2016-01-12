
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the company information
 * 
 * <p>Java class for CompanyInformationType_130639S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyInformationType_130639S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyCode" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="companyLongName" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="profileReference" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyInformationType_130639S", propOrder = {
    "companyCode",
    "companyName",
    "companyLongName",
    "profileReference"
})
public class CompanyInformationType130639S {

    protected String companyCode;
    protected String companyName;
    protected String companyLongName;
    protected String profileReference;

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyLongName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyLongName() {
        return companyLongName;
    }

    /**
     * Sets the value of the companyLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyLongName(String value) {
        this.companyLongName = value;
    }

    /**
     * Gets the value of the profileReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileReference() {
        return profileReference;
    }

    /**
     * Sets the value of the profileReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileReference(String value) {
        this.profileReference = value;
    }

}
