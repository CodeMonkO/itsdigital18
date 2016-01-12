
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the details for making a selection.
 * 
 * <p>Java class for SelectionDetailsTypeI_132941S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectionDetailsTypeI_132941S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selectionDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SelectionDetailsInformationTypeI_192864C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionDetailsTypeI_132941S", propOrder = {
    "selectionDetails"
})
public class SelectionDetailsTypeI132941S {

    @XmlElement(required = true)
    protected SelectionDetailsInformationTypeI192864C selectionDetails;

    /**
     * Gets the value of the selectionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsInformationTypeI192864C }
     *     
     */
    public SelectionDetailsInformationTypeI192864C getSelectionDetails() {
        return selectionDetails;
    }

    /**
     * Sets the value of the selectionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsInformationTypeI192864C }
     *     
     */
    public void setSelectionDetails(SelectionDetailsInformationTypeI192864C value) {
        this.selectionDetails = value;
    }

}
