package edu.matc.restdemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    @Path("{name}")
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public Response getMessage(@PathParam("name") String name) {
        String output = "Hello World -- " + name;
    //        Not just a string... can bring in other classes/DAOs...

        return Response.status(200).entity(output).build();
    }
}

