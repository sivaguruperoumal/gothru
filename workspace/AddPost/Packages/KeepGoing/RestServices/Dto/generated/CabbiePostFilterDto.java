//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.30 at 04:19:38 PM IST 
//


package generated;

import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cabbiePostFilterDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cabbiePostFilterDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destinationLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="travelDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cabbiePostFilterDto", propOrder = {
    "destinationLocation",
    "sourceLocation",
    "travelDate"
})
        
public class CabbiePostFilterDto {
    public String destinationLocation;
    public String sourceLocation;
    public String travelDate;
//
//    /**
//     * Gets the value of the destinationLocation property.
//     *
//     * @return
//     *     possible object is
//     *     {@link String }
//     *
//     */
//    public String getDestinationLocation() {
//        return destinationLocation;
//    }
//
//    /**
//     * Sets the value of the destinationLocation property.
//     *
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *
//     */
//    public void setDestinationLocation(String value) {
//        this.destinationLocation = value;
//    }
//
//    /**
//     * Gets the value of the sourceLocation property.
//     *
//     * @return
//     *     possible object is
//     *     {@link String }
//     *
//     */
//    public String getSourceLocation() {
//        return sourceLocation;
//    }
//
//    /**
//     * Sets the value of the sourceLocation property.
//     *
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *
//     */
//    public void setSourceLocation(String value) {
//        this.sourceLocation = value;
//    }
//
//    /**
//     * Gets the value of the travelDate property.
//     *
//     * @return
//     *     possible object is
//     *     {@link String }
//     *
//     */
//    public String getTravelDate() {
//        return travelDate;
//    }
//
//    /**
//     * Sets the value of the travelDate property.
//     *
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *
//     */
//    public void setTravelDate(String value) {
//        this.travelDate = value;
//    }

}
