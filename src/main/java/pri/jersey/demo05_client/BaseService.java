package pri.jersey.demo05_client;

import javax.ws.rs.*;
import java.io.File;

/**
 * Created by jersey on 14-11-9.
 */
@Path("clientBase")
public class BaseService {

    @GET
    @Path("base")
    public String basePath(){
        return "My Base Path";
    }

    @GET
    @Path("baseQueryParam")
    public String baseQueryParam(@QueryParam("name")String name){
        return "My Base Path : "+name;
    }

//    cheaper8
    @PUT
    @Path("baseFile")
    public String baseFile(@BeanParam()File file){
        System.out.println(file.getName());
        return "done";
    }

//    cheaper8
    @POST
    @Path("baseForm")
    public File baseForm(@FormParam("name")String fileName){
        File file = new File(BaseService.class.getResource("data.txt").getPath());
        System.out.println("return file");

        return file;
    }
}
