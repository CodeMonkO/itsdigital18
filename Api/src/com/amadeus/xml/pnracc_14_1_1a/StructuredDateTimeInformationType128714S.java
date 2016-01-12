
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey date/time in a structured way.
 * 
 * <p>Java class for StructuredDateTimeInformationType_128714S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredDateTimeInformationType_128714S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTime" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeType_187528C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredDateTimeInformationType_128714S", propOrder = {
    "dateTime"
})
public class StructuredDateTimeInformationType128714S {

    protected StructuredDateTimeType187528C dateTime;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType187528C }
     *     
     */
    public StructuredDateTimeType187528C getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType187528C }
     *     
     */
    public void setDateTime(StructuredDateTimeType187528C value) {
        this.dateTime = value;
    }

}
