
package com.amadeus.xml.fmptbr_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the restrictions
 * 
 * <p>Java class for MiniRulesType_78547S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiniRulesType_78547S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="restrictionType" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length0To6" minOccurs="0"/>
 *         &lt;element name="category" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaString_Length0To3"/>
 *         &lt;element name="indicator" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}MiniRulesIndicatorType" minOccurs="0"/>
 *         &lt;element name="miniRules" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}MiniRulesDetailsType" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiniRulesType_78547S", propOrder = {
    "restrictionType",
    "category",
    "indicator",
    "miniRules"
})
public class MiniRulesType78547S {

    protected String restrictionType;
    @XmlElement(required = true)
    protected String category;
    protected MiniRulesIndicatorType indicator;
    protected List<MiniRulesDetailsType> miniRules;

    /**
     * Gets the value of the restrictionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionType() {
        return restrictionType;
    }

    /**
     * Sets the value of the restrictionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionType(String value) {
        this.restrictionType = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link MiniRulesIndicatorType }
     *     
     */
    public MiniRulesIndicatorType getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiniRulesIndicatorType }
     *     
     */
    public void setIndicator(MiniRulesIndicatorType value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the miniRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miniRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiniRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiniRulesDetailsType }
     * 
     * 
     */
    public List<MiniRulesDetailsType> getMiniRules() {
        if (miniRules == null) {
            miniRules = new ArrayList<MiniRulesDetailsType>();
        }
        return this.miniRules;
    }

}
