
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment give the class configuration for a train
 * 
 * <p>Java class for ClassConfigurationDetailsType_132973S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassConfigurationDetailsType_132973S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ClassDetailsType_192907C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassConfigurationDetailsType_132973S", propOrder = {
    "classDetails"
})
public class ClassConfigurationDetailsType132973S {

    @XmlElement(required = true)
    protected ClassDetailsType192907C classDetails;

    /**
     * Gets the value of the classDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ClassDetailsType192907C }
     *     
     */
    public ClassDetailsType192907C getClassDetails() {
        return classDetails;
    }

    /**
     * Sets the value of the classDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassDetailsType192907C }
     *     
     */
    public void setClassDetails(ClassDetailsType192907C value) {
        this.classDetails = value;
    }

}
