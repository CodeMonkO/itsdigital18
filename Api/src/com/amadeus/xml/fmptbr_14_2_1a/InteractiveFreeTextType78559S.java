
package com.amadeus.xml.fmptbr_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide free form or coded text information
 * 
 * <p>Java class for InteractiveFreeTextType_78559S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractiveFreeTextType_78559S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeTextQualification" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}FreeTextQualificationType_120769C" minOccurs="0"/>
 *         &lt;element name="description" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To500" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractiveFreeTextType_78559S", propOrder = {
    "freeTextQualification",
    "description"
})
public class InteractiveFreeTextType78559S {

    protected FreeTextQualificationType120769C freeTextQualification;
    protected List<String> description;

    /**
     * Gets the value of the freeTextQualification property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextQualificationType120769C }
     *     
     */
    public FreeTextQualificationType120769C getFreeTextQualification() {
        return freeTextQualification;
    }

    /**
     * Sets the value of the freeTextQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextQualificationType120769C }
     *     
     */
    public void setFreeTextQualification(FreeTextQualificationType120769C value) {
        this.freeTextQualification = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

}
