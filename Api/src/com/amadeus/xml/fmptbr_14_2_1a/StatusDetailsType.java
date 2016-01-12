
package com.amadeus.xml.fmptbr_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advisoryTypeInfo" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="notification" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="notification2" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="description" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDetailsType", propOrder = {
    "advisoryTypeInfo",
    "notification",
    "notification2",
    "description"
})
public class StatusDetailsType {

    protected String advisoryTypeInfo;
    protected String notification;
    protected String notification2;
    protected String description;

    /**
     * Gets the value of the advisoryTypeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisoryTypeInfo() {
        return advisoryTypeInfo;
    }

    /**
     * Sets the value of the advisoryTypeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisoryTypeInfo(String value) {
        this.advisoryTypeInfo = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotification(String value) {
        this.notification = value;
    }

    /**
     * Gets the value of the notification2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotification2() {
        return notification2;
    }

    /**
     * Sets the value of the notification2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotification2(String value) {
        this.notification2 = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
