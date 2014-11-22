package pri.jersey.demo02;

import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by jersey on 14-10-18.
 */

@Path("myBean/{username}")
public class BeanTest {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String testBean(@BeanParam MyBean myBean){
        System.out.println(myBean);
        return "Hewe";
    }
}
