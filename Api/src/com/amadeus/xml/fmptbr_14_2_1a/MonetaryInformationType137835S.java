
package com.amadeus.xml.fmptbr_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify monetary information details
 * 
 * <p>Java class for MonetaryInformationType_137835S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationType_137835S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monetaryDetail" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}MonetaryInformationDetailsType" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationType_137835S", propOrder = {
    "monetaryDetail"
})
public class MonetaryInformationType137835S {

    protected List<MonetaryInformationDetailsType> monetaryDetail;

    /**
     * Gets the value of the monetaryDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationDetailsType }
     * 
     * 
     */
    public List<MonetaryInformationDetailsType> getMonetaryDetail() {
        if (monetaryDetail == null) {
            monetaryDetail = new ArrayList<MonetaryInformationDetailsType>();
        }
        return this.monetaryDetail;
    }

}
