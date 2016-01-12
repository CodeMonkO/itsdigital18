
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey date/time in a structured way.
 * 
 * <p>Java class for StructuredDateTimeInformationType_128779S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredDateTimeInformationType_128779S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessSemantic" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeType_187547C" minOccurs="0"/>
 *         &lt;element name="timeZoneInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TimeZoneIinformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredDateTimeInformationType_128779S", propOrder = {
    "businessSemantic",
    "dateTime",
    "timeZoneInfo"
})
public class StructuredDateTimeInformationType128779S {

    protected String businessSemantic;
    protected StructuredDateTimeType187547C dateTime;
    protected TimeZoneIinformationType timeZoneInfo;

    /**
     * Gets the value of the businessSemantic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessSemantic() {
        return businessSemantic;
    }

    /**
     * Sets the value of the businessSemantic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessSemantic(String value) {
        this.businessSemantic = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType187547C }
     *     
     */
    public StructuredDateTimeType187547C getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType187547C }
     *     
     */
    public void setDateTime(StructuredDateTimeType187547C value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the timeZoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneIinformationType }
     *     
     */
    public TimeZoneIinformationType getTimeZoneInfo() {
        return timeZoneInfo;
    }

    /**
     * Sets the value of the timeZoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneIinformationType }
     *     
     */
    public void setTimeZoneInfo(TimeZoneIinformationType value) {
        this.timeZoneInfo = value;
    }

}
