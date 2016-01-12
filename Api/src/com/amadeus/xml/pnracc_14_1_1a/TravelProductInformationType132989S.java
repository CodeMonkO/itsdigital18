
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationType_132989S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationType_132989S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightDate" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ProductDateTimeTypeI_192929C" minOccurs="0"/>
 *         &lt;element name="boardPointDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}LocationTypeI_192931C" minOccurs="0"/>
 *         &lt;element name="offpointDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}LocationTypeI_192931C" minOccurs="0"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}CompanyIdentificationTypeI_192926C"/>
 *         &lt;element name="flightIdentification" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ProductIdentificationDetailsTypeI_192927C"/>
 *         &lt;element name="flightTypeDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ProductTypeDetailsTypeI_192928C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationType_132989S", propOrder = {
    "flightDate",
    "boardPointDetails",
    "offpointDetails",
    "companyDetails",
    "flightIdentification",
    "flightTypeDetails"
})
public class TravelProductInformationType132989S {

    protected ProductDateTimeTypeI192929C flightDate;
    protected LocationTypeI192931C boardPointDetails;
    protected LocationTypeI192931C offpointDetails;
    @XmlElement(required = true)
    protected CompanyIdentificationTypeI192926C companyDetails;
    @XmlElement(required = true)
    protected ProductIdentificationDetailsTypeI192927C flightIdentification;
    protected ProductTypeDetailsTypeI192928C flightTypeDetails;

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI192929C }
     *     
     */
    public ProductDateTimeTypeI192929C getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI192929C }
     *     
     */
    public void setFlightDate(ProductDateTimeTypeI192929C value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the boardPointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI192931C }
     *     
     */
    public LocationTypeI192931C getBoardPointDetails() {
        return boardPointDetails;
    }

    /**
     * Sets the value of the boardPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI192931C }
     *     
     */
    public void setBoardPointDetails(LocationTypeI192931C value) {
        this.boardPointDetails = value;
    }

    /**
     * Gets the value of the offpointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI192931C }
     *     
     */
    public LocationTypeI192931C getOffpointDetails() {
        return offpointDetails;
    }

    /**
     * Sets the value of the offpointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI192931C }
     *     
     */
    public void setOffpointDetails(LocationTypeI192931C value) {
        this.offpointDetails = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI192926C }
     *     
     */
    public CompanyIdentificationTypeI192926C getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI192926C }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI192926C value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the flightIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeI192927C }
     *     
     */
    public ProductIdentificationDetailsTypeI192927C getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeI192927C }
     *     
     */
    public void setFlightIdentification(ProductIdentificationDetailsTypeI192927C value) {
        this.flightIdentification = value;
    }

    /**
     * Gets the value of the flightTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsTypeI192928C }
     *     
     */
    public ProductTypeDetailsTypeI192928C getFlightTypeDetails() {
        return flightTypeDetails;
    }

    /**
     * Sets the value of the flightTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsTypeI192928C }
     *     
     */
    public void setFlightTypeDetails(ProductTypeDetailsTypeI192928C value) {
        this.flightTypeDetails = value;
    }

}
