
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of application error within a message.
 * 
 * <p>Java class for ApplicationErrorInformationType_132938S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorInformationType_132938S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ApplicationErrorDetailType_192859C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorInformationType_132938S", propOrder = {
    "errorDetails"
})
public class ApplicationErrorInformationType132938S {

    @XmlElement(required = true)
    protected ApplicationErrorDetailType192859C errorDetails;

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorDetailType192859C }
     *     
     */
    public ApplicationErrorDetailType192859C getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorDetailType192859C }
     *     
     */
    public void setErrorDetails(ApplicationErrorDetailType192859C value) {
        this.errorDetails = value;
    }

}
