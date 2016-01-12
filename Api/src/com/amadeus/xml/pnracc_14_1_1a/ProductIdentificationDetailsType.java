
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Code, number or name to identify a specific product or service and a code to identify the level or type of product or service.
 * 
 * <p>Java class for ProductIdentificationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentificationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productIdCharacteristic" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="description1" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *         &lt;element name="description2" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *         &lt;element name="name" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentificationDetailsType", propOrder = {
    "productIdCharacteristic",
    "description1",
    "description2",
    "name"
})
public class ProductIdentificationDetailsType {

    @XmlElement(required = true)
    protected String productIdCharacteristic;
    protected String description1;
    protected String description2;
    protected String name;

    /**
     * Gets the value of the productIdCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdCharacteristic() {
        return productIdCharacteristic;
    }

    /**
     * Sets the value of the productIdCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdCharacteristic(String value) {
        this.productIdCharacteristic = value;
    }

    /**
     * Gets the value of the description1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription1() {
        return description1;
    }

    /**
     * Sets the value of the description1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription1(String value) {
        this.description1 = value;
    }

    /**
     * Gets the value of the description2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription2() {
        return description2;
    }

    /**
     * Sets the value of the description2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription2(String value) {
        this.description2 = value;
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

}
