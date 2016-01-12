
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify pricing/ticketing details
 * 
 * <p>Java class for PricingTicketingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pricingTicketing" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}PricingTicketingInformationType" minOccurs="0"/>
 *         &lt;element name="ticketingDate" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ProductDateTimeTypeI_194598C" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}CompanyIdentificationType" minOccurs="0"/>
 *         &lt;element name="sellingPoint" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}LocationDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="ticketingPoint" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}LocationDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="journeyOriginPoint" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}LocationDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="corporateId" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AgentIdentificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingDetailsType", propOrder = {
    "pricingTicketing",
    "ticketingDate",
    "companyId",
    "sellingPoint",
    "ticketingPoint",
    "journeyOriginPoint",
    "corporateId"
})
public class PricingTicketingDetailsType {

    protected PricingTicketingInformationType pricingTicketing;
    protected ProductDateTimeTypeI194598C ticketingDate;
    protected CompanyIdentificationType companyId;
    protected LocationDetailsTypeI sellingPoint;
    protected LocationDetailsTypeI ticketingPoint;
    protected LocationDetailsTypeI journeyOriginPoint;
    protected AgentIdentificationType corporateId;

    /**
     * Gets the value of the pricingTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingInformationType }
     *     
     */
    public PricingTicketingInformationType getPricingTicketing() {
        return pricingTicketing;
    }

    /**
     * Sets the value of the pricingTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingInformationType }
     *     
     */
    public void setPricingTicketing(PricingTicketingInformationType value) {
        this.pricingTicketing = value;
    }

    /**
     * Gets the value of the ticketingDate property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI194598C }
     *     
     */
    public ProductDateTimeTypeI194598C getTicketingDate() {
        return ticketingDate;
    }

    /**
     * Sets the value of the ticketingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI194598C }
     *     
     */
    public void setTicketingDate(ProductDateTimeTypeI194598C value) {
        this.ticketingDate = value;
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationType }
     *     
     */
    public CompanyIdentificationType getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationType }
     *     
     */
    public void setCompanyId(CompanyIdentificationType value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the sellingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public LocationDetailsTypeI getSellingPoint() {
        return sellingPoint;
    }

    /**
     * Sets the value of the sellingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public void setSellingPoint(LocationDetailsTypeI value) {
        this.sellingPoint = value;
    }

    /**
     * Gets the value of the ticketingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public LocationDetailsTypeI getTicketingPoint() {
        return ticketingPoint;
    }

    /**
     * Sets the value of the ticketingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public void setTicketingPoint(LocationDetailsTypeI value) {
        this.ticketingPoint = value;
    }

    /**
     * Gets the value of the journeyOriginPoint property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public LocationDetailsTypeI getJourneyOriginPoint() {
        return journeyOriginPoint;
    }

    /**
     * Sets the value of the journeyOriginPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public void setJourneyOriginPoint(LocationDetailsTypeI value) {
        this.journeyOriginPoint = value;
    }

    /**
     * Gets the value of the corporateId property.
     * 
     * @return
     *     possible object is
     *     {@link AgentIdentificationType }
     *     
     */
    public AgentIdentificationType getCorporateId() {
        return corporateId;
    }

    /**
     * Sets the value of the corporateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentIdentificationType }
     *     
     */
    public void setCorporateId(AgentIdentificationType value) {
        this.corporateId = value;
    }

}
