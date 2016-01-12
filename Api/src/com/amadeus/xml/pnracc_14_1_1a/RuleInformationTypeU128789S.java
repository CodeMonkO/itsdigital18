
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify rule information and rule status.
 * 
 * <p>Java class for RuleInformationTypeU_128789S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInformationTypeU_128789S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ruleDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}RuleDetailsTypeU_187647C" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="ruleText" type="{http://xml.amadeus.com/PNRACC_14_1_1A}RuleTextTypeU" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInformationTypeU_128789S", propOrder = {
    "ruleDetails",
    "ruleText"
})
public class RuleInformationTypeU128789S {

    protected List<RuleDetailsTypeU187647C> ruleDetails;
    protected List<RuleTextTypeU> ruleText;

    /**
     * Gets the value of the ruleDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleDetailsTypeU187647C }
     * 
     * 
     */
    public List<RuleDetailsTypeU187647C> getRuleDetails() {
        if (ruleDetails == null) {
            ruleDetails = new ArrayList<RuleDetailsTypeU187647C>();
        }
        return this.ruleDetails;
    }

    /**
     * Gets the value of the ruleText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleTextTypeU }
     * 
     * 
     */
    public List<RuleTextTypeU> getRuleText() {
        if (ruleText == null) {
            ruleText = new ArrayList<RuleTextTypeU>();
        }
        return this.ruleText;
    }

}
