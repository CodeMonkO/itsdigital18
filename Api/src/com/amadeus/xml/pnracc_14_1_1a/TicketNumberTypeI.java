
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information related to a specific ticket.
 * 
 * <p>Java class for TicketNumberTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketNumberTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TicketNumberDetailsTypeI_192850C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketNumberTypeI", propOrder = {
    "documentDetails"
})
public class TicketNumberTypeI {

    @XmlElement(required = true)
    protected TicketNumberDetailsTypeI192850C documentDetails;

    /**
     * Gets the value of the documentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TicketNumberDetailsTypeI192850C }
     *     
     */
    public TicketNumberDetailsTypeI192850C getDocumentDetails() {
        return documentDetails;
    }

    /**
     * Sets the value of the documentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketNumberDetailsTypeI192850C }
     *     
     */
    public void setDocumentDetails(TicketNumberDetailsTypeI192850C value) {
        this.documentDetails = value;
    }

}
