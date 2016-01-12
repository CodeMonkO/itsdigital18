
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains flight travel (date, time, flight number,...) and posting avaibility information
 * 
 * <p>Java class for TravelProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productDateTime" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ProductDateTimeType_195546C"/>
 *         &lt;element name="location" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}LocationIdentificationDetailsType" maxOccurs="2"/>
 *         &lt;element name="companyId" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}CompanyIdentificationType_195544C" minOccurs="0"/>
 *         &lt;element name="flightOrtrainNumber" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To8" minOccurs="0"/>
 *         &lt;element name="productDetail" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AdditionalProductDetailsType" minOccurs="0"/>
 *         &lt;element name="addProductDetail" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ProductFacilitiesType" minOccurs="0"/>
 *         &lt;element name="attributeDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}CodedAttributeInformationType_247828C" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductType", propOrder = {
    "productDateTime",
    "location",
    "companyId",
    "flightOrtrainNumber",
    "productDetail",
    "addProductDetail",
    "attributeDetails"
})
public class TravelProductType {

    @XmlElement(required = true)
    protected ProductDateTimeType195546C productDateTime;
    @XmlElement(required = true)
    protected List<LocationIdentificationDetailsType> location;
    protected CompanyIdentificationType195544C companyId;
    protected String flightOrtrainNumber;
    protected AdditionalProductDetailsType productDetail;
    protected ProductFacilitiesType addProductDetail;
    protected List<CodedAttributeInformationType247828C> attributeDetails;

    /**
     * Gets the value of the productDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeType195546C }
     *     
     */
    public ProductDateTimeType195546C getProductDateTime() {
        return productDateTime;
    }

    /**
     * Sets the value of the productDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeType195546C }
     *     
     */
    public void setProductDateTime(ProductDateTimeType195546C value) {
        this.productDateTime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationIdentificationDetailsType }
     * 
     * 
     */
    public List<LocationIdentificationDetailsType> getLocation() {
        if (location == null) {
            location = new ArrayList<LocationIdentificationDetailsType>();
        }
        return this.location;
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationType195544C }
     *     
     */
    public CompanyIdentificationType195544C getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationType195544C }
     *     
     */
    public void setCompanyId(CompanyIdentificationType195544C value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the flightOrtrainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightOrtrainNumber() {
        return flightOrtrainNumber;
    }

    /**
     * Sets the value of the flightOrtrainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightOrtrainNumber(String value) {
        this.flightOrtrainNumber = value;
    }

    /**
     * Gets the value of the productDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductDetailsType }
     *     
     */
    public AdditionalProductDetailsType getProductDetail() {
        return productDetail;
    }

    /**
     * Sets the value of the productDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductDetailsType }
     *     
     */
    public void setProductDetail(AdditionalProductDetailsType value) {
        this.productDetail = value;
    }

    /**
     * Gets the value of the addProductDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFacilitiesType }
     *     
     */
    public ProductFacilitiesType getAddProductDetail() {
        return addProductDetail;
    }

    /**
     * Sets the value of the addProductDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFacilitiesType }
     *     
     */
    public void setAddProductDetail(ProductFacilitiesType value) {
        this.addProductDetail = value;
    }

    /**
     * Gets the value of the attributeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedAttributeInformationType247828C }
     * 
     * 
     */
    public List<CodedAttributeInformationType247828C> getAttributeDetails() {
        if (attributeDetails == null) {
            attributeDetails = new ArrayList<CodedAttributeInformationType247828C>();
        }
        return this.attributeDetails;
    }

}
