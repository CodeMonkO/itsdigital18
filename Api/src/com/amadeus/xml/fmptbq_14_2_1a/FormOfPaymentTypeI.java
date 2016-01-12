
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details describing the form of payment.
 * 
 * <p>Java class for FormOfPaymentTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formOfPaymentDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}FormOfPaymentDetailsTypeI" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentTypeI", propOrder = {
    "formOfPaymentDetails"
})
public class FormOfPaymentTypeI {

    protected List<FormOfPaymentDetailsTypeI> formOfPaymentDetails;

    /**
     * Gets the value of the formOfPaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPaymentDetailsTypeI }
     * 
     * 
     */
    public List<FormOfPaymentDetailsTypeI> getFormOfPaymentDetails() {
        if (formOfPaymentDetails == null) {
            formOfPaymentDetails = new ArrayList<FormOfPaymentDetailsTypeI>();
        }
        return this.formOfPaymentDetails;
    }

}
