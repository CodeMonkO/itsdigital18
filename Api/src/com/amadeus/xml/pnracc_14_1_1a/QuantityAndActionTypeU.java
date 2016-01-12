
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate quantity and action required in relation to a product.
 * 
 * <p>Java class for QuantityAndActionTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityAndActionTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accoStatus" type="{http://xml.amadeus.com/PNRACC_14_1_1A}QuantityAndActionDetailsTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityAndActionTypeU", propOrder = {
    "accoStatus"
})
public class QuantityAndActionTypeU {

    @XmlElement(required = true)
    protected QuantityAndActionDetailsTypeU accoStatus;

    /**
     * Gets the value of the accoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndActionDetailsTypeU }
     *     
     */
    public QuantityAndActionDetailsTypeU getAccoStatus() {
        return accoStatus;
    }

    /**
     * Sets the value of the accoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndActionDetailsTypeU }
     *     
     */
    public void setAccoStatus(QuantityAndActionDetailsTypeU value) {
        this.accoStatus = value;
    }

}
