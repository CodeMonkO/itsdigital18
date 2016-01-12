
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentInformationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentInformationTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeOfDocument" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="documentNumber" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To20"/>
 *         &lt;element name="countryOfIssue" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentInformationTypeU", propOrder = {
    "typeOfDocument",
    "documentNumber",
    "countryOfIssue"
})
public class DocumentInformationTypeU {

    @XmlElement(required = true)
    protected String typeOfDocument;
    @XmlElement(required = true)
    protected String documentNumber;
    protected String countryOfIssue;

    /**
     * Gets the value of the typeOfDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfDocument() {
        return typeOfDocument;
    }

    /**
     * Sets the value of the typeOfDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfDocument(String value) {
        this.typeOfDocument = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the countryOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfIssue() {
        return countryOfIssue;
    }

    /**
     * Sets the value of the countryOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfIssue(String value) {
        this.countryOfIssue = value;
    }

}
