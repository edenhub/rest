package pri.adam.demo05;

import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by adam on 14-10-28.
 */
public class Test01 {

    @Test
    public void test01(){
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://localhost:8080/rest/webapi/").path("myForm");

        Form form = new Form();
        form.param("name","adam");

        Response response = webTarget.request().buildPost(
                Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED_TYPE)).invoke();
        System.out.println(response.getEntity().toString());
        response.close();
    }
}
