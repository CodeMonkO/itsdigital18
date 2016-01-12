
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To perform boolean operations
 * 
 * <p>Java class for BooleanExpressionRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BooleanExpressionRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="booleanExpression" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ArithmeticEvaluationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BooleanExpressionRuleType", propOrder = {
    "booleanExpression"
})
public class BooleanExpressionRuleType {

    @XmlElement(required = true)
    protected ArithmeticEvaluationType booleanExpression;

    /**
     * Gets the value of the booleanExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ArithmeticEvaluationType }
     *     
     */
    public ArithmeticEvaluationType getBooleanExpression() {
        return booleanExpression;
    }

    /**
     * Sets the value of the booleanExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArithmeticEvaluationType }
     *     
     */
    public void setBooleanExpression(ArithmeticEvaluationType value) {
        this.booleanExpression = value;
    }

}
