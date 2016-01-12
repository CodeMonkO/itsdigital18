
package com.amadeus.xml.tipnrq_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to availability status or cabin configuration for a product.
 * 
 * <p>Java class for ProductInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productDetailsQualifier" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="bookingClassDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}ProductDetailsTypeI" maxOccurs="26" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInformationTypeI", propOrder = {
    "productDetailsQualifier",
    "bookingClassDetails"
})
public class ProductInformationTypeI {

    protected String productDetailsQualifier;
    protected List<ProductDetailsTypeI> bookingClassDetails;

    /**
     * Gets the value of the productDetailsQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDetailsQualifier() {
        return productDetailsQualifier;
    }

    /**
     * Sets the value of the productDetailsQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDetailsQualifier(String value) {
        this.productDetailsQualifier = value;
    }

    /**
     * Gets the value of the bookingClassDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingClassDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingClassDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDetailsTypeI }
     * 
     * 
     */
    public List<ProductDetailsTypeI> getBookingClassDetails() {
        if (bookingClassDetails == null) {
            bookingClassDetails = new ArrayList<ProductDetailsTypeI>();
        }
        return this.bookingClassDetails;
    }

}
