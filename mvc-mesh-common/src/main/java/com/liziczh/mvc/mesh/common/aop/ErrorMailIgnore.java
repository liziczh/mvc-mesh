package com.liziczh.mvc.mesh.common.aop;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ErrorMailIgnore {
    String desc() default "";
}
