
package com.amadeus.xml.tautcq_04_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pnrLocatorData" type="{http://xml.amadeus.com/TAUTCQ_04_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
 *         &lt;element name="psaList" maxOccurs="1980">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemReference" type="{http://xml.amadeus.com/TAUTCQ_04_1_1A}ItemReferencesAndVersionsType"/>
 *                   &lt;element name="paxReference" type="{http://xml.amadeus.com/TAUTCQ_04_1_1A}ReferenceInformationTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pnrLocatorData",
    "psaList"
})
@XmlRootElement(name = "Ticket_CreateTSTFromPricing")
public class TicketCreateTSTFromPricing {

    protected ReservationControlInformationTypeI pnrLocatorData;
    @XmlElement(required = true)
    protected List<TicketCreateTSTFromPricing.PsaList> psaList;

    /**
     * Gets the value of the pnrLocatorData property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public ReservationControlInformationTypeI getPnrLocatorData() {
        return pnrLocatorData;
    }

    /**
     * Sets the value of the pnrLocatorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public void setPnrLocatorData(ReservationControlInformationTypeI value) {
        this.pnrLocatorData = value;
    }

    /**
     * Gets the value of the psaList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the psaList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPsaList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketCreateTSTFromPricing.PsaList }
     * 
     * 
     */
    public List<TicketCreateTSTFromPricing.PsaList> getPsaList() {
        if (psaList == null) {
            psaList = new ArrayList<TicketCreateTSTFromPricing.PsaList>();
        }
        return this.psaList;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="itemReference" type="{http://xml.amadeus.com/TAUTCQ_04_1_1A}ItemReferencesAndVersionsType"/>
     *         &lt;element name="paxReference" type="{http://xml.amadeus.com/TAUTCQ_04_1_1A}ReferenceInformationTypeI" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemReference",
        "paxReference"
    })
    public static class PsaList {

        @XmlElement(required = true)
        protected ItemReferencesAndVersionsType itemReference;
        protected ReferenceInformationTypeI paxReference;

        /**
         * Gets the value of the itemReference property.
         * 
         * @return
         *     possible object is
         *     {@link ItemReferencesAndVersionsType }
         *     
         */
        public ItemReferencesAndVersionsType getItemReference() {
            return itemReference;
        }

        /**
         * Sets the value of the itemReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemReferencesAndVersionsType }
         *     
         */
        public void setItemReference(ItemReferencesAndVersionsType value) {
            this.itemReference = value;
        }

        /**
         * Gets the value of the paxReference property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformationTypeI }
         *     
         */
        public ReferenceInformationTypeI getPaxReference() {
            return paxReference;
        }

        /**
         * Sets the value of the paxReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformationTypeI }
         *     
         */
        public void setPaxReference(ReferenceInformationTypeI value) {
            this.paxReference = value;
        }

    }

}
