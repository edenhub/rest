package TestAnnontation.demo03;

import org.junit.Test;
import pri.annontation.demo03.*;

import java.lang.reflect.Field;

/**
 * Created by adam on 14-11-22.
 */
public class TestApple {

    @Test
    public void test01() throws IllegalAccessException, InstantiationException {
        Class clazz = Apple.class;
        Field[] fields = clazz.getDeclaredFields();
        Apple apple = (Apple) clazz.newInstance();

        for(Field field : fields){
            if (field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = field.getAnnotation(FruitName.class);
                apple.setFruitName(fruitName.value());
            }else if (field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                apple.setColor(fruitColor.value());
            }else if (field.isAnnotationPresent(FruitProivter.class)){
                FruitProivter fruitProivter = field.getAnnotation(FruitProivter.class);
                Proviter proviter = Proviter.class.newInstance();
                proviter.setId(fruitProivter.id());
                proviter.setName(fruitProivter.proviterName());
                proviter.setCompany(fruitProivter.comparyName());

                apple.setProviter(proviter);
            }
        }

        System.out.println(apple.toString());

        apple = null;

    }
}
