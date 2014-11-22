package pri.annontation.demo03;

import java.lang.annotation.*;

/**
 * Created by adam on 14-11-22.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
@Documented
public @interface FruitProivter {

    String id() default "";
    String proviterName() default "";
    String comparyName() default "";
}
