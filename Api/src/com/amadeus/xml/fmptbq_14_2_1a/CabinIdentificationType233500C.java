
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinIdentificationType_233500C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinIdentificationType_233500C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinQualifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *         &lt;element name="cabin" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaString_Length0To1" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinIdentificationType_233500C", propOrder = {
    "cabinQualifier",
    "cabin"
})
public class CabinIdentificationType233500C {

    protected String cabinQualifier;
    protected List<String> cabin;

    /**
     * Gets the value of the cabinQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinQualifier() {
        return cabinQualifier;
    }

    /**
     * Sets the value of the cabinQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinQualifier(String value) {
        this.cabinQualifier = value;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCabin() {
        if (cabin == null) {
            cabin = new ArrayList<String>();
        }
        return this.cabin;
    }

}
