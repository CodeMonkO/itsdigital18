
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information of requested departure
 * 
 * <p>Java class for DepartureLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartureLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departurePoint" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ArrivalLocationDetailsType_120834C" minOccurs="0"/>
 *         &lt;element name="depMultiCity" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}MultiCityOptionType" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="firstPnrSegmentRef" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}PNRSegmentReferenceType" minOccurs="0"/>
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
@XmlType(name = "DepartureLocationType", propOrder = {
    "departurePoint",
    "depMultiCity",
    "firstPnrSegmentRef",
    "attributeDetails"
})
public class DepartureLocationType {

    protected ArrivalLocationDetailsType120834C departurePoint;
    protected List<MultiCityOptionType> depMultiCity;
    protected PNRSegmentReferenceType firstPnrSegmentRef;
    protected List<CodedAttributeInformationType139508C> attributeDetails;

    /**
     * Gets the value of the departurePoint property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalLocationDetailsType120834C }
     *     
     */
    public ArrivalLocationDetailsType120834C getDeparturePoint() {
        return departurePoint;
    }

    /**
     * Sets the value of the departurePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalLocationDetailsType120834C }
     *     
     */
    public void setDeparturePoint(ArrivalLocationDetailsType120834C value) {
        this.departurePoint = value;
    }

    /**
     * Gets the value of the depMultiCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depMultiCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepMultiCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiCityOptionType }
     * 
     * 
     */
    public List<MultiCityOptionType> getDepMultiCity() {
        if (depMultiCity == null) {
            depMultiCity = new ArrayList<MultiCityOptionType>();
        }
        return this.depMultiCity;
    }

    /**
     * Gets the value of the firstPnrSegmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link PNRSegmentReferenceType }
     *     
     */
    public PNRSegmentReferenceType getFirstPnrSegmentRef() {
        return firstPnrSegmentRef;
    }

    /**
     * Sets the value of the firstPnrSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRSegmentReferenceType }
     *     
     */
    public void setFirstPnrSegmentRef(PNRSegmentReferenceType value) {
        this.firstPnrSegmentRef = value;
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
