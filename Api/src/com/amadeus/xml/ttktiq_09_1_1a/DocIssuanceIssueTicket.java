
package com.amadeus.xml.ttktiq_09_1_1a;

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
 *         &lt;element name="agentInfo" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}TicketAgentInfoTypeI" minOccurs="0"/>
 *         &lt;element name="overrideDate" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}StructuredDateTimeInformationType" minOccurs="0"/>
 *         &lt;element name="selection" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}ReferenceInfoType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="paxSelection" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}ReferenceInformationType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="stock" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}StockInformationType" minOccurs="0"/>
 *         &lt;element name="optionGroup" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="switches" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}StatusTypeI"/>
 *                   &lt;element name="subCompoundOptions" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}AttributeType" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="overrideAlternativeDate" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}StructuredDateTimeInformationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infantOrAdultAssociation" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}TravellerInformationType" minOccurs="0"/>
 *         &lt;element name="otherCompoundOptions" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}CodedAttributeType" maxOccurs="99" minOccurs="0"/>
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
    "agentInfo",
    "overrideDate",
    "selection",
    "paxSelection",
    "stock",
    "optionGroup",
    "infantOrAdultAssociation",
    "otherCompoundOptions"
})
@XmlRootElement(name = "DocIssuance_IssueTicket")
public class DocIssuanceIssueTicket {

    protected TicketAgentInfoTypeI agentInfo;
    protected StructuredDateTimeInformationType overrideDate;
    protected List<ReferenceInfoType> selection;
    protected List<ReferenceInformationType> paxSelection;
    protected StockInformationType stock;
    protected List<DocIssuanceIssueTicket.OptionGroup> optionGroup;
    protected TravellerInformationType infantOrAdultAssociation;
    protected List<CodedAttributeType> otherCompoundOptions;

    /**
     * Gets the value of the agentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TicketAgentInfoTypeI }
     *     
     */
    public TicketAgentInfoTypeI getAgentInfo() {
        return agentInfo;
    }

    /**
     * Sets the value of the agentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketAgentInfoTypeI }
     *     
     */
    public void setAgentInfo(TicketAgentInfoTypeI value) {
        this.agentInfo = value;
    }

    /**
     * Gets the value of the overrideDate property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType }
     *     
     */
    public StructuredDateTimeInformationType getOverrideDate() {
        return overrideDate;
    }

    /**
     * Sets the value of the overrideDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType }
     *     
     */
    public void setOverrideDate(StructuredDateTimeInformationType value) {
        this.overrideDate = value;
    }

    /**
     * Gets the value of the selection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInfoType }
     * 
     * 
     */
    public List<ReferenceInfoType> getSelection() {
        if (selection == null) {
            selection = new ArrayList<ReferenceInfoType>();
        }
        return this.selection;
    }

    /**
     * Gets the value of the paxSelection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSelection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInformationType }
     * 
     * 
     */
    public List<ReferenceInformationType> getPaxSelection() {
        if (paxSelection == null) {
            paxSelection = new ArrayList<ReferenceInformationType>();
        }
        return this.paxSelection;
    }

    /**
     * Gets the value of the stock property.
     * 
     * @return
     *     possible object is
     *     {@link StockInformationType }
     *     
     */
    public StockInformationType getStock() {
        return stock;
    }

    /**
     * Sets the value of the stock property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockInformationType }
     *     
     */
    public void setStock(StockInformationType value) {
        this.stock = value;
    }

    /**
     * Gets the value of the optionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocIssuanceIssueTicket.OptionGroup }
     * 
     * 
     */
    public List<DocIssuanceIssueTicket.OptionGroup> getOptionGroup() {
        if (optionGroup == null) {
            optionGroup = new ArrayList<DocIssuanceIssueTicket.OptionGroup>();
        }
        return this.optionGroup;
    }

    /**
     * Gets the value of the infantOrAdultAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerInformationType }
     *     
     */
    public TravellerInformationType getInfantOrAdultAssociation() {
        return infantOrAdultAssociation;
    }

    /**
     * Sets the value of the infantOrAdultAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerInformationType }
     *     
     */
    public void setInfantOrAdultAssociation(TravellerInformationType value) {
        this.infantOrAdultAssociation = value;
    }

    /**
     * Gets the value of the otherCompoundOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherCompoundOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherCompoundOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedAttributeType }
     * 
     * 
     */
    public List<CodedAttributeType> getOtherCompoundOptions() {
        if (otherCompoundOptions == null) {
            otherCompoundOptions = new ArrayList<CodedAttributeType>();
        }
        return this.otherCompoundOptions;
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
     *         &lt;element name="switches" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}StatusTypeI"/>
     *         &lt;element name="subCompoundOptions" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}AttributeType" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="overrideAlternativeDate" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}StructuredDateTimeInformationType" minOccurs="0"/>
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
        "switches",
        "subCompoundOptions",
        "overrideAlternativeDate"
    })
    public static class OptionGroup {

        @XmlElement(required = true)
        protected StatusTypeI switches;
        protected List<AttributeType> subCompoundOptions;
        protected StructuredDateTimeInformationType overrideAlternativeDate;

        /**
         * Gets the value of the switches property.
         * 
         * @return
         *     possible object is
         *     {@link StatusTypeI }
         *     
         */
        public StatusTypeI getSwitches() {
            return switches;
        }

        /**
         * Sets the value of the switches property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusTypeI }
         *     
         */
        public void setSwitches(StatusTypeI value) {
            this.switches = value;
        }

        /**
         * Gets the value of the subCompoundOptions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subCompoundOptions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubCompoundOptions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getSubCompoundOptions() {
            if (subCompoundOptions == null) {
                subCompoundOptions = new ArrayList<AttributeType>();
            }
            return this.subCompoundOptions;
        }

        /**
         * Gets the value of the overrideAlternativeDate property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformationType }
         *     
         */
        public StructuredDateTimeInformationType getOverrideAlternativeDate() {
            return overrideAlternativeDate;
        }

        /**
         * Sets the value of the overrideAlternativeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformationType }
         *     
         */
        public void setOverrideAlternativeDate(StructuredDateTimeInformationType value) {
            this.overrideAlternativeDate = value;
        }

    }

}
