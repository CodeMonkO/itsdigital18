
package com.amadeus.xml.fmptbr_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an association between references given to travelers, to products, to services
 * 
 * <p>Java class for ReferenceInfoType_176658S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInfoType_176658S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referencingDetail" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}ReferencingDetailsType" maxOccurs="6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInfoType_176658S", propOrder = {
    "referencingDetail"
})
public class ReferenceInfoType176658S {

    protected List<ReferencingDetailsType> referencingDetail;

    /**
     * Gets the value of the referencingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencingDetailsType }
     * 
     * 
     */
    public List<ReferencingDetailsType> getReferencingDetail() {
        if (referencingDetail == null) {
            referencingDetail = new ArrayList<ReferencingDetailsType>();
        }
        return this.referencingDetail;
    }

}
