package com.itheima.day9_8;

import java.util.HashSet;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(Set.of("王佳乐","张三丰","王思聪","张飞","刘晓敏","张靓颖","王敏"));
        hashSet.stream().filter(s -> s.startsWith("张")).limit(2).forEach(s -> System.out.println(s));
        hashSet.stream().filter(s -> s.startsWith("王")).skip(1).forEach(s -> System.out.println(s));
    }
}
