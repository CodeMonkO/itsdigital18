
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FOPRepresentationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FOPRepresentationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formOfPaymentDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}FormOfPaymentTypeI"/>
 *         &lt;element name="passengerFeeReference" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ItemReferencesAndVersionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FOPRepresentationType", propOrder = {
    "formOfPaymentDetails",
    "passengerFeeReference"
})
public class FOPRepresentationType {

    @XmlElement(required = true)
    protected FormOfPaymentTypeI formOfPaymentDetails;
    protected ItemReferencesAndVersionsType passengerFeeReference;

    /**
     * Gets the value of the formOfPaymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public FormOfPaymentTypeI getFormOfPaymentDetails() {
        return formOfPaymentDetails;
    }

    /**
     * Sets the value of the formOfPaymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public void setFormOfPaymentDetails(FormOfPaymentTypeI value) {
        this.formOfPaymentDetails = value;
    }

    /**
     * Gets the value of the passengerFeeReference property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReferencesAndVersionsType }
     *     
     */
    public ItemReferencesAndVersionsType getPassengerFeeReference() {
        return passengerFeeReference;
    }

    /**
     * Sets the value of the passengerFeeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReferencesAndVersionsType }
     *     
     */
    public void setPassengerFeeReference(ItemReferencesAndVersionsType value) {
        this.passengerFeeReference = value;
    }

}
