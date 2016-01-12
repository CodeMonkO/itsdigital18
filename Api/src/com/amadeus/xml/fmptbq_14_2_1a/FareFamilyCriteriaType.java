
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareFamilyCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFamilyCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrierId" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="rdb" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaString_Length1To2" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="fareFamilyInfo" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}FareQualifierInformationType" minOccurs="0"/>
 *         &lt;element name="fareProductDetail" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}FareProductDetailsType" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="corporateInfo" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}MultipleIdentificationNumbersTypeI" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="cabinProduct" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}CabinClassDesignationType" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="cabinProcessingIdentifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="dateTimeDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ProductDateTimeTypeI_194583C" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="otherCriteria" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}CodedAttributeInformationType_120742C" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFamilyCriteriaType", propOrder = {
    "carrierId",
    "rdb",
    "fareFamilyInfo",
    "fareProductDetail",
    "corporateInfo",
    "cabinProduct",
    "cabinProcessingIdentifier",
    "dateTimeDetails",
    "otherCriteria"
})
public class FareFamilyCriteriaType {

    protected List<String> carrierId;
    protected List<String> rdb;
    protected FareQualifierInformationType fareFamilyInfo;
    protected List<FareProductDetailsType> fareProductDetail;
    protected List<MultipleIdentificationNumbersTypeI> corporateInfo;
    protected List<CabinClassDesignationType> cabinProduct;
    protected String cabinProcessingIdentifier;
    protected List<ProductDateTimeTypeI194583C> dateTimeDetails;
    protected List<CodedAttributeInformationType120742C> otherCriteria;

    /**
     * Gets the value of the carrierId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCarrierId() {
        if (carrierId == null) {
            carrierId = new ArrayList<String>();
        }
        return this.carrierId;
    }

    /**
     * Gets the value of the rdb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rdb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRdb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRdb() {
        if (rdb == null) {
            rdb = new ArrayList<String>();
        }
        return this.rdb;
    }

    /**
     * Gets the value of the fareFamilyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareQualifierInformationType }
     *     
     */
    public FareQualifierInformationType getFareFamilyInfo() {
        return fareFamilyInfo;
    }

    /**
     * Sets the value of the fareFamilyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareQualifierInformationType }
     *     
     */
    public void setFareFamilyInfo(FareQualifierInformationType value) {
        this.fareFamilyInfo = value;
    }

    /**
     * Gets the value of the fareProductDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareProductDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareProductDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareProductDetailsType }
     * 
     * 
     */
    public List<FareProductDetailsType> getFareProductDetail() {
        if (fareProductDetail == null) {
            fareProductDetail = new ArrayList<FareProductDetailsType>();
        }
        return this.fareProductDetail;
    }

    /**
     * Gets the value of the corporateInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultipleIdentificationNumbersTypeI }
     * 
     * 
     */
    public List<MultipleIdentificationNumbersTypeI> getCorporateInfo() {
        if (corporateInfo == null) {
            corporateInfo = new ArrayList<MultipleIdentificationNumbersTypeI>();
        }
        return this.corporateInfo;
    }

    /**
     * Gets the value of the cabinProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinClassDesignationType }
     * 
     * 
     */
    public List<CabinClassDesignationType> getCabinProduct() {
        if (cabinProduct == null) {
            cabinProduct = new ArrayList<CabinClassDesignationType>();
        }
        return this.cabinProduct;
    }

    /**
     * Gets the value of the cabinProcessingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinProcessingIdentifier() {
        return cabinProcessingIdentifier;
    }

    /**
     * Sets the value of the cabinProcessingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinProcessingIdentifier(String value) {
        this.cabinProcessingIdentifier = value;
    }

    /**
     * Gets the value of the dateTimeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTimeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTimeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDateTimeTypeI194583C }
     * 
     * 
     */
    public List<ProductDateTimeTypeI194583C> getDateTimeDetails() {
        if (dateTimeDetails == null) {
            dateTimeDetails = new ArrayList<ProductDateTimeTypeI194583C>();
        }
        return this.dateTimeDetails;
    }

    /**
     * Gets the value of the otherCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedAttributeInformationType120742C }
     * 
     * 
     */
    public List<CodedAttributeInformationType120742C> getOtherCriteria() {
        if (otherCriteria == null) {
            otherCriteria = new ArrayList<CodedAttributeInformationType120742C>();
        }
        return this.otherCriteria;
    }

}
