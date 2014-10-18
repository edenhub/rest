package pri.adam.demo03;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * Created by adam on 14-10-18.
 */
@Singleton
public class MySub {

    @GET
    @Produces("text/plain")
    public String def(@Context UriInfo uriInfo){
        System.out.println(uriInfo.getAbsolutePath().toString());
        return "in my default ";
    }

    @Path("inMySub")
    @GET
    @Produces("text/plain")
    public String mySub1(@Context UriInfo uriInfo){
        System.out.println(uriInfo.getBaseUri().toString());

        return "in my Sub 1";
    }

}
