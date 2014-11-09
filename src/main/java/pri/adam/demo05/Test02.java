package pri.adam.demo05;

import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

/**
 * Created by adam on 14-10-29.
 */
public class Test02 {
    public static final String url = "http://localhost:8080/rest/webapi/";
    public static final String rootPath = "clientLogic";
    public Client client = ClientBuilder.newClient();
//    public WebTarget webTarget = client.target(url).path("clientLogic");

    @Test
    public void test01(){
        String uri = UriBuilder.fromPath(url).toTemplate();
        System.out.println(uri);
    }

    @Test
    public void testAdd(){
        WebTarget webTarget = client.target(url).path(rootPath);
        User user = new User("0001","adam");
        Response response = webTarget.request().buildPost(Entity.entity(user, MediaType.APPLICATION_JSON)).invoke();

        response.close();
    }
}
