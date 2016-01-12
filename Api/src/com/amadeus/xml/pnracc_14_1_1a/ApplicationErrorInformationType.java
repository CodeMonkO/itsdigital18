
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the message type
 * 
 * <p>Java class for ApplicationErrorInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorDetail" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ApplicationErrorDetailTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorInformationType", propOrder = {
    "errorDetail"
})
public class ApplicationErrorInformationType {

    @XmlElement(required = true)
    protected ApplicationErrorDetailTypeI errorDetail;

    /**
     * Gets the value of the errorDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorDetailTypeI }
     *     
     */
    public ApplicationErrorDetailTypeI getErrorDetail() {
        return errorDetail;
    }

    /**
     * Sets the value of the errorDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorDetailTypeI }
     *     
     */
    public void setErrorDetail(ApplicationErrorDetailTypeI value) {
        this.errorDetail = value;
    }

}
