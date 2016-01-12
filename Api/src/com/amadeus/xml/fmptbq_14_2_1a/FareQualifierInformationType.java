
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify multiple qualifier for fare selections.
 * 
 * <p>Java class for FareQualifierInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareQualifierInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareFamilyQual" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length0To3" maxOccurs="9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareQualifierInformationType", propOrder = {
    "fareFamilyQual"
})
public class FareQualifierInformationType {

    @XmlElement(required = true)
    protected List<String> fareFamilyQual;

    /**
     * Gets the value of the fareFamilyQual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareFamilyQual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareFamilyQual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFareFamilyQual() {
        if (fareFamilyQual == null) {
            fareFamilyQual = new ArrayList<String>();
        }
        return this.fareFamilyQual;
    }

}
