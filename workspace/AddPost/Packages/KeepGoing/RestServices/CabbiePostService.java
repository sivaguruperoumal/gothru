/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeepGoing.RestServices;


import generated.CabbiePostFilterDto;
import generated.CabbiePostsDto;
import java.util.ArrayList;
import javax.ws.rs.*;

/**
 *
 * @author arunmozhi
 */
@Path("CabbiePost")
public class CabbiePostService {

    @Produces("application/json")
    @Consumes("application/json")
    @GET
    public ArrayList<CabbiePostsDto> getCabbiePosts(@QueryParam("cabbiePostFilterDto") CabbiePostFilterDto cabbiePostFilterDto) {
       ArrayList<CabbiePostsDto> cabbiePosts = new ArrayList<CabbiePostsDto>();
       CabbiePostsDto c =new CabbiePostsDto();
       c.setSourceLocation("Chennai");
       c.setDestinationLocation("Pondy");
       c.setTravelDate("10/10/2013");
       cabbiePosts.add(c);
       return cabbiePosts;
    }

//    @Produces("application/json")
//    @Path("/{cabbiePostNo}")
//    @GET
//    public String getCabbiePosts(@PathParam("cabbiePostNo") int cabbiePostNo) {
//        return "Hello "+cabbiePostNo;
//    }
}
