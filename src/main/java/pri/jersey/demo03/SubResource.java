package pri.jersey.demo03;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by jersey on 14-10-18.
 */
@Singleton
@Path("/subres")
public class SubResource {

    @GET
    @Path("/sub1")
    @Produces("application/json")
    public String mySub1(){
        return "name = jersey";
    }

//    @GET
    @Path("context")
    public MySub mySub2(){
        return new MySub();
    }
}
