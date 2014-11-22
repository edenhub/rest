package pri.jersey.demo05;

import javax.ws.rs.*;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by jersey on 14-10-29.
 */

@Path("clientLogic")
public class ClientLogic {

    private Map<String,User> users = new Hashtable<>();

    @POST
    @Consumes("application/json")
    public void addUser(User user){
        System.out.println("add");
//        int size = users.size();
//        StringBuffer buffer = new StringBuffer();
//        buffer.append(size+1);
//        User user = new User(buffer.toString(),userName);
        users.put(user.id,user);

        dumpMap();
    }

    @DELETE
    @Path("{id}")
    public void deleteUser(@PathParam("id")String userId){
        System.out.println("delete");
        users.remove(userId);

        dumpMap();
    }

    @PUT
    public void updateUser(User user){
        System.out.println("update");
        users.put(user.id,user);

        dumpMap();
    }

    @GET
    @Path("{id}")
    @Produces({"application/json","application/xml"})
    public User getUser(@PathParam("id")String userId){
        System.out.println("get");

        return users.get(userId);


    }

    @GET
    @Produces({"application/json","application/xml"})
    public Collection<User> getUsers(){
        System.out.println("gets");
        Collection<User> userList = users.values();

        return userList;
    }

    public void dumpMap(){
        for (Map.Entry<String,User> e : users.entrySet()){
            System.out.println(e.getValue());
        }

        System.out.println("***********************************");
    }
}

class User{
    public String id;
    public String name;

    public User(){}

    User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
