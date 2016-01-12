
package com.amadeus.xml.tipnrq_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate the number of segment group repetitions.
 * 
 * <p>Java class for SegmentRepetitionControlTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentRepetitionControlTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="segmentControlDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SegmentRepetitionControlDetailsTypeI_193634C" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentRepetitionControlTypeI", propOrder = {
    "segmentControlDetails"
})
public class SegmentRepetitionControlTypeI {

    protected List<SegmentRepetitionControlDetailsTypeI193634C> segmentControlDetails;

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
     * {@link SegmentRepetitionControlDetailsTypeI193634C }
     * 
     * 
     */
    public List<SegmentRepetitionControlDetailsTypeI193634C> getSegmentControlDetails() {
        if (segmentControlDetails == null) {
            segmentControlDetails = new ArrayList<SegmentRepetitionControlDetailsTypeI193634C>();
        }
        return this.segmentControlDetails;
    }

}
