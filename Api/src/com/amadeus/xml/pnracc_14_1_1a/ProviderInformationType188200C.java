
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProviderInformationType_188200C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProviderInformationType_188200C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="name" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="productFamilyCode" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="producttype" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length3To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderInformationType_188200C", propOrder = {
    "code",
    "name",
    "productFamilyCode",
    "producttype"
})
public class ProviderInformationType188200C {

    protected String code;
    protected String name;
    protected String productFamilyCode;
    protected String producttype;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the productFamilyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductFamilyCode() {
        return productFamilyCode;
    }

    /**
     * Sets the value of the productFamilyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductFamilyCode(String value) {
        this.productFamilyCode = value;
    }

    /**
     * Gets the value of the producttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducttype() {
        return producttype;
    }

    /**
     * Sets the value of the producttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducttype(String value) {
        this.producttype = value;
    }

}
