
package com.amadeus.xml.fmptbr_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify flight product information details
 * 
 * <p>Java class for FlightProductInformationType_161491S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightProductInformationType_161491S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinProduct" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}CabinProductDetailsType_229142C" minOccurs="0"/>
 *         &lt;element name="fareProductDetail" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}FareProductDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightProductInformationType_161491S", propOrder = {
    "cabinProduct",
    "fareProductDetail"
})
public class FlightProductInformationType161491S {

    protected CabinProductDetailsType229142C cabinProduct;
    protected FareProductDetailsType fareProductDetail;

    /**
     * Gets the value of the cabinProduct property.
     * 
     * @return
     *     possible object is
     *     {@link CabinProductDetailsType229142C }
     *     
     */
    public CabinProductDetailsType229142C getCabinProduct() {
        return cabinProduct;
    }

    /**
     * Sets the value of the cabinProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinProductDetailsType229142C }
     *     
     */
    public void setCabinProduct(CabinProductDetailsType229142C value) {
        this.cabinProduct = value;
    }

    /**
     * Gets the value of the fareProductDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareProductDetailsType }
     *     
     */
    public FareProductDetailsType getFareProductDetail() {
        return fareProductDetail;
    }

    /**
     * Sets the value of the fareProductDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareProductDetailsType }
     *     
     */
    public void setFareProductDetail(FareProductDetailsType value) {
        this.fareProductDetail = value;
    }

}
