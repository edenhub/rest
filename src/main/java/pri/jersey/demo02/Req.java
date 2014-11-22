package pri.jersey.demo02;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

/**
 * Created by jersey on 14-10-18.
 */
@Path("req")
public class Req {

    @GET
    public void testRequest(@Context HttpServletRequest request){
        System.out.println(request.getContextPath());

    }
}
