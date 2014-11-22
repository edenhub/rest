package pri.jersey.demo02;

import javax.ws.rs.*;

/**
 * Created by jersey on 14-10-18.
 */

@Path("params")
public class Params {

    @GET
    @Produces
    public void testParams(
      @QueryParam("name")@DefaultValue("jersey")String name,
      @QueryParam("age")@DefaultValue("23")int age,
      @QueryParam("myParam")@DefaultValue("my")MyParam myParam

    ){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("MyParam : "+myParam);
    }




}
