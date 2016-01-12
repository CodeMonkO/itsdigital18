
package com.amadeus.xml.fmptbr_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Compagny identification text
 * 
 * <p>Java class for CompanyIdentificationTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentificationTextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="textRefNumber" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}NumericInteger_Length0To4" minOccurs="0"/>
 *         &lt;element name="companyText" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length0To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentificationTextType", propOrder = {
    "textRefNumber",
    "companyText"
})
public class CompanyIdentificationTextType {

    protected BigInteger textRefNumber;
    protected String companyText;

    /**
     * Gets the value of the textRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextRefNumber() {
        return textRefNumber;
    }

    /**
     * Sets the value of the textRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextRefNumber(BigInteger value) {
        this.textRefNumber = value;
    }

    /**
     * Gets the value of the companyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyText() {
        return companyText;
    }

    /**
     * Sets the value of the companyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyText(String value) {
        this.companyText = value;
    }

}
