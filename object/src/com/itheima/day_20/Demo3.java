package com.itheima.day_20;

import org.junit.After;
import org.junit.Before;

public class Demo3 extends Person{
    @Before
    public void ss(){
        System.out.println("nihao");
    }
    @org.junit.Test
    public void ss2(){
        System.out.println("nihao2");
    }
    @After
    public void ss3(){
        System.out.println("nihao3");
    }
}
