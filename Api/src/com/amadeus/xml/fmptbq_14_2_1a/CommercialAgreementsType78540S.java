
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify commercial agreements between two  or more companies related to joint, shared, lease operations etc.
 * 
 * <p>Java class for CommercialAgreementsType_78540S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialAgreementsType_78540S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeshareDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}CompanyRoleIdentificationType_120761C" minOccurs="0"/>
 *         &lt;element name="otherCodeshareDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}CompanyRoleIdentificationType_120761C" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialAgreementsType_78540S", propOrder = {
    "codeshareDetails",
    "otherCodeshareDetails"
})
public class CommercialAgreementsType78540S {

    protected CompanyRoleIdentificationType120761C codeshareDetails;
    protected List<CompanyRoleIdentificationType120761C> otherCodeshareDetails;

    /**
     * Gets the value of the codeshareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyRoleIdentificationType120761C }
     *     
     */
    public CompanyRoleIdentificationType120761C getCodeshareDetails() {
        return codeshareDetails;
    }

    /**
     * Sets the value of the codeshareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyRoleIdentificationType120761C }
     *     
     */
    public void setCodeshareDetails(CompanyRoleIdentificationType120761C value) {
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
     * {@link CompanyRoleIdentificationType120761C }
     * 
     * 
     */
    public List<CompanyRoleIdentificationType120761C> getOtherCodeshareDetails() {
        if (otherCodeshareDetails == null) {
            otherCodeshareDetails = new ArrayList<CompanyRoleIdentificationType120761C>();
        }
        return this.otherCodeshareDetails;
    }

}
