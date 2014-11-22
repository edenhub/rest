package pri.jersey.demo02;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;

/**
 * Created by jersey on 14-10-18.
 */
public class MyBean {
    @PathParam("username")
    private String username;

    @FormParam("age")
    @DefaultValue("23")
    private int age;

    @Override
    public String toString() {
        return "MyBean{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
