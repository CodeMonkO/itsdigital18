
package com.amadeus.xml.fmptbr_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify commercial agreements between two  or more companies related to joint, shared, lease operations etc.
 * 
 * <p>Java class for CommercialAgreementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialAgreementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeshareDetails" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}CompanyRoleIdentificationType" minOccurs="0"/>
 *         &lt;element name="otherCodeshareDetails" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}CompanyRoleIdentificationType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialAgreementsType", propOrder = {
    "codeshareDetails",
    "otherCodeshareDetails"
})
public class CommercialAgreementsType {

    protected CompanyRoleIdentificationType codeshareDetails;
    protected List<CompanyRoleIdentificationType> otherCodeshareDetails;

    /**
     * Gets the value of the codeshareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyRoleIdentificationType }
     *     
     */
    public CompanyRoleIdentificationType getCodeshareDetails() {
        return codeshareDetails;
    }

    /**
     * Sets the value of the codeshareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyRoleIdentificationType }
     *     
     */
    public void setCodeshareDetails(CompanyRoleIdentificationType value) {
        this.codeshareDetails = value;
    }

    /**
     * Gets the value of the otherCodeshareDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherCodeshareDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherCodeshareDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyRoleIdentificationType }
     * 
     * 
     */
    public List<CompanyRoleIdentificationType> getOtherCodeshareDetails() {
        if (otherCodeshareDetails == null) {
            otherCodeshareDetails = new ArrayList<CompanyRoleIdentificationType>();
        }
        return this.otherCodeshareDetails;
    }

}
