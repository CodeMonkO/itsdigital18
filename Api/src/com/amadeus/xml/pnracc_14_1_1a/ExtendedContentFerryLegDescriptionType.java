
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * conveys the extended content for ferry
 * 
 * <p>Java class for ExtendedContentFerryLegDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedContentFerryLegDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinDescription" type="{http://xml.amadeus.com/PNRACC_14_1_1A}CabinDescriptionType"/>
 *         &lt;element name="mileageInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}QuantityType" minOccurs="0"/>
 *         &lt;element name="ticketInfogroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ticketNumber" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TicketNumberType_128754S"/>
 *                   &lt;element name="dateInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_128730S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="itineraryInfoGroup" type="{http://xml.amadeus.com/PNRACC_14_1_1A}FerryLegDescriptionType" maxOccurs="12" minOccurs="0"/>
 *         &lt;element name="accomodationPackageInfoGroup" type="{http://xml.amadeus.com/PNRACC_14_1_1A}FerryAccomodationPackageDescriptionType" maxOccurs="4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedContentFerryLegDescriptionType", propOrder = {
    "cabinDescription",
    "mileageInfo",
    "ticketInfogroup",
    "itineraryInfoGroup",
    "accomodationPackageInfoGroup"
})
public class ExtendedContentFerryLegDescriptionType {

    @XmlElement(required = true)
    protected CabinDescriptionType cabinDescription;
    protected QuantityType mileageInfo;
    protected ExtendedContentFerryLegDescriptionType.TicketInfogroup ticketInfogroup;
    protected List<FerryLegDescriptionType> itineraryInfoGroup;
    protected List<FerryAccomodationPackageDescriptionType> accomodationPackageInfoGroup;

    /**
     * Gets the value of the cabinDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CabinDescriptionType }
     *     
     */
    public CabinDescriptionType getCabinDescription() {
        return cabinDescription;
    }

    /**
     * Sets the value of the cabinDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinDescriptionType }
     *     
     */
    public void setCabinDescription(CabinDescriptionType value) {
        this.cabinDescription = value;
    }

    /**
     * Gets the value of the mileageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getMileageInfo() {
        return mileageInfo;
    }

    /**
     * Sets the value of the mileageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setMileageInfo(QuantityType value) {
        this.mileageInfo = value;
    }

    /**
     * Gets the value of the ticketInfogroup property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedContentFerryLegDescriptionType.TicketInfogroup }
     *     
     */
    public ExtendedContentFerryLegDescriptionType.TicketInfogroup getTicketInfogroup() {
        return ticketInfogroup;
    }

    /**
     * Sets the value of the ticketInfogroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedContentFerryLegDescriptionType.TicketInfogroup }
     *     
     */
    public void setTicketInfogroup(ExtendedContentFerryLegDescriptionType.TicketInfogroup value) {
        this.ticketInfogroup = value;
    }

    /**
     * Gets the value of the itineraryInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryLegDescriptionType }
     * 
     * 
     */
    public List<FerryLegDescriptionType> getItineraryInfoGroup() {
        if (itineraryInfoGroup == null) {
            itineraryInfoGroup = new ArrayList<FerryLegDescriptionType>();
        }
        return this.itineraryInfoGroup;
    }

    /**
     * Gets the value of the accomodationPackageInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accomodationPackageInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccomodationPackageInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryAccomodationPackageDescriptionType }
     * 
     * 
     */
    public List<FerryAccomodationPackageDescriptionType> getAccomodationPackageInfoGroup() {
        if (accomodationPackageInfoGroup == null) {
            accomodationPackageInfoGroup = new ArrayList<FerryAccomodationPackageDescriptionType>();
        }
        return this.accomodationPackageInfoGroup;
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
     *         &lt;element name="ticketNumber" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TicketNumberType_128754S"/>
     *         &lt;element name="dateInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_128730S" minOccurs="0"/>
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
        "ticketNumber",
        "dateInfo"
    })
    public static class TicketInfogroup {

        @XmlElement(required = true)
        protected TicketNumberType128754S ticketNumber;
        protected StructuredDateTimeInformationType128730S dateInfo;

        /**
         * Gets the value of the ticketNumber property.
         * 
         * @return
         *     possible object is
         *     {@link TicketNumberType128754S }
         *     
         */
        public TicketNumberType128754S getTicketNumber() {
            return ticketNumber;
        }

        /**
         * Sets the value of the ticketNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketNumberType128754S }
         *     
         */
        public void setTicketNumber(TicketNumberType128754S value) {
            this.ticketNumber = value;
        }

        /**
         * Gets the value of the dateInfo property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformationType128730S }
         *     
         */
        public StructuredDateTimeInformationType128730S getDateInfo() {
            return dateInfo;
        }

        /**
         * Sets the value of the dateInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformationType128730S }
         *     
         */
        public void setDateInfo(StructuredDateTimeInformationType128730S value) {
            this.dateInfo = value;
        }

    }

}
