
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonetaryAndCabinInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryAndCabinInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moneyAndCabinInfo" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}MonetaryAndCabinInformationDetailsType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryAndCabinInformationType", propOrder = {
    "moneyAndCabinInfo"
})
public class MonetaryAndCabinInformationType {

    protected List<MonetaryAndCabinInformationDetailsType> moneyAndCabinInfo;

    /**
     * Gets the value of the moneyAndCabinInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moneyAndCabinInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoneyAndCabinInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryAndCabinInformationDetailsType }
     * 
     * 
     */
    public List<MonetaryAndCabinInformationDetailsType> getMoneyAndCabinInfo() {
        if (moneyAndCabinInfo == null) {
            moneyAndCabinInfo = new ArrayList<MonetaryAndCabinInformationDetailsType>();
        }
        return this.moneyAndCabinInfo;
    }

}
