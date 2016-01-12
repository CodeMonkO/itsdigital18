
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Product Details
 * 
 * <p>Java class for InsuranceProductDetailsType_129160S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceProductDetailsType_129160S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyCode" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="productDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ProviderInformationType_188200C" minOccurs="0"/>
 *         &lt;element name="extensionIdentification" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ProviderInformationType_188200C" maxOccurs="7" minOccurs="0"/>
 *         &lt;element name="extraReference" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To60" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="tariffCodeDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TariffcodeType" maxOccurs="48" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceProductDetailsType_129160S", propOrder = {
    "companyCode",
    "countryCode",
    "productDetails",
    "extensionIdentification",
    "extraReference",
    "tariffCodeDetails"
})
public class InsuranceProductDetailsType129160S {

    protected String companyCode;
    protected String countryCode;
    protected ProviderInformationType188200C productDetails;
    protected List<ProviderInformationType188200C> extensionIdentification;
    protected List<String> extraReference;
    protected List<TariffcodeType> tariffCodeDetails;

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
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderInformationType188200C }
     *     
     */
    public ProviderInformationType188200C getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderInformationType188200C }
     *     
     */
    public void setProductDetails(ProviderInformationType188200C value) {
        this.productDetails = value;
    }

    /**
     * Gets the value of the extensionIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderInformationType188200C }
     * 
     * 
     */
    public List<ProviderInformationType188200C> getExtensionIdentification() {
        if (extensionIdentification == null) {
            extensionIdentification = new ArrayList<ProviderInformationType188200C>();
        }
        return this.extensionIdentification;
    }

    /**
     * Gets the value of the extraReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExtraReference() {
        if (extraReference == null) {
            extraReference = new ArrayList<String>();
        }
        return this.extraReference;
    }

    /**
     * Gets the value of the tariffCodeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffCodeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffCodeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffcodeType }
     * 
     * 
     */
    public List<TariffcodeType> getTariffCodeDetails() {
        if (tariffCodeDetails == null) {
            tariffCodeDetails = new ArrayList<TariffcodeType>();
        }
        return this.tariffCodeDetails;
    }

}
