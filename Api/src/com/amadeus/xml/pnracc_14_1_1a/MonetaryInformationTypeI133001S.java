
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * MONETARY INFORMATION
 * 
 * <p>Java class for MonetaryInformationTypeI_133001S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationTypeI_133001S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="information" type="{http://xml.amadeus.com/PNRACC_14_1_1A}MonetaryInformationDetailsTypeI_192954C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationTypeI_133001S", propOrder = {
    "information"
})
public class MonetaryInformationTypeI133001S {

    protected MonetaryInformationDetailsTypeI192954C information;

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsTypeI192954C }
     *     
     */
    public MonetaryInformationDetailsTypeI192954C getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsTypeI192954C }
     *     
     */
    public void setInformation(MonetaryInformationDetailsTypeI192954C value) {
        this.information = value;
    }

}
