
package com.amadeus.xml.tpcbrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of application error within a message.
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
 *         &lt;element name="applicationErrorDetail" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ApplicationErrorDetailType_48648C"/>
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
    "applicationErrorDetail"
})
public class ApplicationErrorInformationType {

    @XmlElement(required = true)
    protected ApplicationErrorDetailType48648C applicationErrorDetail;

    /**
     * Gets the value of the applicationErrorDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorDetailType48648C }
     *     
     */
    public ApplicationErrorDetailType48648C getApplicationErrorDetail() {
        return applicationErrorDetail;
    }

    /**
     * Sets the value of the applicationErrorDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorDetailType48648C }
     *     
     */
    public void setApplicationErrorDetail(ApplicationErrorDetailType48648C value) {
        this.applicationErrorDetail = value;
    }

}
