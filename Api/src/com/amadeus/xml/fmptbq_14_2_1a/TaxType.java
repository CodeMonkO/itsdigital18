
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details realting to tax(es)
 * 
 * <p>Java class for TaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="withholdTaxSurcharge" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="taxDetail" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}TaxDetailsTypeI" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxType", propOrder = {
    "withholdTaxSurcharge",
    "taxDetail"
})
public class TaxType {

    protected String withholdTaxSurcharge;
    protected List<TaxDetailsTypeI> taxDetail;

    /**
     * Gets the value of the withholdTaxSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdTaxSurcharge() {
        return withholdTaxSurcharge;
    }

    /**
     * Sets the value of the withholdTaxSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdTaxSurcharge(String value) {
        this.withholdTaxSurcharge = value;
    }

    /**
     * Gets the value of the taxDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetailsTypeI }
     * 
     * 
     */
    public List<TaxDetailsTypeI> getTaxDetail() {
        if (taxDetail == null) {
            taxDetail = new ArrayList<TaxDetailsTypeI>();
        }
        return this.taxDetail;
    }

}
