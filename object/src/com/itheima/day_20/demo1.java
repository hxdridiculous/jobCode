package com.itheima.day_20;

public @interface demo1 {
    int value() default 10;
    String name();
    Class demo() default demo2.class;
    Season season() default Season.SPRING;
    demo2 demo2() default @demo2;
    int [] arr() default {1,2,3};
    Season[] arr2() default {Season.SPRING,Season.SUMMER};


}
