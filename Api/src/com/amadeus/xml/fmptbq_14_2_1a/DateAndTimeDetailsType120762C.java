
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateAndTimeDetailsType_120762C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeDetailsType_120762C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateQualifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="date" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}Date_DDMMYY" minOccurs="0"/>
 *         &lt;element name="firstTime" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="equipementType" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="locationId" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length3To5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeDetailsType_120762C", propOrder = {
    "dateQualifier",
    "date",
    "firstTime",
    "equipementType",
    "locationId"
})
public class DateAndTimeDetailsType120762C {

    protected String dateQualifier;
    protected String date;
    protected String firstTime;
    protected String equipementType;
    protected String locationId;

    /**
     * Gets the value of the dateQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateQualifier() {
        return dateQualifier;
    }

    /**
     * Sets the value of the dateQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateQualifier(String value) {
        this.dateQualifier = value;
    }

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
     * Gets the value of the firstTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstTime() {
        return firstTime;
    }

    /**
     * Sets the value of the firstTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstTime(String value) {
        this.firstTime = value;
    }

    /**
     * Gets the value of the equipementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipementType() {
        return equipementType;
    }

    /**
     * Sets the value of the equipementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipementType(String value) {
        this.equipementType = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

}
