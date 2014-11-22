package pri.jersey.demo02;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by jersey on 14-10-18.
 */

@Path("users/{username}")
public class Users {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getUser(@PathParam("username")@DefaultValue("jersey")String username){
        return "Return user : "+username;
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String getUserByPut(@PathParam("username")@DefaultValue("adams")String username){
        return "Return user : "+username;
    }
}
