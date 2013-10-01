/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeepGoing.RestServices;

import KeepGoing.RestServices.Dto.CabbiePostFilterDto;
import KeepGoing.RestServices.Utility.UriParser;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author arunmozhi
 */
@Path("CabbiePost")
public class CabbiePostService {

    @Context UriInfo uriInfo;

    @Path("/Search")
    public CabbiePostSearchService searchCabbiePosts(@Context Request request, @Context UriInfo ui) {
        UriParser<CabbiePostFilterDto> uriParser = new UriParser<CabbiePostFilterDto>(uriInfo);
        return new CabbiePostSearchService(uriParser.Serialize());
    }

    @Produces("application/json")
    @Path("/{cabbiePostNo}")
    @GET
    public String getCabbiePosts(@PathParam("cabbiePostNo") int cabbiePostNo) {
        return "Hello " + cabbiePostNo;
    }
}
