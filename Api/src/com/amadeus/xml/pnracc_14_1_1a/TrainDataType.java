
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrainDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trainProductInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TrainProductInformationType"/>
 *         &lt;element name="tripDateTime" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_129285S" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="location" type="{http://xml.amadeus.com/PNRACC_14_1_1A}PlaceLocationIdentificationType_129295S" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="railLeg" type="{http://xml.amadeus.com/PNRACC_14_1_1A}RailLegDataType" maxOccurs="6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainDataType", propOrder = {
    "trainProductInfo",
    "tripDateTime",
    "location",
    "railLeg"
})
public class TrainDataType {

    @XmlElement(required = true)
    protected TrainProductInformationType trainProductInfo;
    protected List<StructuredDateTimeInformationType129285S> tripDateTime;
    protected List<PlaceLocationIdentificationType129295S> location;
    protected List<RailLegDataType> railLeg;

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
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceLocationIdentificationType129295S }
     * 
     * 
     */
    public List<PlaceLocationIdentificationType129295S> getLocation() {
        if (location == null) {
            location = new ArrayList<PlaceLocationIdentificationType129295S>();
        }
        return this.location;
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
     * {@link RailLegDataType }
     * 
     * 
     */
    public List<RailLegDataType> getRailLeg() {
        if (railLeg == null) {
            railLeg = new ArrayList<RailLegDataType>();
        }
        return this.railLeg;
    }

}
