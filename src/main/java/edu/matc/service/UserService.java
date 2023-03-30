package edu.matc.service;

import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;
import edu.matc.persistence.UserDao;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/UserService")
public class UserService {
//    UserDao dao = new UserDao();
    GenericDao dao = new GenericDao(User.class);
//    private static final String SUCCESS_RESULT="<result>SUCCESS</result>";
//    private static final String FAILURE_RESULT="<result>FAILURE</result>";

//    GET "/users"
    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsers() {
        return dao.getAll();
    }
//    public Response getMessage() {
//        List<User> resultList = new ArrayList<>();
//        resultList = dao.getAll();
//        return Response.status(200).entity(resultList.toString()).build();
//    }

//    GET "/users/{userid}"
    @GET
    @Path("/users/{userid}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(@PathParam("userid") int userid) {
        return (User) dao.getById(userid);
    }

//    POST "/users"

//    PUT "/users"

//    DELETE "/users/{userid}"



    // The Java method will process HTTP GET requests
//    @GET
//    @Path("{name}")
//    // The Java method will produce content identified by the MIME Media type "text/plain"
//    @Produces("text/html")
//    public Response getMessage(@PathParam("name") String name) {
//        // Return a simple message
//
//        String output = "Hello World -- " + name;
//        String index = "http://localhost:8088/week_9_RESTful_exercise_klienert_war/";
//        String returnIndex = "<p><a href=\"" + index + "\">Home</a></p>";
//
//        String htmlEx = "<html><body><h1>" + output + "</h1>" + returnIndex + "</body></html>";
//    //        Not just a string... can bring in other classes/DAOs...
//
//        return Response.status(200).entity(htmlEx).build();
//    }
}

