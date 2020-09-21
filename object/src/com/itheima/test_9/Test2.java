package com.itheima.test_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/***
 * 请使用HashMap集合保存街道两旁的店铺名称;使用门牌号作为键,店铺名作为值,然后使用**三种方式**遍历输出;
 * 信息如下:
 * 101,阿三面馆
 * 102,阿四粥馆
 * 103,阿五米馆
 * 104,阿六快递
 * **要求:**
 * 1:键是整数,值是字符串;
 * 2:输出的信息使用"--"链接
 */
public class Test2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(101,"阿三面馆");
        hashMap.put(102,"阿四粥馆");
        hashMap.put(103,"阿五米馆");
        hashMap.put(104,"阿六快递");
        Map<String, String> map= Map.of("111","2222","3333","4444");
        System.out.println(map);
        hashMap.forEach((integer, s)->System.out.println(integer+"--"+s));
        /*(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer+"--"+s);
            }
        });*/
        Set<Integer> integers = hashMap.keySet();
        for (Integer integer : integers) {
            System.out.println(integer+"---"+hashMap.get(integer));
        }
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }
    }
}
