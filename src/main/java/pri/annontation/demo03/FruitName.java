package pri.annontation.demo03;

import java.lang.annotation.*;

/**
 * Created by adam on 14-11-22.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.FIELD})
public @interface FruitName {
    String value() default "";
}
