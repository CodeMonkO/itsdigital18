
package com.amadeus.xml.pnrspl_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Split specified elements out of Parent PNR to new Associated PNR.
 * 
 * <p>Java class for SplitPNRType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitPNRType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passenger" type="{http://xml.amadeus.com/PNRSPL_14_1_1A}SplitPNRDetailsType"/>
 *         &lt;element name="otherElement" type="{http://xml.amadeus.com/PNRSPL_14_1_1A}SplitPNRDetailsType_6435C" maxOccurs="999" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitPNRType", propOrder = {
    "passenger",
    "otherElement"
})
public class SplitPNRType {

    @XmlElement(required = true)
    protected SplitPNRDetailsType passenger;
    protected List<SplitPNRDetailsType6435C> otherElement;

    /**
     * Gets the value of the passenger property.
     * 
     * @return
     *     possible object is
     *     {@link SplitPNRDetailsType }
     *     
     */
    public SplitPNRDetailsType getPassenger() {
        return passenger;
    }

    /**
     * Sets the value of the passenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitPNRDetailsType }
     *     
     */
    public void setPassenger(SplitPNRDetailsType value) {
        this.passenger = value;
    }

    /**
     * Gets the value of the otherElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitPNRDetailsType6435C }
     * 
     * 
     */
    public List<SplitPNRDetailsType6435C> getOtherElement() {
        if (otherElement == null) {
            otherElement = new ArrayList<SplitPNRDetailsType6435C>();
        }
        return this.otherElement;
    }

}
