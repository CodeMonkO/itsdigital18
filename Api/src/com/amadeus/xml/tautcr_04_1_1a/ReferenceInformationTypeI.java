
package com.amadeus.xml.tautcr_04_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide specific reference identification.
 * 
 * <p>Java class for ReferenceInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refDetails" type="{http://xml.amadeus.com/TAUTCR_04_1_1A}ReferencingDetailsTypeI" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInformationTypeI", propOrder = {
    "refDetails"
})
public class ReferenceInformationTypeI {

    protected List<ReferencingDetailsTypeI> refDetails;

    /**
     * Gets the value of the refDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencingDetailsTypeI }
     * 
     * 
     */
    public List<ReferencingDetailsTypeI> getRefDetails() {
        if (refDetails == null) {
            refDetails = new ArrayList<ReferencingDetailsTypeI>();
        }
        return this.refDetails;
    }

}
