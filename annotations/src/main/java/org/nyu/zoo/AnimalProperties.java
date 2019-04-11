package org.nyu.zoo;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface AnimalProperties {

    int wings() default 0;
    String classification() default "none";

}
