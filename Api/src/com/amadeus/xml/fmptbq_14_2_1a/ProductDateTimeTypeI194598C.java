
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductDateTimeTypeI_194598C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDateTimeTypeI_194598C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}Date_DDMMYY"/>
 *         &lt;element name="rtcDate" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}Date_DDMMYY" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDateTimeTypeI_194598C", propOrder = {
    "date",
    "rtcDate"
})
public class ProductDateTimeTypeI194598C {

    @XmlElement(required = true)
    protected String date;
    protected String rtcDate;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the rtcDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtcDate() {
        return rtcDate;
    }

    /**
     * Sets the value of the rtcDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtcDate(String value) {
        this.rtcDate = value;
    }

}
