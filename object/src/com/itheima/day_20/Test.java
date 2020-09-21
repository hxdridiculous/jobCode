package com.itheima.day_20;

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.TYPE,ElementType.METHOD})
@Inherited
public @interface Test {
}
