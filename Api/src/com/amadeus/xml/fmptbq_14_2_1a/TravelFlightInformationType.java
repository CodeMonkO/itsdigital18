
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about flight options
 * 
 * <p>Java class for TravelFlightInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelFlightInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinId" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}CabinIdentificationType" minOccurs="0"/>
 *         &lt;element name="companyIdentity" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}CompanyIdentificationType_120719C" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="flightDetail" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ProductTypeDetailsType_120801C" minOccurs="0"/>
 *         &lt;element name="inclusionDetail" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ConnectPointDetailsType_195492C" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="exclusionDetail" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ConnectPointDetailsType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="unitNumberDetail" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}NumberOfUnitDetailsTypeI" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelFlightInformationType", propOrder = {
    "cabinId",
    "companyIdentity",
    "flightDetail",
    "inclusionDetail",
    "exclusionDetail",
    "unitNumberDetail"
})
public class TravelFlightInformationType {

    protected CabinIdentificationType cabinId;
    protected List<CompanyIdentificationType120719C> companyIdentity;
    protected ProductTypeDetailsType120801C flightDetail;
    protected List<ConnectPointDetailsType195492C> inclusionDetail;
    protected List<ConnectPointDetailsType> exclusionDetail;
    protected List<NumberOfUnitDetailsTypeI> unitNumberDetail;

    /**
     * Gets the value of the cabinId property.
     * 
     * @return
     *     possible object is
     *     {@link CabinIdentificationType }
     *     
     */
    public CabinIdentificationType getCabinId() {
        return cabinId;
    }

    /**
     * Sets the value of the cabinId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinIdentificationType }
     *     
     */
    public void setCabinId(CabinIdentificationType value) {
        this.cabinId = value;
    }

    /**
     * Gets the value of the companyIdentity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyIdentity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyIdentificationType120719C }
     * 
     * 
     */
    public List<CompanyIdentificationType120719C> getCompanyIdentity() {
        if (companyIdentity == null) {
            companyIdentity = new ArrayList<CompanyIdentificationType120719C>();
        }
        return this.companyIdentity;
    }

    /**
     * Gets the value of the flightDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsType120801C }
     *     
     */
    public ProductTypeDetailsType120801C getFlightDetail() {
        return flightDetail;
    }

    /**
     * Sets the value of the flightDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsType120801C }
     *     
     */
    public void setFlightDetail(ProductTypeDetailsType120801C value) {
        this.flightDetail = value;
    }

    /**
     * Gets the value of the inclusionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inclusionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclusionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectPointDetailsType195492C }
     * 
     * 
     */
    public List<ConnectPointDetailsType195492C> getInclusionDetail() {
        if (inclusionDetail == null) {
            inclusionDetail = new ArrayList<ConnectPointDetailsType195492C>();
        }
        return this.inclusionDetail;
    }

    /**
     * Gets the value of the exclusionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectPointDetailsType }
     * 
     * 
     */
    public List<ConnectPointDetailsType> getExclusionDetail() {
        if (exclusionDetail == null) {
            exclusionDetail = new ArrayList<ConnectPointDetailsType>();
        }
        return this.exclusionDetail;
    }

    /**
     * Gets the value of the unitNumberDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitNumberDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitNumberDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfUnitDetailsTypeI }
     * 
     * 
     */
    public List<NumberOfUnitDetailsTypeI> getUnitNumberDetail() {
        if (unitNumberDetail == null) {
            unitNumberDetail = new ArrayList<NumberOfUnitDetailsTypeI>();
        }
        return this.unitNumberDetail;
    }

}
