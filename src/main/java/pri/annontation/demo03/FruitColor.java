package pri.annontation.demo03;

import java.lang.annotation.*;

/**
 * Created by adam on 14-11-22.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
public @interface FruitColor {
    public enum Color{Bule,Red,Green};

    Color value() default Color.Bule;
}
