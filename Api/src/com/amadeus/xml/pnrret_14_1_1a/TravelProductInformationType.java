
package com.amadeus.xml.pnrret_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Travel product information
 * 
 * <p>Java class for TravelProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product" type="{http://xml.amadeus.com/PNRRET_14_1_1A}ProductDateTimeTypeI" minOccurs="0"/>
 *         &lt;element name="boardpointDetail" type="{http://xml.amadeus.com/PNRRET_14_1_1A}LocationTypeI" minOccurs="0"/>
 *         &lt;element name="offpointDetail" type="{http://xml.amadeus.com/PNRRET_14_1_1A}LocationTypeI" minOccurs="0"/>
 *         &lt;element name="company" type="{http://xml.amadeus.com/PNRRET_14_1_1A}CompanyIdentificationTypeI" minOccurs="0"/>
 *         &lt;element name="productDetails" type="{http://xml.amadeus.com/PNRRET_14_1_1A}ProductIdentificationDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationType", propOrder = {
    "product",
    "boardpointDetail",
    "offpointDetail",
    "company",
    "productDetails"
})
public class TravelProductInformationType {

    protected ProductDateTimeTypeI product;
    protected LocationTypeI boardpointDetail;
    protected LocationTypeI offpointDetail;
    protected CompanyIdentificationTypeI company;
    protected ProductIdentificationDetailsTypeI productDetails;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public ProductDateTimeTypeI getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public void setProduct(ProductDateTimeTypeI value) {
        this.product = value;
    }

    /**
     * Gets the value of the boardpointDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getBoardpointDetail() {
        return boardpointDetail;
    }

    /**
     * Sets the value of the boardpointDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setBoardpointDetail(LocationTypeI value) {
        this.boardpointDetail = value;
    }

    /**
     * Gets the value of the offpointDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getOffpointDetail() {
        return offpointDetail;
    }

    /**
     * Sets the value of the offpointDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setOffpointDetail(LocationTypeI value) {
        this.offpointDetail = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public CompanyIdentificationTypeI getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public void setCompany(CompanyIdentificationTypeI value) {
        this.company = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public ProductIdentificationDetailsTypeI getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public void setProductDetails(ProductIdentificationDetailsTypeI value) {
        this.productDetails = value;
    }

}
