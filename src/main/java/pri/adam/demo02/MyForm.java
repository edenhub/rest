package pri.adam.demo02;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * Created by adam on 14-10-18.
 */

@Path("myForm")
public class MyForm {

    @POST
    public void post(@FormParam("name")String name,@Context UriInfo uriInfo){
        System.out.println(uriInfo.getAbsolutePath().toString());
        System.out.println("name : "+name);
    }
}
