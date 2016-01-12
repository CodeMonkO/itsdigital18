
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for CodedAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feeId" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}CodedAttributeInformationType_247829C" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedAttributeType", propOrder = {
    "feeId"
})
public class CodedAttributeType {

    protected List<CodedAttributeInformationType247829C> feeId;

    /**
     * Gets the value of the feeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedAttributeInformationType247829C }
     * 
     * 
     */
    public List<CodedAttributeInformationType247829C> getFeeId() {
        if (feeId == null) {
            feeId = new ArrayList<CodedAttributeInformationType247829C>();
        }
        return this.feeId;
    }

}
