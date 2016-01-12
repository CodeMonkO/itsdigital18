
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeShareDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeShareDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeShareAgreement" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length3To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeShareDetailsType", propOrder = {
    "codeShareAgreement"
})
public class CodeShareDetailsType {

    @XmlElement(required = true)
    protected String codeShareAgreement;

    /**
     * Gets the value of the codeShareAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeShareAgreement() {
        return codeShareAgreement;
    }

    /**
     * Sets the value of the codeShareAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeShareAgreement(String value) {
        this.codeShareAgreement = value;
    }

}
