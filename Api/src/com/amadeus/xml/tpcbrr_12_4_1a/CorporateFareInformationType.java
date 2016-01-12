
package com.amadeus.xml.tpcbrr_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify corporate fare information
 * 
 * <p>Java class for CorporateFareInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateFareInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corporateFareIdentifiers" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CorporateFareIdentifiersTypeI" maxOccurs="20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateFareInformationType", propOrder = {
    "corporateFareIdentifiers"
})
public class CorporateFareInformationType {

    @XmlElement(required = true)
    protected List<CorporateFareIdentifiersTypeI> corporateFareIdentifiers;

    /**
     * Gets the value of the corporateFareIdentifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateFareIdentifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateFareIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateFareIdentifiersTypeI }
     * 
     * 
     */
    public List<CorporateFareIdentifiersTypeI> getCorporateFareIdentifiers() {
        if (corporateFareIdentifiers == null) {
            corporateFareIdentifiers = new ArrayList<CorporateFareIdentifiersTypeI>();
        }
        return this.corporateFareIdentifiers;
    }

}
