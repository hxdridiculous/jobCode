package com.itheima.mydemo2.mydemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//该注解的生命周期为运行期
@Retention(RetentionPolicy.RUNTIME)
public @interface Bean {
    String value();
}
