
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information concerning an airline flight
 * 
 * <p>Java class for AdditionalProductDetailsTypeI_132895S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductDetailsTypeI_132895S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AdditionalProductTypeI_192793C" minOccurs="0"/>
 *         &lt;element name="departureInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StationInformationTypeI" minOccurs="0"/>
 *         &lt;element name="arrivalInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StationInformationTypeI_192797C" minOccurs="0"/>
 *         &lt;element name="timeDetail" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TravellerTimeDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="facilities" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ProductFacilitiesTypeI_192796C" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductDetailsTypeI_132895S", propOrder = {
    "productDetails",
    "departureInformation",
    "arrivalInformation",
    "timeDetail",
    "facilities"
})
public class AdditionalProductDetailsTypeI132895S {

    protected AdditionalProductTypeI192793C productDetails;
    protected StationInformationTypeI departureInformation;
    protected StationInformationTypeI192797C arrivalInformation;
    protected TravellerTimeDetailsTypeI timeDetail;
    protected List<ProductFacilitiesTypeI192796C> facilities;

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductTypeI192793C }
     *     
     */
    public AdditionalProductTypeI192793C getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductTypeI192793C }
     *     
     */
    public void setProductDetails(AdditionalProductTypeI192793C value) {
        this.productDetails = value;
    }

    /**
     * Gets the value of the departureInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StationInformationTypeI }
     *     
     */
    public StationInformationTypeI getDepartureInformation() {
        return departureInformation;
    }

    /**
     * Sets the value of the departureInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationInformationTypeI }
     *     
     */
    public void setDepartureInformation(StationInformationTypeI value) {
        this.departureInformation = value;
    }

    /**
     * Gets the value of the arrivalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StationInformationTypeI192797C }
     *     
     */
    public StationInformationTypeI192797C getArrivalInformation() {
        return arrivalInformation;
    }

    /**
     * Sets the value of the arrivalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationInformationTypeI192797C }
     *     
     */
    public void setArrivalInformation(StationInformationTypeI192797C value) {
        this.arrivalInformation = value;
    }

    /**
     * Gets the value of the timeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerTimeDetailsTypeI }
     *     
     */
    public TravellerTimeDetailsTypeI getTimeDetail() {
        return timeDetail;
    }

    /**
     * Sets the value of the timeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerTimeDetailsTypeI }
     *     
     */
    public void setTimeDetail(TravellerTimeDetailsTypeI value) {
        this.timeDetail = value;
    }

    /**
     * Gets the value of the facilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFacilitiesTypeI192796C }
     * 
     * 
     */
    public List<ProductFacilitiesTypeI192796C> getFacilities() {
        if (facilities == null) {
            facilities = new ArrayList<ProductFacilitiesTypeI192796C>();
        }
        return this.facilities;
    }

}
