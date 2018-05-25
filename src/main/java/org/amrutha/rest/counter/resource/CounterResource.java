package org.amrutha.rest.counter.resource;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/serviceLogger")
public class CounterResource {
	static int counter;
	@GET
	@Produces(MediaType.APPLICATION_JSON)

	public String getMessages() {
		
		String result = "{" + "\n" + 
						" timestamp : " + new Date() + "\n" + 
						" calls : " + counter + "\n" + 
					    "}";
		counter++;
		return result;
	} 
}