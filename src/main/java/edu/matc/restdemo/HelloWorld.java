package edu.matc.restdemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/greetings")
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    @Path("{name}")
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/html")
    public Response getMessage(@PathParam("name") String name) {
        // Return a simple message

        String output = "Hello World -- " + name;
        String htmlEx = "<html><body><h1>" + output + "</h1></body></html>";
        return Response.status(200).entity(htmlEx).build();
    }
}

