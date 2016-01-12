
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify additional characteristics of a product or service.
 * 
 * <p>Java class for ProductTypeDetailsType_205137C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTypeDetailsType_205137C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="avl" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To6" maxOccurs="9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTypeDetailsType_205137C", propOrder = {
    "avl"
})
public class ProductTypeDetailsType205137C {

    @XmlElement(required = true)
    protected List<String> avl;

    /**
     * Gets the value of the avl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAvl() {
        if (avl == null) {
            avl = new ArrayList<String>();
        }
        return this.avl;
    }

}
