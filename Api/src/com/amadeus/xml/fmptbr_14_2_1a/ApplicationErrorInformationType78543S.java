
package com.amadeus.xml.fmptbr_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of application error within a message
 * 
 * <p>Java class for ApplicationErrorInformationType_78543S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorInformationType_78543S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationErrorDetail" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}ApplicationErrorInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorInformationType_78543S", propOrder = {
    "applicationErrorDetail"
})
public class ApplicationErrorInformationType78543S {

    @XmlElement(required = true)
    protected ApplicationErrorInformationType applicationErrorDetail;

    /**
     * Gets the value of the applicationErrorDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorInformationType }
     *     
     */
    public ApplicationErrorInformationType getApplicationErrorDetail() {
        return applicationErrorDetail;
    }

    /**
     * Sets the value of the applicationErrorDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorInformationType }
     *     
     */
    public void setApplicationErrorDetail(ApplicationErrorInformationType value) {
        this.applicationErrorDetail = value;
    }

}
