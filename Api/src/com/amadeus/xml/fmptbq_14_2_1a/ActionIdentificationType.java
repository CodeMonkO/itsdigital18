
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide details of action required or taken, the flights to which this action refers, and reasons for action taken.
 * 
 * <p>Java class for ActionIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionRequestCode" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="productDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ProductIdentificationDetailsTypeI_50878C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionIdentificationType", propOrder = {
    "actionRequestCode",
    "productDetails"
})
public class ActionIdentificationType {

    @XmlElement(required = true)
    protected String actionRequestCode;
    protected ProductIdentificationDetailsTypeI50878C productDetails;

    /**
     * Gets the value of the actionRequestCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionRequestCode() {
        return actionRequestCode;
    }

    /**
     * Sets the value of the actionRequestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionRequestCode(String value) {
        this.actionRequestCode = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeI50878C }
     *     
     */
    public ProductIdentificationDetailsTypeI50878C getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeI50878C }
     *     
     */
    public void setProductDetails(ProductIdentificationDetailsTypeI50878C value) {
        this.productDetails = value;
    }

}
