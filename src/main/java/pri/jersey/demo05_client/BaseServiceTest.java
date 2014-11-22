package pri.jersey.demo05_client;

import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Scanner;

/**
 * Created by jersey on 14-11-9.
 */
public class BaseServiceTest {
    public static final String url = "http://localhost:8080/rest/webapi/";
    public static final String rootPath = "clientBase/";

    @Test
    public void testBasePath(){
        Client client = ClientBuilder.newClient();
        String response = client.target(url).path(rootPath+"base")
                .request().buildGet().invoke(String.class);
        System.out.println(response);
    }

    @Test
    public void testBaseQueryParm(){
        Client client = ClientBuilder.newClient();
        String response = client.target(url).path(rootPath+"baseQueryParam")
                .queryParam("name","jersey")
                .request().buildGet().invoke(String.class);
        System.out.println(response);
    }

    @Test
    public void testFile() throws URISyntaxException {
        Client client = ClientBuilder.newClient();
        Response response = client.target(url).path(rootPath + "baseFile")
                .request().buildPut(
                        Entity.entity(new File(BaseService.class.getResource("data.txt").toURI().getPath())
                                , MediaType.APPLICATION_FORM_URLENCODED_TYPE))
                .invoke();
        String result = response.readEntity(String.class);
        System.out.println(result);

    }

    @Test
    public void testBaseForm() throws FileNotFoundException {
        Client client = ClientBuilder.newClient();
        Form form = new Form().param("name","jersey");
        Response response = client.target(url).path(rootPath+"baseForm")
                .request().buildPost(
                        Entity.entity(form,
                                MediaType.APPLICATION_FORM_URLENCODED_TYPE)
                ).invoke();
//        System.out.println(response.readEntity(String.class));
        File file = response.readEntity(File.class);
        System.out.println(file.getName());
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());
    }
}
