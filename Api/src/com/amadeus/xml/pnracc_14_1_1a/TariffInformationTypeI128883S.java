
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify tariff details relating to a service or product.
 * 
 * <p>Java class for TariffInformationTypeI_128883S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInformationTypeI_128883S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tariffInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TariffInformationDetailsTypeI_187784C" minOccurs="0"/>
 *         &lt;element name="chargeDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AssociatedChargesInformationTypeI_187653C" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInformationTypeI_128883S", propOrder = {
    "tariffInfo",
    "chargeDetails"
})
public class TariffInformationTypeI128883S {

    protected TariffInformationDetailsTypeI187784C tariffInfo;
    protected List<AssociatedChargesInformationTypeI187653C> chargeDetails;

    /**
     * Gets the value of the tariffInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationDetailsTypeI187784C }
     *     
     */
    public TariffInformationDetailsTypeI187784C getTariffInfo() {
        return tariffInfo;
    }

    /**
     * Sets the value of the tariffInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationDetailsTypeI187784C }
     *     
     */
    public void setTariffInfo(TariffInformationDetailsTypeI187784C value) {
        this.tariffInfo = value;
    }

    /**
     * Gets the value of the chargeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedChargesInformationTypeI187653C }
     * 
     * 
     */
    public List<AssociatedChargesInformationTypeI187653C> getChargeDetails() {
        if (chargeDetails == null) {
            chargeDetails = new ArrayList<AssociatedChargesInformationTypeI187653C>();
        }
        return this.chargeDetails;
    }

}
