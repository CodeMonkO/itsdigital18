
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to identify a user.
 * 
 * <p>Java class for UserIdentificationType_132970S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserIdentificationType_132970S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originIdentification" type="{http://xml.amadeus.com/PNRACC_14_1_1A}OriginatorIdentificationDetailsTypeI_192904C"/>
 *         &lt;element name="originatorTypeCode" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIdentificationType_132970S", propOrder = {
    "originIdentification",
    "originatorTypeCode"
})
public class UserIdentificationType132970S {

    @XmlElement(required = true)
    protected OriginatorIdentificationDetailsTypeI192904C originIdentification;
    @XmlElement(required = true)
    protected String originatorTypeCode;

    /**
     * Gets the value of the originIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI192904C }
     *     
     */
    public OriginatorIdentificationDetailsTypeI192904C getOriginIdentification() {
        return originIdentification;
    }

    /**
     * Sets the value of the originIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI192904C }
     *     
     */
    public void setOriginIdentification(OriginatorIdentificationDetailsTypeI192904C value) {
        this.originIdentification = value;
    }

    /**
     * Gets the value of the originatorTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorTypeCode() {
        return originatorTypeCode;
    }

    /**
     * Sets the value of the originatorTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorTypeCode(String value) {
        this.originatorTypeCode = value;
    }

}
