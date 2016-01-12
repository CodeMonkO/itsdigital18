
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify Criteria with list of parameters
 * 
 * <p>Java class for ValueSearchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteriaName" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To50" minOccurs="0"/>
 *         &lt;element name="criteriaCode" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="value" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To18" minOccurs="0"/>
 *         &lt;element name="criteriaDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}CriteriaiDetaislType" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSearchCriteriaType", propOrder = {
    "criteriaName",
    "criteriaCode",
    "value",
    "criteriaDetails"
})
public class ValueSearchCriteriaType {

    protected String criteriaName;
    protected String criteriaCode;
    protected String value;
    protected List<CriteriaiDetaislType> criteriaDetails;

    /**
     * Gets the value of the criteriaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteriaName() {
        return criteriaName;
    }

    /**
     * Sets the value of the criteriaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteriaName(String value) {
        this.criteriaName = value;
    }

    /**
     * Gets the value of the criteriaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteriaCode() {
        return criteriaCode;
    }

    /**
     * Sets the value of the criteriaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteriaCode(String value) {
        this.criteriaCode = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the criteriaDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CriteriaiDetaislType }
     * 
     * 
     */
    public List<CriteriaiDetaislType> getCriteriaDetails() {
        if (criteriaDetails == null) {
            criteriaDetails = new ArrayList<CriteriaiDetaislType>();
        }
        return this.criteriaDetails;
    }

}
