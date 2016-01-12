
package com.amadeus.xml.pnracc_14_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ecOrigin" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumericInteger_Length1To3"/>
 *         &lt;element name="reference" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ReferencingDetailsType_188870C" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="lineNumber" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedContentType", propOrder = {
    "ecOrigin",
    "reference",
    "productType",
    "lineNumber"
})
public class ExtendedContentType {

    @XmlElement(required = true)
    protected BigInteger ecOrigin;
    protected ReferencingDetailsType188870C reference;
    @XmlElement(required = true)
    protected String productType;
    protected BigInteger lineNumber;

    /**
     * Gets the value of the ecOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEcOrigin() {
        return ecOrigin;
    }

    /**
     * Sets the value of the ecOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEcOrigin(BigInteger value) {
        this.ecOrigin = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsType188870C }
     *     
     */
    public ReferencingDetailsType188870C getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsType188870C }
     *     
     */
    public void setReference(ReferencingDetailsType188870C value) {
        this.reference = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

}
