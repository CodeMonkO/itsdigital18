
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide free form or coded long text information
 * 
 * <p>Java class for LongFreeTextType_128687S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LongFreeTextType_128687S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freetextDetail" type="{http://xml.amadeus.com/PNRACC_14_1_1A}FreeTextQualificationType_187488C" minOccurs="0"/>
 *         &lt;element name="longFreetext" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To199" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LongFreeTextType_128687S", propOrder = {
    "freetextDetail",
    "longFreetext"
})
public class LongFreeTextType128687S {

    protected FreeTextQualificationType187488C freetextDetail;
    protected String longFreetext;

    /**
     * Gets the value of the freetextDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextQualificationType187488C }
     *     
     */
    public FreeTextQualificationType187488C getFreetextDetail() {
        return freetextDetail;
    }

    /**
     * Sets the value of the freetextDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextQualificationType187488C }
     *     
     */
    public void setFreetextDetail(FreeTextQualificationType187488C value) {
        this.freetextDetail = value;
    }

    /**
     * Gets the value of the longFreetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongFreetext() {
        return longFreetext;
    }

    /**
     * Sets the value of the longFreetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongFreetext(String value) {
        this.longFreetext = value;
    }

}
