
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * contains the data of a rail leg
 * 
 * <p>Java class for RailLegDataType_150775G complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailLegDataType_150775G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trainProductInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TrainProductInformationType_132986S"/>
 *         &lt;element name="reservableStatus" type="{http://xml.amadeus.com/PNRACC_14_1_1A}QuantityAndActionTypeU_132977S" minOccurs="0"/>
 *         &lt;element name="legDateTime" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_129285S" maxOccurs="2"/>
 *         &lt;element name="depLocation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}PlaceLocationIdentificationTypeU_132982S"/>
 *         &lt;element name="arrLocation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}PlaceLocationIdentificationTypeU_132982S"/>
 *         &lt;element name="legReference" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ItemNumberTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailLegDataType_150775G", propOrder = {
    "trainProductInfo",
    "reservableStatus",
    "legDateTime",
    "depLocation",
    "arrLocation",
    "legReference"
})
public class RailLegDataType150775G {

    @XmlElement(required = true)
    protected TrainProductInformationType132986S trainProductInfo;
    protected QuantityAndActionTypeU132977S reservableStatus;
    @XmlElement(required = true)
    protected List<StructuredDateTimeInformationType129285S> legDateTime;
    @XmlElement(required = true)
    protected PlaceLocationIdentificationTypeU132982S depLocation;
    @XmlElement(required = true)
    protected PlaceLocationIdentificationTypeU132982S arrLocation;
    @XmlElement(required = true)
    protected ItemNumberTypeU legReference;

    /**
     * Gets the value of the trainProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrainProductInformationType132986S }
     *     
     */
    public TrainProductInformationType132986S getTrainProductInfo() {
        return trainProductInfo;
    }

    /**
     * Sets the value of the trainProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainProductInformationType132986S }
     *     
     */
    public void setTrainProductInfo(TrainProductInformationType132986S value) {
        this.trainProductInfo = value;
    }

    /**
     * Gets the value of the reservableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndActionTypeU132977S }
     *     
     */
    public QuantityAndActionTypeU132977S getReservableStatus() {
        return reservableStatus;
    }

    /**
     * Sets the value of the reservableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndActionTypeU132977S }
     *     
     */
    public void setReservableStatus(QuantityAndActionTypeU132977S value) {
        this.reservableStatus = value;
    }

    /**
     * Gets the value of the legDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredDateTimeInformationType129285S }
     * 
     * 
     */
    public List<StructuredDateTimeInformationType129285S> getLegDateTime() {
        if (legDateTime == null) {
            legDateTime = new ArrayList<StructuredDateTimeInformationType129285S>();
        }
        return this.legDateTime;
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
     * Gets the value of the legReference property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberTypeU }
     *     
     */
    public ItemNumberTypeU getLegReference() {
        return legReference;
    }

    /**
     * Sets the value of the legReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberTypeU }
     *     
     */
    public void setLegReference(ItemNumberTypeU value) {
        this.legReference = value;
    }

}
