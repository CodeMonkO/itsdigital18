
package com.amadeus.xml.tautcr_04_1_1a;

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
 *         &lt;element name="applicationError" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applicationErrorInfo" type="{http://xml.amadeus.com/TAUTCR_04_1_1A}ApplicationErrorInformationType"/>
 *                   &lt;element name="errorText" type="{http://xml.amadeus.com/TAUTCR_04_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pnrLocatorData" type="{http://xml.amadeus.com/TAUTCR_04_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
 *         &lt;element name="tstList" maxOccurs="1980" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tstReference" type="{http://xml.amadeus.com/TAUTCR_04_1_1A}ItemReferencesAndVersionsType"/>
 *                   &lt;element name="paxInformation" type="{http://xml.amadeus.com/TAUTCR_04_1_1A}ReferenceInformationTypeI" minOccurs="0"/>
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
    "applicationError",
    "pnrLocatorData",
    "tstList"
})
@XmlRootElement(name = "Ticket_CreateTSTFromPricingReply")
public class TicketCreateTSTFromPricingReply {

    protected TicketCreateTSTFromPricingReply.ApplicationError applicationError;
    protected ReservationControlInformationTypeI pnrLocatorData;
    protected List<TicketCreateTSTFromPricingReply.TstList> tstList;

    /**
     * Gets the value of the applicationError property.
     * 
     * @return
     *     possible object is
     *     {@link TicketCreateTSTFromPricingReply.ApplicationError }
     *     
     */
    public TicketCreateTSTFromPricingReply.ApplicationError getApplicationError() {
        return applicationError;
    }

    /**
     * Sets the value of the applicationError property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketCreateTSTFromPricingReply.ApplicationError }
     *     
     */
    public void setApplicationError(TicketCreateTSTFromPricingReply.ApplicationError value) {
        this.applicationError = value;
    }

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
     * Gets the value of the tstList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tstList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTstList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketCreateTSTFromPricingReply.TstList }
     * 
     * 
     */
    public List<TicketCreateTSTFromPricingReply.TstList> getTstList() {
        if (tstList == null) {
            tstList = new ArrayList<TicketCreateTSTFromPricingReply.TstList>();
        }
        return this.tstList;
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
     *         &lt;element name="applicationErrorInfo" type="{http://xml.amadeus.com/TAUTCR_04_1_1A}ApplicationErrorInformationType"/>
     *         &lt;element name="errorText" type="{http://xml.amadeus.com/TAUTCR_04_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
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
        "applicationErrorInfo",
        "errorText"
    })
    public static class ApplicationError {

        @XmlElement(required = true)
        protected ApplicationErrorInformationType applicationErrorInfo;
        protected InteractiveFreeTextTypeI errorText;

        /**
         * Gets the value of the applicationErrorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationErrorInformationType }
         *     
         */
        public ApplicationErrorInformationType getApplicationErrorInfo() {
            return applicationErrorInfo;
        }

        /**
         * Sets the value of the applicationErrorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationErrorInformationType }
         *     
         */
        public void setApplicationErrorInfo(ApplicationErrorInformationType value) {
            this.applicationErrorInfo = value;
        }

        /**
         * Gets the value of the errorText property.
         * 
         * @return
         *     possible object is
         *     {@link InteractiveFreeTextTypeI }
         *     
         */
        public InteractiveFreeTextTypeI getErrorText() {
            return errorText;
        }

        /**
         * Sets the value of the errorText property.
         * 
         * @param value
         *     allowed object is
         *     {@link InteractiveFreeTextTypeI }
         *     
         */
        public void setErrorText(InteractiveFreeTextTypeI value) {
            this.errorText = value;
        }

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
     *         &lt;element name="tstReference" type="{http://xml.amadeus.com/TAUTCR_04_1_1A}ItemReferencesAndVersionsType"/>
     *         &lt;element name="paxInformation" type="{http://xml.amadeus.com/TAUTCR_04_1_1A}ReferenceInformationTypeI" minOccurs="0"/>
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
        "tstReference",
        "paxInformation"
    })
    public static class TstList {

        @XmlElement(required = true)
        protected ItemReferencesAndVersionsType tstReference;
        protected ReferenceInformationTypeI paxInformation;

        /**
         * Gets the value of the tstReference property.
         * 
         * @return
         *     possible object is
         *     {@link ItemReferencesAndVersionsType }
         *     
         */
        public ItemReferencesAndVersionsType getTstReference() {
            return tstReference;
        }

        /**
         * Sets the value of the tstReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemReferencesAndVersionsType }
         *     
         */
        public void setTstReference(ItemReferencesAndVersionsType value) {
            this.tstReference = value;
        }

        /**
         * Gets the value of the paxInformation property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformationTypeI }
         *     
         */
        public ReferenceInformationTypeI getPaxInformation() {
            return paxInformation;
        }

        /**
         * Sets the value of the paxInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformationTypeI }
         *     
         */
        public void setPaxInformation(ReferenceInformationTypeI value) {
            this.paxInformation = value;
        }

    }

}
