
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * to convey the pnr point of sell
 * 
 * <p>Java class for POSGroupType_150753G complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POSGroupType_150753G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sbrUserIdentification" type="{http://xml.amadeus.com/PNRACC_14_1_1A}UserIdentificationType_132892S"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POSGroupType_150753G", propOrder = {
    "sbrUserIdentification"
})
public class POSGroupType150753G {

    @XmlElement(required = true)
    protected UserIdentificationType132892S sbrUserIdentification;

    /**
     * Gets the value of the sbrUserIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentificationType132892S }
     *     
     */
    public UserIdentificationType132892S getSbrUserIdentification() {
        return sbrUserIdentification;
    }

    /**
     * Sets the value of the sbrUserIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentificationType132892S }
     *     
     */
    public void setSbrUserIdentification(UserIdentificationType132892S value) {
        this.sbrUserIdentification = value;
    }

}
