
package com.amadeus.xml.fmptbr_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify flight product information details
 * 
 * <p>Java class for FlightProductInformationType_141442S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightProductInformationType_141442S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinProduct" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}CabinProductDetailsType_205138C" maxOccurs="26" minOccurs="0"/>
 *         &lt;element name="contextDetails" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}ProductTypeDetailsType_205137C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightProductInformationType_141442S", propOrder = {
    "cabinProduct",
    "contextDetails"
})
public class FlightProductInformationType141442S {

    protected List<CabinProductDetailsType205138C> cabinProduct;
    protected ProductTypeDetailsType205137C contextDetails;

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
     * {@link CabinProductDetailsType205138C }
     * 
     * 
     */
    public List<CabinProductDetailsType205138C> getCabinProduct() {
        if (cabinProduct == null) {
            cabinProduct = new ArrayList<CabinProductDetailsType205138C>();
        }
        return this.cabinProduct;
    }

    /**
     * Gets the value of the contextDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsType205137C }
     *     
     */
    public ProductTypeDetailsType205137C getContextDetails() {
        return contextDetails;
    }

    /**
     * Sets the value of the contextDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsType205137C }
     *     
     */
    public void setContextDetails(ProductTypeDetailsType205137C value) {
        this.contextDetails = value;
    }

}
