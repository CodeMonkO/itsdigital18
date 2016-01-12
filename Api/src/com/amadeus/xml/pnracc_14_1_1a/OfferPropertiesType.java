
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer elements description
 * 
 * <p>Java class for OfferPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerStatus" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To5"/>
 *         &lt;element name="offerValidityDate" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeType_139827C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferPropertiesType", propOrder = {
    "offerStatus",
    "offerValidityDate"
})
public class OfferPropertiesType {

    @XmlElement(required = true)
    protected String offerStatus;
    protected StructuredDateTimeType139827C offerValidityDate;

    /**
     * Gets the value of the offerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferStatus() {
        return offerStatus;
    }

    /**
     * Sets the value of the offerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferStatus(String value) {
        this.offerStatus = value;
    }

    /**
     * Gets the value of the offerValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType139827C }
     *     
     */
    public StructuredDateTimeType139827C getOfferValidityDate() {
        return offerValidityDate;
    }

    /**
     * Sets the value of the offerValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType139827C }
     *     
     */
    public void setOfferValidityDate(StructuredDateTimeType139827C value) {
        this.offerValidityDate = value;
    }

}
