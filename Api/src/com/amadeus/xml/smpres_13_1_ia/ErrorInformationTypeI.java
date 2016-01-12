
package com.amadeus.xml.smpres_13_1_ia;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the error(s) encountered while processing.
 * 
 * <p>Java class for ErrorInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}ErrorInformationDetailsTypeI"/>
 *         &lt;element name="otherErrorDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}ErrorInformationDetailsTypeI" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorInformationTypeI", propOrder = {
    "errorDetails",
    "otherErrorDetails"
})
public class ErrorInformationTypeI {

    @XmlElement(required = true)
    protected ErrorInformationDetailsTypeI errorDetails;
    protected List<ErrorInformationDetailsTypeI> otherErrorDetails;

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorInformationDetailsTypeI }
     *     
     */
    public ErrorInformationDetailsTypeI getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorInformationDetailsTypeI }
     *     
     */
    public void setErrorDetails(ErrorInformationDetailsTypeI value) {
        this.errorDetails = value;
    }

    /**
     * Gets the value of the otherErrorDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherErrorDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherErrorDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorInformationDetailsTypeI }
     * 
     * 
     */
    public List<ErrorInformationDetailsTypeI> getOtherErrorDetails() {
        if (otherErrorDetails == null) {
            otherErrorDetails = new ArrayList<ErrorInformationDetailsTypeI>();
        }
        return this.otherErrorDetails;
    }

}
