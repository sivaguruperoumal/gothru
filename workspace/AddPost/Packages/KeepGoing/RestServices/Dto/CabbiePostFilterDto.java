/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeepGoing.RestServices.Dto;

import javax.xml.bind.annotation.XmlSchema;

/**
 *
 * @author arunmozhi
 */

public class CabbiePostFilterDto extends FilterDtoBase {

    private String sourceLocation;
    private String destinationLocation;
    private String travelDate;

    public String getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(String value) {
        sourceLocation = value;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String value) {
        destinationLocation = value;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String value) {
        travelDate = value;
    }


}
