
package com.amadeus.xml.fmptbq_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify connection city and airline designator.
 * 
 * <p>Java class for ConnectionTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ConnectionDetailsTypeI" maxOccurs="17"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionTypeI", propOrder = {
    "connectionDetails"
})
public class ConnectionTypeI {

    @XmlElement(required = true)
    protected List<ConnectionDetailsTypeI> connectionDetails;

    /**
     * Gets the value of the connectionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionDetailsTypeI }
     * 
     * 
     */
    public List<ConnectionDetailsTypeI> getConnectionDetails() {
        if (connectionDetails == null) {
            connectionDetails = new ArrayList<ConnectionDetailsTypeI>();
        }
        return this.connectionDetails;
    }

}
