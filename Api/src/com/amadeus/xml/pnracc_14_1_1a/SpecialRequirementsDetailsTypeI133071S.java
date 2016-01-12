
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify special requests or services information relating to a traveler.
 * 
 * <p>Java class for SpecialRequirementsDetailsTypeI_133071S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDetailsTypeI_133071S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialRequirementsInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SpecialRequirementsTypeDetailsTypeI_193066C"/>
 *         &lt;element name="seatDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SpecialRequirementsDataDetailsTypeI" maxOccurs="999" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDetailsTypeI_133071S", propOrder = {
    "specialRequirementsInfo",
    "seatDetails"
})
public class SpecialRequirementsDetailsTypeI133071S {

    @XmlElement(required = true)
    protected SpecialRequirementsTypeDetailsTypeI193066C specialRequirementsInfo;
    protected List<SpecialRequirementsDataDetailsTypeI> seatDetails;

    /**
     * Gets the value of the specialRequirementsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsTypeDetailsTypeI193066C }
     *     
     */
    public SpecialRequirementsTypeDetailsTypeI193066C getSpecialRequirementsInfo() {
        return specialRequirementsInfo;
    }

    /**
     * Sets the value of the specialRequirementsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsTypeDetailsTypeI193066C }
     *     
     */
    public void setSpecialRequirementsInfo(SpecialRequirementsTypeDetailsTypeI193066C value) {
        this.specialRequirementsInfo = value;
    }

    /**
     * Gets the value of the seatDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialRequirementsDataDetailsTypeI }
     * 
     * 
     */
    public List<SpecialRequirementsDataDetailsTypeI> getSeatDetails() {
        if (seatDetails == null) {
            seatDetails = new ArrayList<SpecialRequirementsDataDetailsTypeI>();
        }
        return this.seatDetails;
    }

}
