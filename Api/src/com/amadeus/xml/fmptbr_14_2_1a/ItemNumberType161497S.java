
package com.amadeus.xml.fmptbr_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify item numbers
 * 
 * <p>Java class for ItemNumberType_161497S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNumberType_161497S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNumberId" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}ItemNumberIdentificationType_191597C" minOccurs="0"/>
 *         &lt;element name="codeShareDetails" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}CompanyRoleIdentificationType_120771C" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="priceTicketing" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}PricingTicketingInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNumberType_161497S", propOrder = {
    "itemNumberId",
    "codeShareDetails",
    "priceTicketing"
})
public class ItemNumberType161497S {

    protected ItemNumberIdentificationType191597C itemNumberId;
    protected List<CompanyRoleIdentificationType120771C> codeShareDetails;
    protected PricingTicketingInformationType priceTicketing;

    /**
     * Gets the value of the itemNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberIdentificationType191597C }
     *     
     */
    public ItemNumberIdentificationType191597C getItemNumberId() {
        return itemNumberId;
    }

    /**
     * Sets the value of the itemNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberIdentificationType191597C }
     *     
     */
    public void setItemNumberId(ItemNumberIdentificationType191597C value) {
        this.itemNumberId = value;
    }

    /**
     * Gets the value of the codeShareDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeShareDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeShareDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyRoleIdentificationType120771C }
     * 
     * 
     */
    public List<CompanyRoleIdentificationType120771C> getCodeShareDetails() {
        if (codeShareDetails == null) {
            codeShareDetails = new ArrayList<CompanyRoleIdentificationType120771C>();
        }
        return this.codeShareDetails;
    }

    /**
     * Gets the value of the priceTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingInformationType }
     *     
     */
    public PricingTicketingInformationType getPriceTicketing() {
        return priceTicketing;
    }

    /**
     * Sets the value of the priceTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingInformationType }
     *     
     */
    public void setPriceTicketing(PricingTicketingInformationType value) {
        this.priceTicketing = value;
    }

}
