package pri.annontation.demo02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by adam on 14-11-22.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR,ElementType.METHOD,ElementType.TYPE})
public @interface ColorType {

    public enum FontClor{Bule,Red,Yellow};

    public String name();
    public String content();

    public FontClor color() default FontClor.Bule;
}
