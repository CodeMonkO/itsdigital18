
package com.amadeus.xml.fmptbq_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference to PNR segment
 * 
 * <p>Java class for PNRSegmentReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNRSegmentReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pnrSegmentTattoo" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}NumericInteger_Length0To35" minOccurs="0"/>
 *         &lt;element name="pnrSegmentQualifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRSegmentReferenceType", propOrder = {
    "pnrSegmentTattoo",
    "pnrSegmentQualifier"
})
public class PNRSegmentReferenceType {

    protected BigInteger pnrSegmentTattoo;
    protected String pnrSegmentQualifier;

    /**
     * Gets the value of the pnrSegmentTattoo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPnrSegmentTattoo() {
        return pnrSegmentTattoo;
    }

    /**
     * Sets the value of the pnrSegmentTattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPnrSegmentTattoo(BigInteger value) {
        this.pnrSegmentTattoo = value;
    }

    /**
     * Gets the value of the pnrSegmentQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrSegmentQualifier() {
        return pnrSegmentQualifier;
    }

    /**
     * Sets the value of the pnrSegmentQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrSegmentQualifier(String value) {
        this.pnrSegmentQualifier = value;
    }

}
