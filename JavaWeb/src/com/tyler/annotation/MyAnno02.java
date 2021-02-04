package com.tyler.annotation;

import java.lang.annotation.*;

@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnno02 {
}
