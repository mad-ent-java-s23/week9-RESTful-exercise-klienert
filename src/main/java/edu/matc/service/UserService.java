package edu.matc.service;

import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/UserService")
public class UserService {
    GenericDao dao = new GenericDao(User.class);
//    private static final String SUCCESS_RESULT="<result>SUCCESS</result>";
//    private static final String FAILURE_RESULT="<result>FAILURE</result>";

//    GET "/users"
    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMessage() {
        List<User> resultList = new ArrayList<>();
        resultList = dao.getAll();
        return Response.status(200).entity(resultList.toString()).build();
    }

//    GET /users?userid={id}
    @GET
    @Path("/query")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserByID(@QueryParam("userid") int userid) {
        User user = new User();
        user = (User) dao.getById(userid);
        return Response.status(200).entity(user.toString()).build();
    }

//    POST "/users"

//    PUT "/users"

//    DELETE "/users/{userid}"

}

