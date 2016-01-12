
package com.amadeus.xml.fmptbr_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify flight product information details
 * 
 * <p>Java class for FlightProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightProductInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinProduct" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}CabinProductDetailsType_195516C" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="contextDetails" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}ProductTypeDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightProductInformationType", propOrder = {
    "cabinProduct",
    "contextDetails"
})
public class FlightProductInformationType {

    protected List<CabinProductDetailsType195516C> cabinProduct;
    protected ProductTypeDetailsType contextDetails;

    /**
     * Gets the value of the cabinProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinProductDetailsType195516C }
     * 
     * 
     */
    public List<CabinProductDetailsType195516C> getCabinProduct() {
        if (cabinProduct == null) {
            cabinProduct = new ArrayList<CabinProductDetailsType195516C>();
        }
        return this.cabinProduct;
    }

    /**
     * Gets the value of the contextDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsType }
     *     
     */
    public ProductTypeDetailsType getContextDetails() {
        return contextDetails;
    }

    /**
     * Sets the value of the contextDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsType }
     *     
     */
    public void setContextDetails(ProductTypeDetailsType value) {
        this.contextDetails = value;
    }

}
