
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Convey OND informations
 * 
 * <p>Java class for ONDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="yieldInformations" type="{http://xml.amadeus.com/PNRACC_14_1_1A}MonetaryInformationType"/>
 *         &lt;element name="classCombinaison" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ProductInformationTypeI_132967S" minOccurs="0"/>
 *         &lt;element name="ondyield" type="{http://xml.amadeus.com/PNRACC_14_1_1A}OriginAndDestinationDetailsTypeI_132966S"/>
 *         &lt;element name="tripOnD" type="{http://xml.amadeus.com/PNRACC_14_1_1A}OriginAndDestinationDetailsTypeI_132966S" minOccurs="0"/>
 *         &lt;element name="pointOfCommencement" type="{http://xml.amadeus.com/PNRACC_14_1_1A}PointOfCommencementTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONDType", propOrder = {
    "yieldInformations",
    "classCombinaison",
    "ondyield",
    "tripOnD",
    "pointOfCommencement"
})
public class ONDType {

    @XmlElement(required = true)
    protected MonetaryInformationType yieldInformations;
    protected ProductInformationTypeI132967S classCombinaison;
    @XmlElement(required = true)
    protected OriginAndDestinationDetailsTypeI132966S ondyield;
    protected OriginAndDestinationDetailsTypeI132966S tripOnD;
    protected PointOfCommencementTypeI pointOfCommencement;

    /**
     * Gets the value of the yieldInformations property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType }
     *     
     */
    public MonetaryInformationType getYieldInformations() {
        return yieldInformations;
    }

    /**
     * Sets the value of the yieldInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType }
     *     
     */
    public void setYieldInformations(MonetaryInformationType value) {
        this.yieldInformations = value;
    }

    /**
     * Gets the value of the classCombinaison property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationTypeI132967S }
     *     
     */
    public ProductInformationTypeI132967S getClassCombinaison() {
        return classCombinaison;
    }

    /**
     * Sets the value of the classCombinaison property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationTypeI132967S }
     *     
     */
    public void setClassCombinaison(ProductInformationTypeI132967S value) {
        this.classCombinaison = value;
    }

    /**
     * Gets the value of the ondyield property.
     * 
     * @return
     *     possible object is
     *     {@link OriginAndDestinationDetailsTypeI132966S }
     *     
     */
    public OriginAndDestinationDetailsTypeI132966S getOndyield() {
        return ondyield;
    }

    /**
     * Sets the value of the ondyield property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginAndDestinationDetailsTypeI132966S }
     *     
     */
    public void setOndyield(OriginAndDestinationDetailsTypeI132966S value) {
        this.ondyield = value;
    }

    /**
     * Gets the value of the tripOnD property.
     * 
     * @return
     *     possible object is
     *     {@link OriginAndDestinationDetailsTypeI132966S }
     *     
     */
    public OriginAndDestinationDetailsTypeI132966S getTripOnD() {
        return tripOnD;
    }

    /**
     * Sets the value of the tripOnD property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginAndDestinationDetailsTypeI132966S }
     *     
     */
    public void setTripOnD(OriginAndDestinationDetailsTypeI132966S value) {
        this.tripOnD = value;
    }

    /**
     * Gets the value of the pointOfCommencement property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfCommencementTypeI }
     *     
     */
    public PointOfCommencementTypeI getPointOfCommencement() {
        return pointOfCommencement;
    }

    /**
     * Sets the value of the pointOfCommencement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfCommencementTypeI }
     *     
     */
    public void setPointOfCommencement(PointOfCommencementTypeI value) {
        this.pointOfCommencement = value;
    }

}
