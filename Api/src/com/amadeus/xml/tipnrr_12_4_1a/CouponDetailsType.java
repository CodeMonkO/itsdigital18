
package com.amadeus.xml.tipnrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CouponDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productId" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ReferenceInfoType"/>
 *         &lt;element name="flightConnectionType" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TravelProductInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponDetailsType", propOrder = {
    "productId",
    "flightConnectionType"
})
public class CouponDetailsType {

    @XmlElement(required = true)
    protected ReferenceInfoType productId;
    protected TravelProductInformationType flightConnectionType;

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType }
     *     
     */
    public ReferenceInfoType getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType }
     *     
     */
    public void setProductId(ReferenceInfoType value) {
        this.productId = value;
    }

    /**
     * Gets the value of the flightConnectionType property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationType }
     *     
     */
    public TravelProductInformationType getFlightConnectionType() {
        return flightConnectionType;
    }

    /**
     * Sets the value of the flightConnectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationType }
     *     
     */
    public void setFlightConnectionType(TravelProductInformationType value) {
        this.flightConnectionType = value;
    }

}
