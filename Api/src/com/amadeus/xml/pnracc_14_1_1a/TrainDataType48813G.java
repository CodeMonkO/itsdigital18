
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Group together train business data
 * 
 * <p>Java class for TrainDataType_48813G complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainDataType_48813G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trainProductInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TrainProductInformationType"/>
 *         &lt;element name="tripDateTime" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_129285S" maxOccurs="2"/>
 *         &lt;element name="depLocation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}PlaceLocationIdentificationTypeU_132982S"/>
 *         &lt;element name="arrLocation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}PlaceLocationIdentificationTypeU_132982S"/>
 *         &lt;element name="railLeg" type="{http://xml.amadeus.com/PNRACC_14_1_1A}RailLegDataType_150775G" maxOccurs="6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainDataType_48813G", propOrder = {
    "trainProductInfo",
    "tripDateTime",
    "depLocation",
    "arrLocation",
    "railLeg"
})
public class TrainDataType48813G {

    @XmlElement(required = true)
    protected TrainProductInformationType trainProductInfo;
    @XmlElement(required = true)
    protected List<StructuredDateTimeInformationType129285S> tripDateTime;
    @XmlElement(required = true)
    protected PlaceLocationIdentificationTypeU132982S depLocation;
    @XmlElement(required = true)
    protected PlaceLocationIdentificationTypeU132982S arrLocation;
    protected List<RailLegDataType150775G> railLeg;

    /**
     * Gets the value of the trainProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrainProductInformationType }
     *     
     */
    public TrainProductInformationType getTrainProductInfo() {
        return trainProductInfo;
    }

    /**
     * Sets the value of the trainProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainProductInformationType }
     *     
     */
    public void setTrainProductInfo(TrainProductInformationType value) {
        this.trainProductInfo = value;
    }

    /**
     * Gets the value of the tripDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredDateTimeInformationType129285S }
     * 
     * 
     */
    public List<StructuredDateTimeInformationType129285S> getTripDateTime() {
        if (tripDateTime == null) {
            tripDateTime = new ArrayList<StructuredDateTimeInformationType129285S>();
        }
        return this.tripDateTime;
    }

    /**
     * Gets the value of the depLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceLocationIdentificationTypeU132982S }
     *     
     */
    public PlaceLocationIdentificationTypeU132982S getDepLocation() {
        return depLocation;
    }

    /**
     * Sets the value of the depLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceLocationIdentificationTypeU132982S }
     *     
     */
    public void setDepLocation(PlaceLocationIdentificationTypeU132982S value) {
        this.depLocation = value;
    }

    /**
     * Gets the value of the arrLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceLocationIdentificationTypeU132982S }
     *     
     */
    public PlaceLocationIdentificationTypeU132982S getArrLocation() {
        return arrLocation;
    }

    /**
     * Sets the value of the arrLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceLocationIdentificationTypeU132982S }
     *     
     */
    public void setArrLocation(PlaceLocationIdentificationTypeU132982S value) {
        this.arrLocation = value;
    }

    /**
     * Gets the value of the railLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailLegDataType150775G }
     * 
     * 
     */
    public List<RailLegDataType150775G> getRailLeg() {
        if (railLeg == null) {
            railLeg = new ArrayList<RailLegDataType150775G>();
        }
        return this.railLeg;
    }

}
