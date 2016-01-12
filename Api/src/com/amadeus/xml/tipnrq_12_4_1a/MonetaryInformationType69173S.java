
package com.amadeus.xml.tipnrq_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey monetary amounts, rates and percentages.
 * 
 * <p>Java class for MonetaryInformationType_69173S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationType_69173S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monetaryDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}MonetaryInformationDetailsType_108001C" maxOccurs="20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationType_69173S", propOrder = {
    "monetaryDetails"
})
public class MonetaryInformationType69173S {

    @XmlElement(required = true)
    protected List<MonetaryInformationDetailsType108001C> monetaryDetails;

    /**
     * Gets the value of the monetaryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationDetailsType108001C }
     * 
     * 
     */
    public List<MonetaryInformationDetailsType108001C> getMonetaryDetails() {
        if (monetaryDetails == null) {
            monetaryDetails = new ArrayList<MonetaryInformationDetailsType108001C>();
        }
        return this.monetaryDetails;
    }

}
