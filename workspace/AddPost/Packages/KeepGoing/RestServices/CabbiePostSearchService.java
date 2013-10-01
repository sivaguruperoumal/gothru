/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeepGoing.RestServices;


import KeepGoing.RestServices.Dto.CabbiePostFilterDto;
import generated.CabbiePostsDto;
import java.util.ArrayList;
import javax.ws.rs.*;

/**
 *
 * @author arunmozhi
 */
public class CabbiePostSearchService {

    private CabbiePostFilterDto _cabbiePostFilterDto=null;
    public CabbiePostSearchService(CabbiePostFilterDto cabbiePostFilterDto)
    {
        _cabbiePostFilterDto =cabbiePostFilterDto;
    }

    @Produces("application/json")
    @Consumes("application/json")
    @GET
    public ArrayList<CabbiePostsDto> getCabbiePosts() {
       ArrayList<CabbiePostsDto> cabbiePosts = new ArrayList<CabbiePostsDto>();
       CabbiePostsDto c =new CabbiePostsDto();
       c.setSourceLocation("Chennai");
       c.setDestinationLocation("Pondy");
       c.setTravelDate("10/10/2013");
       cabbiePosts.add(c);
       CabbiePostsDto c1 =new CabbiePostsDto();
       c1.setSourceLocation("Chennai1");
       c1.setDestinationLocation("Pondy1");
       c1.setTravelDate("11/10/2013");
       cabbiePosts.add(c1);
       return cabbiePosts;
    }

}
