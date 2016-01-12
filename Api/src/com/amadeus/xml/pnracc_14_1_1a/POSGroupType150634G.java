
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * to convey the pnr point of sell
 * 
 * <p>Java class for POSGroupType_150634G complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POSGroupType_150634G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pointOfSaleInformationType" type="{http://xml.amadeus.com/PNRACC_14_1_1A}PointOfSaleInformationType"/>
 *         &lt;element name="sbrUserIdentification" type="{http://xml.amadeus.com/PNRACC_14_1_1A}UserIdentificationType_132824S"/>
 *         &lt;element name="sbrSystemDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SystemDetailsInfoType" minOccurs="0"/>
 *         &lt;element name="sbrPreferences" type="{http://xml.amadeus.com/PNRACC_14_1_1A}UserPreferencesType" minOccurs="0"/>
 *         &lt;element name="agentId" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TicketAgentInfoType" minOccurs="0"/>
 *         &lt;element name="pointOfSaleDate" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_132821S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POSGroupType_150634G", propOrder = {
    "pointOfSaleInformationType",
    "sbrUserIdentification",
    "sbrSystemDetails",
    "sbrPreferences",
    "agentId",
    "pointOfSaleDate"
})
public class POSGroupType150634G {

    @XmlElement(required = true)
    protected PointOfSaleInformationType pointOfSaleInformationType;
    @XmlElement(required = true)
    protected UserIdentificationType132824S sbrUserIdentification;
    protected SystemDetailsInfoType sbrSystemDetails;
    protected UserPreferencesType sbrPreferences;
    protected TicketAgentInfoType agentId;
    protected StructuredDateTimeInformationType132821S pointOfSaleDate;

    /**
     * Gets the value of the pointOfSaleInformationType property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSaleInformationType }
     *     
     */
    public PointOfSaleInformationType getPointOfSaleInformationType() {
        return pointOfSaleInformationType;
    }

    /**
     * Sets the value of the pointOfSaleInformationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSaleInformationType }
     *     
     */
    public void setPointOfSaleInformationType(PointOfSaleInformationType value) {
        this.pointOfSaleInformationType = value;
    }

    /**
     * Gets the value of the sbrUserIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentificationType132824S }
     *     
     */
    public UserIdentificationType132824S getSbrUserIdentification() {
        return sbrUserIdentification;
    }

    /**
     * Sets the value of the sbrUserIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentificationType132824S }
     *     
     */
    public void setSbrUserIdentification(UserIdentificationType132824S value) {
        this.sbrUserIdentification = value;
    }

    /**
     * Gets the value of the sbrSystemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsInfoType }
     *     
     */
    public SystemDetailsInfoType getSbrSystemDetails() {
        return sbrSystemDetails;
    }

    /**
     * Sets the value of the sbrSystemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsInfoType }
     *     
     */
    public void setSbrSystemDetails(SystemDetailsInfoType value) {
        this.sbrSystemDetails = value;
    }

    /**
     * Gets the value of the sbrPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link UserPreferencesType }
     *     
     */
    public UserPreferencesType getSbrPreferences() {
        return sbrPreferences;
    }

    /**
     * Sets the value of the sbrPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPreferencesType }
     *     
     */
    public void setSbrPreferences(UserPreferencesType value) {
        this.sbrPreferences = value;
    }

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link TicketAgentInfoType }
     *     
     */
    public TicketAgentInfoType getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketAgentInfoType }
     *     
     */
    public void setAgentId(TicketAgentInfoType value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the pointOfSaleDate property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType132821S }
     *     
     */
    public StructuredDateTimeInformationType132821S getPointOfSaleDate() {
        return pointOfSaleDate;
    }

    /**
     * Sets the value of the pointOfSaleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType132821S }
     *     
     */
    public void setPointOfSaleDate(StructuredDateTimeInformationType132821S value) {
        this.pointOfSaleDate = value;
    }

}
