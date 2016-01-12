
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the number of Units required
 * 
 * <p>Java class for NumberOfUnitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfUnitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitNumberDetail" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}NumberOfUnitDetailsType_191580C" maxOccurs="20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfUnitsType", propOrder = {
    "unitNumberDetail"
})
public class NumberOfUnitsType {

    @XmlElement(required = true)
    protected List<NumberOfUnitDetailsType191580C> unitNumberDetail;

    /**
     * Gets the value of the unitNumberDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitNumberDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitNumberDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfUnitDetailsType191580C }
     * 
     * 
     */
    public List<NumberOfUnitDetailsType191580C> getUnitNumberDetail() {
        if (unitNumberDetail == null) {
            unitNumberDetail = new ArrayList<NumberOfUnitDetailsType191580C>();
        }
        return this.unitNumberDetail;
    }

}
