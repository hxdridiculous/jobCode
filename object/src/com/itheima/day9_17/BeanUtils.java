package com.itheima.day9_17;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {
    public static void main(String[] args) throws Exception {
        Map<Object,Object> map = new HashMap<>();
        Student2 fill = (Student2) fill(map, "tom19男");
        fill.setName("张三");
        fill.setAge(19);
        fill.setSex("男");
        System.out.println(fill);
    }
    /*
        把map结合中的键值对内容.赋值到obj对象中.
       例如:第一个参数 map中的值是:
              name:tom
              age:19
              sex:男
          传入第二个参数.Student stu

        最后打印stu的值.{ name:tom, age:19, sex:男}
    */
    public static Object fill(Map<Object, Object> map, Object obj) throws Exception {
        // 方法体由大家完成( 使用反射)
        Class<?> aClass = Class.forName("com.itheima.day9_17.Student2");
        Object o = aClass.getConstructor().newInstance();
        map.put("tom19男",o);
        return map.get(obj);
    }

}
