package pri.adam.demo02;

import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * Created by adam on 14-10-18.
 */
public class MyBean {
    @PathParam("username")
    private String username;

    @QueryParam("age")
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
