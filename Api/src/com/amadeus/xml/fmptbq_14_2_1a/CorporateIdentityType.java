
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Corporate fare types indicated in PTK are detailed
 * 
 * <p>Java class for CorporateIdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateIdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corporateQualifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length0To3"/>
 *         &lt;element name="identity" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To20" maxOccurs="9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateIdentityType", propOrder = {
    "corporateQualifier",
    "identity"
})
public class CorporateIdentityType {

    @XmlElement(required = true)
    protected String corporateQualifier;
    @XmlElement(required = true)
    protected List<String> identity;

    /**
     * Gets the value of the corporateQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateQualifier() {
        return corporateQualifier;
    }

    /**
     * Sets the value of the corporateQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateQualifier(String value) {
        this.corporateQualifier = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentity() {
        if (identity == null) {
            identity = new ArrayList<String>();
        }
        return this.identity;
    }

}
