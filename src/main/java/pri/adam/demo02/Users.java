package pri.adam.demo02;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by adam on 14-10-18.
 */

@Path("users/{username}")
public class Users {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getUser(@PathParam("username")@DefaultValue("adam")String username){
        return "Return user : "+username;
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String getUserByPut(@PathParam("username")@DefaultValue("adams")String username){
        return "Return user : "+username;
    }
}
