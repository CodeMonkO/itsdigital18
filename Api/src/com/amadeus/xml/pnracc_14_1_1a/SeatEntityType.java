
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Seat group entity.
 * 
 * <p>Java class for SeatEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatEntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seatRequest" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SpecialRequirementsDetailsTypeI_133071S"/>
 *         &lt;element name="seatInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SeatSelectionDetailsTypeI_133070S" minOccurs="0"/>
 *         &lt;element name="individualSeatGroup" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="seatPassenger" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SeatRequestParametersTypeI"/>
 *                   &lt;element name="seatIndicator" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StatusTypeI_133063S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dateGaugeChange" type="{http://xml.amadeus.com/PNRACC_14_1_1A}DateAndTimeInformationTypeI_133069S" minOccurs="0"/>
 *         &lt;element name="freeTextDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}FreeTextInformationType_133072S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatEntityType", propOrder = {
    "seatRequest",
    "seatInformation",
    "individualSeatGroup",
    "dateGaugeChange",
    "freeTextDetails"
})
public class SeatEntityType {

    @XmlElement(required = true)
    protected SpecialRequirementsDetailsTypeI133071S seatRequest;
    protected SeatSelectionDetailsTypeI133070S seatInformation;
    protected List<SeatEntityType.IndividualSeatGroup> individualSeatGroup;
    protected DateAndTimeInformationTypeI133069S dateGaugeChange;
    protected FreeTextInformationType133072S freeTextDetails;

    /**
     * Gets the value of the seatRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsDetailsTypeI133071S }
     *     
     */
    public SpecialRequirementsDetailsTypeI133071S getSeatRequest() {
        return seatRequest;
    }

    /**
     * Sets the value of the seatRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsDetailsTypeI133071S }
     *     
     */
    public void setSeatRequest(SpecialRequirementsDetailsTypeI133071S value) {
        this.seatRequest = value;
    }

    /**
     * Gets the value of the seatInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SeatSelectionDetailsTypeI133070S }
     *     
     */
    public SeatSelectionDetailsTypeI133070S getSeatInformation() {
        return seatInformation;
    }

    /**
     * Sets the value of the seatInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatSelectionDetailsTypeI133070S }
     *     
     */
    public void setSeatInformation(SeatSelectionDetailsTypeI133070S value) {
        this.seatInformation = value;
    }

    /**
     * Gets the value of the individualSeatGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualSeatGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualSeatGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatEntityType.IndividualSeatGroup }
     * 
     * 
     */
    public List<SeatEntityType.IndividualSeatGroup> getIndividualSeatGroup() {
        if (individualSeatGroup == null) {
            individualSeatGroup = new ArrayList<SeatEntityType.IndividualSeatGroup>();
        }
        return this.individualSeatGroup;
    }

    /**
     * Gets the value of the dateGaugeChange property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeInformationTypeI133069S }
     *     
     */
    public DateAndTimeInformationTypeI133069S getDateGaugeChange() {
        return dateGaugeChange;
    }

    /**
     * Sets the value of the dateGaugeChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeInformationTypeI133069S }
     *     
     */
    public void setDateGaugeChange(DateAndTimeInformationTypeI133069S value) {
        this.dateGaugeChange = value;
    }

    /**
     * Gets the value of the freeTextDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType133072S }
     *     
     */
    public FreeTextInformationType133072S getFreeTextDetails() {
        return freeTextDetails;
    }

    /**
     * Sets the value of the freeTextDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType133072S }
     *     
     */
    public void setFreeTextDetails(FreeTextInformationType133072S value) {
        this.freeTextDetails = value;
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
     *         &lt;element name="seatPassenger" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SeatRequestParametersTypeI"/>
     *         &lt;element name="seatIndicator" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StatusTypeI_133063S" minOccurs="0"/>
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
        "seatPassenger",
        "seatIndicator"
    })
    public static class IndividualSeatGroup {

        @XmlElement(required = true)
        protected SeatRequestParametersTypeI seatPassenger;
        protected StatusTypeI133063S seatIndicator;

        /**
         * Gets the value of the seatPassenger property.
         * 
         * @return
         *     possible object is
         *     {@link SeatRequestParametersTypeI }
         *     
         */
        public SeatRequestParametersTypeI getSeatPassenger() {
            return seatPassenger;
        }

        /**
         * Sets the value of the seatPassenger property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatRequestParametersTypeI }
         *     
         */
        public void setSeatPassenger(SeatRequestParametersTypeI value) {
            this.seatPassenger = value;
        }

        /**
         * Gets the value of the seatIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link StatusTypeI133063S }
         *     
         */
        public StatusTypeI133063S getSeatIndicator() {
            return seatIndicator;
        }

        /**
         * Sets the value of the seatIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusTypeI133063S }
         *     
         */
        public void setSeatIndicator(StatusTypeI133063S value) {
            this.seatIndicator = value;
        }

    }

}
