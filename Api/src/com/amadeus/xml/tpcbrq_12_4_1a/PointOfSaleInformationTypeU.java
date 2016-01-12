
package com.amadeus.xml.tpcbrq_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify point of sale information by party identification or location identification.
 * 
 * <p>Java class for PointOfSaleInformationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfSaleInformationTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cityDetail" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}LocationTypeU" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfSaleInformationTypeU", propOrder = {
    "cityDetail"
})
public class PointOfSaleInformationTypeU {

    protected List<LocationTypeU> cityDetail;

    /**
     * Gets the value of the cityDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationTypeU }
     * 
     * 
     */
    public List<LocationTypeU> getCityDetail() {
        if (cityDetail == null) {
            cityDetail = new ArrayList<LocationTypeU>();
        }
        return this.cityDetail;
    }

}
