
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyIdentificationType_233548C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentificationType_233548C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrierQualifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length0To1"/>
 *         &lt;element name="carrierId" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length2To3" maxOccurs="999"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentificationType_233548C", propOrder = {
    "carrierQualifier",
    "carrierId"
})
public class CompanyIdentificationType233548C {

    @XmlElement(required = true)
    protected String carrierQualifier;
    @XmlElement(required = true)
    protected List<String> carrierId;

    /**
     * Gets the value of the carrierQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierQualifier() {
        return carrierQualifier;
    }

    /**
     * Sets the value of the carrierQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierQualifier(String value) {
        this.carrierQualifier = value;
    }

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

}
