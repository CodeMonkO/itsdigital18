
package com.amadeus.xml.tpcbrq_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify commercial agreements between two  or more companies related to joint, shared, lease operations etc.
 * 
 * <p>Java class for CommercialAgreementsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialAgreementsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}CompanyRoleIdentificationTypeI" maxOccurs="99"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialAgreementsTypeI", propOrder = {
    "companyDetails"
})
public class CommercialAgreementsTypeI {

    @XmlElement(required = true)
    protected List<CompanyRoleIdentificationTypeI> companyDetails;

    /**
     * Gets the value of the companyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyRoleIdentificationTypeI }
     * 
     * 
     */
    public List<CompanyRoleIdentificationTypeI> getCompanyDetails() {
        if (companyDetails == null) {
            companyDetails = new ArrayList<CompanyRoleIdentificationTypeI>();
        }
        return this.companyDetails;
    }

}
