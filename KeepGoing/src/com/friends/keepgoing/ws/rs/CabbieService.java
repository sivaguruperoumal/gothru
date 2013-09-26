package com.friends.keepgoing.ws.rs;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.friends.keepgoing.dto.PostAdDto;


@Path("/cabbie")
public class CabbieService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/postad")
	public String postAd()
	{
		return "Hello";
		
	}
}
