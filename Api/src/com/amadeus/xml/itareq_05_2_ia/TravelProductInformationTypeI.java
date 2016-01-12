
package com.amadeus.xml.itareq_05_2_ia;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightDate" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}ProductDateTimeTypeI"/>
 *         &lt;element name="boardPointDetails" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}LocationTypeI"/>
 *         &lt;element name="offpointDetails" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}LocationTypeI"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}CompanyIdentificationTypeI"/>
 *         &lt;element name="flightIdentification" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}ProductIdentificationDetailsTypeI"/>
 *         &lt;element name="flightTypeDetails" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}ProductTypeDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="specialSegment" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="marriageDetails" type="{http://xml.amadeus.com/ITAREQ_05_2_IA}MarriageControlDetailsTypeI" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationTypeI", propOrder = {
    "flightDate",
    "boardPointDetails",
    "offpointDetails",
    "companyDetails",
    "flightIdentification",
    "flightTypeDetails",
    "specialSegment",
    "marriageDetails"
})
public class TravelProductInformationTypeI {

    @XmlElement(required = true)
    protected ProductDateTimeTypeI flightDate;
    @XmlElement(required = true)
    protected LocationTypeI boardPointDetails;
    @XmlElement(required = true)
    protected LocationTypeI offpointDetails;
    @XmlElement(required = true)
    protected CompanyIdentificationTypeI companyDetails;
    @XmlElement(required = true)
    protected ProductIdentificationDetailsTypeI flightIdentification;
    protected ProductTypeDetailsTypeI flightTypeDetails;
    protected String specialSegment;
    protected List<MarriageControlDetailsTypeI> marriageDetails;

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public ProductDateTimeTypeI getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public void setFlightDate(ProductDateTimeTypeI value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the boardPointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getBoardPointDetails() {
        return boardPointDetails;
    }

    /**
     * Sets the value of the boardPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setBoardPointDetails(LocationTypeI value) {
        this.boardPointDetails = value;
    }

    /**
     * Gets the value of the offpointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getOffpointDetails() {
        return offpointDetails;
    }

    /**
     * Sets the value of the offpointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setOffpointDetails(LocationTypeI value) {
        this.offpointDetails = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public CompanyIdentificationTypeI getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the flightIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public ProductIdentificationDetailsTypeI getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public void setFlightIdentification(ProductIdentificationDetailsTypeI value) {
        this.flightIdentification = value;
    }

    /**
     * Gets the value of the flightTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsTypeI }
     *     
     */
    public ProductTypeDetailsTypeI getFlightTypeDetails() {
        return flightTypeDetails;
    }

    /**
     * Sets the value of the flightTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsTypeI }
     *     
     */
    public void setFlightTypeDetails(ProductTypeDetailsTypeI value) {
        this.flightTypeDetails = value;
    }

    /**
     * Gets the value of the specialSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialSegment() {
        return specialSegment;
    }

    /**
     * Sets the value of the specialSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialSegment(String value) {
        this.specialSegment = value;
    }

    /**
     * Gets the value of the marriageDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marriageDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarriageDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarriageControlDetailsTypeI }
     * 
     * 
     */
    public List<MarriageControlDetailsTypeI> getMarriageDetails() {
        if (marriageDetails == null) {
            marriageDetails = new ArrayList<MarriageControlDetailsTypeI>();
        }
        return this.marriageDetails;
    }

}
