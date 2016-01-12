
package com.amadeus.xml.tpcbrr_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareComponentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareComponentID" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ItemNumberType"/>
 *         &lt;element name="marketFareComponent" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TravelProductInformationTypeI" minOccurs="0"/>
 *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationType_157196S" minOccurs="0"/>
 *         &lt;element name="componentClassInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}PricingOrTicketingSubsequentType" minOccurs="0"/>
 *         &lt;element name="fareQualifiersDetail" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}FareQualifierDetailsType" minOccurs="0"/>
 *         &lt;element name="couponDetailsGroup" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CouponDetailsType" maxOccurs="99"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentDetailsType", propOrder = {
    "fareComponentID",
    "marketFareComponent",
    "monetaryInformation",
    "componentClassInfo",
    "fareQualifiersDetail",
    "couponDetailsGroup"
})
public class FareComponentDetailsType {

    @XmlElement(required = true)
    protected ItemNumberType fareComponentID;
    protected TravelProductInformationTypeI marketFareComponent;
    protected MonetaryInformationType157196S monetaryInformation;
    protected PricingOrTicketingSubsequentType componentClassInfo;
    protected FareQualifierDetailsType fareQualifiersDetail;
    @XmlElement(required = true)
    protected List<CouponDetailsType> couponDetailsGroup;

    /**
     * Gets the value of the fareComponentID property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberType }
     *     
     */
    public ItemNumberType getFareComponentID() {
        return fareComponentID;
    }

    /**
     * Sets the value of the fareComponentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberType }
     *     
     */
    public void setFareComponentID(ItemNumberType value) {
        this.fareComponentID = value;
    }

    /**
     * Gets the value of the marketFareComponent property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationTypeI }
     *     
     */
    public TravelProductInformationTypeI getMarketFareComponent() {
        return marketFareComponent;
    }

    /**
     * Sets the value of the marketFareComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationTypeI }
     *     
     */
    public void setMarketFareComponent(TravelProductInformationTypeI value) {
        this.marketFareComponent = value;
    }

    /**
     * Gets the value of the monetaryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType157196S }
     *     
     */
    public MonetaryInformationType157196S getMonetaryInformation() {
        return monetaryInformation;
    }

    /**
     * Sets the value of the monetaryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType157196S }
     *     
     */
    public void setMonetaryInformation(MonetaryInformationType157196S value) {
        this.monetaryInformation = value;
    }

    /**
     * Gets the value of the componentClassInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PricingOrTicketingSubsequentType }
     *     
     */
    public PricingOrTicketingSubsequentType getComponentClassInfo() {
        return componentClassInfo;
    }

    /**
     * Sets the value of the componentClassInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingOrTicketingSubsequentType }
     *     
     */
    public void setComponentClassInfo(PricingOrTicketingSubsequentType value) {
        this.componentClassInfo = value;
    }

    /**
     * Gets the value of the fareQualifiersDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareQualifierDetailsType }
     *     
     */
    public FareQualifierDetailsType getFareQualifiersDetail() {
        return fareQualifiersDetail;
    }

    /**
     * Sets the value of the fareQualifiersDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareQualifierDetailsType }
     *     
     */
    public void setFareQualifiersDetail(FareQualifierDetailsType value) {
        this.fareQualifiersDetail = value;
    }

    /**
     * Gets the value of the couponDetailsGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponDetailsGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponDetailsGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponDetailsType }
     * 
     * 
     */
    public List<CouponDetailsType> getCouponDetailsGroup() {
        if (couponDetailsGroup == null) {
            couponDetailsGroup = new ArrayList<CouponDetailsType>();
        }
        return this.couponDetailsGroup;
    }

}
