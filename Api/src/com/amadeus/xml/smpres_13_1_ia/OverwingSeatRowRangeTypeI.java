
package com.amadeus.xml.smpres_13_1_ia;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the range of rows in the overwing section of an aircraft.
 * 
 * <p>Java class for OverwingSeatRowRangeTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverwingSeatRowRangeTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://xml.amadeus.com/SMPRES_13_1_IA}NumericInteger_Length1To3" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverwingSeatRowRangeTypeI", propOrder = {
    "number"
})
public class OverwingSeatRowRangeTypeI {

    @XmlElement(required = true)
    protected List<BigInteger> number;

    /**
     * Gets the value of the number property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the number property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getNumber() {
        if (number == null) {
            number = new ArrayList<BigInteger>();
        }
        return this.number;
    }

}
