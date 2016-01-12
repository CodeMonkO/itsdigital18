
package com.amadeus.xml.tipnrq_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate the number of segment group repetitions.
 * 
 * <p>Java class for SegmentRepetitionControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentRepetitionControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="segmentControlDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SegmentRepetitionControlDetailsType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentRepetitionControlType", propOrder = {
    "segmentControlDetails"
})
public class SegmentRepetitionControlType {

    protected List<SegmentRepetitionControlDetailsType> segmentControlDetails;

    /**
     * Gets the value of the segmentControlDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentControlDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentControlDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentRepetitionControlDetailsType }
     * 
     * 
     */
    public List<SegmentRepetitionControlDetailsType> getSegmentControlDetails() {
        if (segmentControlDetails == null) {
            segmentControlDetails = new ArrayList<SegmentRepetitionControlDetailsType>();
        }
        return this.segmentControlDetails;
    }

}
