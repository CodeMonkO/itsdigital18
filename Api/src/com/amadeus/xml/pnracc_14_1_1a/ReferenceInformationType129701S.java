
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to convey the passenger references.
 * 
 * <p>Java class for ReferenceInformationType_129701S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInformationType_129701S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerReference" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ReferencingDetailsType_188873C" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInformationType_129701S", propOrder = {
    "passengerReference"
})
public class ReferenceInformationType129701S {

    protected List<ReferencingDetailsType188873C> passengerReference;

    /**
     * Gets the value of the passengerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencingDetailsType188873C }
     * 
     * 
     */
    public List<ReferencingDetailsType188873C> getPassengerReference() {
        if (passengerReference == null) {
            passengerReference = new ArrayList<ReferencingDetailsType188873C>();
        }
        return this.passengerReference;
    }

}
