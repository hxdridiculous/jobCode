package com.itheima.test_9;

import java.security.Key;
import java.util.*;
import java.util.function.BiConsumer;

/***
 * 请使用TreeMap集合保存劳模信息,要求以劳模对象为键,家庭住址为值,并按照劳模的年龄从大到小排序后输出;
 * 信息如下:
 * 18岁的张三,北京
 * 20岁的李四,上海
 * 35岁的王五,天津
 * 21岁的赵六,北京
 * 19岁的田七,上海
 * **要求:**
 * 1:劳模类中有姓名和年龄两个属性;
 * 2:添加上述信息后,使用代码删除张三的信息
 * 3:添加上述信息后,使用代码修改李四的家庭住址为郑州
 * 4:使用至少两种方式遍历集合中的信息并输出;
 */
public class Test3 {
    public static void main(String[] args) {
        TreeMap<LaborMould, String> treeMaps = new TreeMap<>(new Comparator<LaborMould>() {
            @Override
            public int compare(LaborMould o1, LaborMould o2) {
                int i = o1.getAge() - o2.getAge();
                return i==0?o1.getName().compareTo(o2.getName()):i;
            }
        });
        LaborMould laborMould1 = new LaborMould("张三", 18);
        LaborMould laborMould2 = new LaborMould("李四", 20);
        LaborMould laborMould3 = new LaborMould("王五", 35);
        LaborMould laborMould4 = new LaborMould("赵六", 21);
        LaborMould laborMould5 = new LaborMould("田七", 19);
        treeMaps.put(laborMould1,"北京");
        treeMaps.put(laborMould2,"上海");
        treeMaps.put(laborMould3,"天津");
        treeMaps.put(laborMould4,"北京");
        treeMaps.put(laborMould5,"上海");
        treeMaps.remove(laborMould1);
        treeMaps.put(laborMould2,"李四");
        //方式1遍历   键找值
        Set<LaborMould> set = treeMaps.keySet();
        for (LaborMould laborMould : set) {
            System.out.println(laborMould+"--"+treeMaps.get(laborMould));
        }
        //方式3遍历   接口中默认的forEach方法配合lambda
        treeMaps.forEach(new BiConsumer<LaborMould, String>() {
            @Override
            public void accept(LaborMould laborMould, String s) {
                System.out.println(laborMould+"--"+s);
            }
        });
        //方式2遍历   键值对对象
        Set<Map.Entry<LaborMould, String>> en = treeMaps.entrySet();
        for (Map.Entry<LaborMould, String> e : en) {
            System.out.println(e.getKey()+"---"+e.getValue());

        }

    }


}
