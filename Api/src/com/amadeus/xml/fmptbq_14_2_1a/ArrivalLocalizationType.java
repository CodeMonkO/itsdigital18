
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information of the requested arrival location
 * 
 * <p>Java class for ArrivalLocalizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrivalLocalizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrivalPointDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ArrivalLocationDetailsType" minOccurs="0"/>
 *         &lt;element name="arrivalMultiCity" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}MultiCityOptionType" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="attributeDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}CodedAttributeInformationType_139508C" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivalLocalizationType", propOrder = {
    "arrivalPointDetails",
    "arrivalMultiCity",
    "attributeDetails"
})
public class ArrivalLocalizationType {

    protected ArrivalLocationDetailsType arrivalPointDetails;
    protected List<MultiCityOptionType> arrivalMultiCity;
    protected List<CodedAttributeInformationType139508C> attributeDetails;

    /**
     * Gets the value of the arrivalPointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalLocationDetailsType }
     *     
     */
    public ArrivalLocationDetailsType getArrivalPointDetails() {
        return arrivalPointDetails;
    }

    /**
     * Sets the value of the arrivalPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalLocationDetailsType }
     *     
     */
    public void setArrivalPointDetails(ArrivalLocationDetailsType value) {
        this.arrivalPointDetails = value;
    }

    /**
     * Gets the value of the arrivalMultiCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrivalMultiCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalMultiCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiCityOptionType }
     * 
     * 
     */
    public List<MultiCityOptionType> getArrivalMultiCity() {
        if (arrivalMultiCity == null) {
            arrivalMultiCity = new ArrayList<MultiCityOptionType>();
        }
        return this.arrivalMultiCity;
    }

    /**
     * Gets the value of the attributeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedAttributeInformationType139508C }
     * 
     * 
     */
    public List<CodedAttributeInformationType139508C> getAttributeDetails() {
        if (attributeDetails == null) {
            attributeDetails = new ArrayList<CodedAttributeInformationType139508C>();
        }
        return this.attributeDetails;
    }

}
