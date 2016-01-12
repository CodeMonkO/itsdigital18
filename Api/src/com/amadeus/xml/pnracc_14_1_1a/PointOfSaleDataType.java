
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfSaleDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfSaleDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userIdentification" type="{http://xml.amadeus.com/PNRACC_14_1_1A}UserIdentificationType_132970S"/>
 *         &lt;element name="systemDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SystemDetailsInfoType_132969S"/>
 *         &lt;element name="preferences" type="{http://xml.amadeus.com/PNRACC_14_1_1A}UserPreferencesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfSaleDataType", propOrder = {
    "userIdentification",
    "systemDetails",
    "preferences"
})
public class PointOfSaleDataType {

    @XmlElement(required = true)
    protected UserIdentificationType132970S userIdentification;
    @XmlElement(required = true)
    protected SystemDetailsInfoType132969S systemDetails;
    @XmlElement(required = true)
    protected UserPreferencesType preferences;

    /**
     * Gets the value of the userIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentificationType132970S }
     *     
     */
    public UserIdentificationType132970S getUserIdentification() {
        return userIdentification;
    }

    /**
     * Sets the value of the userIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentificationType132970S }
     *     
     */
    public void setUserIdentification(UserIdentificationType132970S value) {
        this.userIdentification = value;
    }

    /**
     * Gets the value of the systemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsInfoType132969S }
     *     
     */
    public SystemDetailsInfoType132969S getSystemDetails() {
        return systemDetails;
    }

    /**
     * Sets the value of the systemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsInfoType132969S }
     *     
     */
    public void setSystemDetails(SystemDetailsInfoType132969S value) {
        this.systemDetails = value;
    }

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link UserPreferencesType }
     *     
     */
    public UserPreferencesType getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPreferencesType }
     *     
     */
    public void setPreferences(UserPreferencesType value) {
        this.preferences = value;
    }

}
