/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeepGoing.RestServices.Dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author arunmozhi
 */
@XmlRootElement
public class CabbiePostsDto {

    private String _sourceLocation;
    private String _destinationLocation;
    private String _travelDate;

    public String getSourceLocation(){
        return _sourceLocation;
    }

    public void setSourceLocation(String value){
        _sourceLocation=value;
    }


    public String getDestinationLocation(){
        return _destinationLocation;
    }

    public void setDestinationLocation(String value){
        _destinationLocation=value;
    }


    public String getTravelDate(){
        return _travelDate;
    }

    public void setTravelDate(String value){
        _travelDate=value;
    }
}
