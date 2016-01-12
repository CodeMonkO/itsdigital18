
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey period in a structured way.
 * 
 * <p>Java class for StructuredPeriodInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredPeriodInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginDateTime" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}StructuredDateTimeType" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}StructuredDateTimeType" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}FrequencyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredPeriodInformationType", propOrder = {
    "beginDateTime",
    "endDateTime",
    "frequency"
})
public class StructuredPeriodInformationType {

    protected StructuredDateTimeType beginDateTime;
    protected StructuredDateTimeType endDateTime;
    protected FrequencyType frequency;

    /**
     * Gets the value of the beginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType }
     *     
     */
    public StructuredDateTimeType getBeginDateTime() {
        return beginDateTime;
    }

    /**
     * Sets the value of the beginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType }
     *     
     */
    public void setBeginDateTime(StructuredDateTimeType value) {
        this.beginDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType }
     *     
     */
    public StructuredDateTimeType getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType }
     *     
     */
    public void setEndDateTime(StructuredDateTimeType value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyType }
     *     
     */
    public FrequencyType getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyType }
     *     
     */
    public void setFrequency(FrequencyType value) {
        this.frequency = value;
    }

}
