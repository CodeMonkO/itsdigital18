
package com.amadeus.xml.tipnrr_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details of a conversion rate related to an amount.
 * 
 * <p>Java class for ConversionRateTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionRateTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversionRateDetails" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ConversionRateDetailsTypeI"/>
 *         &lt;element name="otherConvRateDetails" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ConversionRateDetailsTypeI" maxOccurs="19" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionRateTypeI", propOrder = {
    "conversionRateDetails",
    "otherConvRateDetails"
})
public class ConversionRateTypeI {

    @XmlElement(required = true)
    protected ConversionRateDetailsTypeI conversionRateDetails;
    protected List<ConversionRateDetailsTypeI> otherConvRateDetails;

    /**
     * Gets the value of the conversionRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateDetailsTypeI }
     *     
     */
    public ConversionRateDetailsTypeI getConversionRateDetails() {
        return conversionRateDetails;
    }

    /**
     * Sets the value of the conversionRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateDetailsTypeI }
     *     
     */
    public void setConversionRateDetails(ConversionRateDetailsTypeI value) {
        this.conversionRateDetails = value;
    }

    /**
     * Gets the value of the otherConvRateDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherConvRateDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherConvRateDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionRateDetailsTypeI }
     * 
     * 
     */
    public List<ConversionRateDetailsTypeI> getOtherConvRateDetails() {
        if (otherConvRateDetails == null) {
            otherConvRateDetails = new ArrayList<ConversionRateDetailsTypeI>();
        }
        return this.otherConvRateDetails;
    }

}
