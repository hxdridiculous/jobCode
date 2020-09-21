package com.itheima.day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        /***
         * 请定义一个Collection类型的集合，存储以下字符串：
         * “JavaEE企业级开发指南”，”Oracle高级编程”，”MySQL从入门到精通”，”Java架构师之路”
         * **要求:**
         * 请编程实现以下功能：
         * 使用迭代器遍历所有元素，并打印
         * 使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
         * 使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
         * 如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
         * (注意：以上每个功能都单独写个方法，在main方法中逐个调用测试即可)
         */
        Collection<String> collection = new ArrayList<>();
        collection.add("JavaEE企业级开发指南");
        collection.add("Oracle高级编程");
        collection.add("MySQL从入门到精通");
        collection.add("Java架构师之路");
        get(collection);
        System.out.println("--------------------------------------");
        set(collection);
        System.out.println("--------------------------------------");
        contains(collection);
        System.out.println("--------------------------------------");
        remove(collection);

    }

    private static void get(Collection<String> collection) {
        System.out.println("打印数组是：");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

    }

    private static void set(Collection<String> collection) {
        System.out.println("筛选书名小于10个字符的，并打印");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.length() < 10) {
                System.out.println(s);
            }
        }
    }

    private static void contains(Collection<String> collection) {
        System.out.println("包含“Java”的，并打印");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.contains("Java")) {
                System.out.println(s);
            }
        }
    }

    private static void remove(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        System.out.println("包含“Oracle”的，并删除然后编历  结果：");
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.contains("Oracl")) {
                iterator.remove();
            }else {
                System.out.println(s);
            }
        }
    }
}
