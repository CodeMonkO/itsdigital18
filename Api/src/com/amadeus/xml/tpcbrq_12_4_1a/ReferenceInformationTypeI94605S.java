
package com.amadeus.xml.tpcbrq_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide specific reference identification.
 * 
 * <p>Java class for ReferenceInformationTypeI_94605S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInformationTypeI_94605S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refDetails" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferencingDetailsTypeI_142222C" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInformationTypeI_94605S", propOrder = {
    "refDetails"
})
public class ReferenceInformationTypeI94605S {

    protected List<ReferencingDetailsTypeI142222C> refDetails;

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
     * {@link ReferencingDetailsTypeI142222C }
     * 
     * 
     */
    public List<ReferencingDetailsTypeI142222C> getRefDetails() {
        if (refDetails == null) {
            refDetails = new ArrayList<ReferencingDetailsTypeI142222C>();
        }
        return this.refDetails;
    }

}
