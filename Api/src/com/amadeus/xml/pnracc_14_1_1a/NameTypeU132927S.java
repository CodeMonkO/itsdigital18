
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the name of a person or entity.
 * 
 * <p>Java class for NameTypeU_132927S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameTypeU_132927S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NameInformationTypeU_192840C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameTypeU_132927S", propOrder = {
    "nameInformation"
})
public class NameTypeU132927S {

    @XmlElement(required = true)
    protected NameInformationTypeU192840C nameInformation;

    /**
     * Gets the value of the nameInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NameInformationTypeU192840C }
     *     
     */
    public NameInformationTypeU192840C getNameInformation() {
        return nameInformation;
    }

    /**
     * Sets the value of the nameInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameInformationTypeU192840C }
     *     
     */
    public void setNameInformation(NameInformationTypeU192840C value) {
        this.nameInformation = value;
    }

}
