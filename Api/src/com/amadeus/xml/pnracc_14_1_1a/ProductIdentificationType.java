
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a product.
 * 
 * <p>Java class for ProductIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productData" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ProductIdentificationDetailsType" maxOccurs="9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentificationType", propOrder = {
    "productData"
})
public class ProductIdentificationType {

    @XmlElement(required = true)
    protected List<ProductIdentificationDetailsType> productData;

    /**
     * Gets the value of the productData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationDetailsType }
     * 
     * 
     */
    public List<ProductIdentificationDetailsType> getProductData() {
        if (productData == null) {
            productData = new ArrayList<ProductIdentificationDetailsType>();
        }
        return this.productData;
    }

}
