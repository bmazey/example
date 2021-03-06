package org.nyu.zoo;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface AnimalProperties {

    String subClassification() default "None";

}
