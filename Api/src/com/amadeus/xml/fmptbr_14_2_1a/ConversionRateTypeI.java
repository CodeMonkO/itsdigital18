
package com.amadeus.xml.fmptbr_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify conversion rate details
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
 *         &lt;element name="conversionRateDetail" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}ConversionRateDetailsTypeI_179848C" maxOccurs="9"/>
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
    "conversionRateDetail"
})
public class ConversionRateTypeI {

    @XmlElement(required = true)
    protected List<ConversionRateDetailsTypeI179848C> conversionRateDetail;

    /**
     * Gets the value of the conversionRateDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversionRateDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionRateDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionRateDetailsTypeI179848C }
     * 
     * 
     */
    public List<ConversionRateDetailsTypeI179848C> getConversionRateDetail() {
        if (conversionRateDetail == null) {
            conversionRateDetail = new ArrayList<ConversionRateDetailsTypeI179848C>();
        }
        return this.conversionRateDetail;
    }

}
