package pri.adam.demo02;

/**
 * Created by adam on 14-10-18.
 */
public class MyParam{
    public String name;
    public MyParam(String paramName){
        this.name = paramName;
    }

    @Override
    public String toString() {
        return "MyParam{" +
                "name='" + name + '\'' +
                '}';
    }
}
