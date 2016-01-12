
package com.amadeus.xml.tpcbrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the transport service(s) which is /are to be updated or cancelled
 * 
 * <p>Java class for TransportIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrierInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CompanyIdentificationTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportIdentifierType", propOrder = {
    "carrierInformation"
})
public class TransportIdentifierType {

    protected CompanyIdentificationTypeI carrierInformation;

    /**
     * Gets the value of the carrierInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public CompanyIdentificationTypeI getCarrierInformation() {
        return carrierInformation;
    }

    /**
     * Sets the value of the carrierInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public void setCarrierInformation(CompanyIdentificationTypeI value) {
        this.carrierInformation = value;
    }

}
