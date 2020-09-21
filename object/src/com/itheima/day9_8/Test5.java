package com.itheima.day9_8;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Test5 {
    public static void main(String[] args) {
        List<String> hashSet = new ArrayList<>(Set.of("王佳乐","张三丰","王思聪","张飞","刘晓敏","张靓颖","王敏"));
        Stream<String> stream = hashSet.stream().filter(s -> s.startsWith("张"));
        Stream<String> stream1 = hashSet.stream().filter(s -> s.startsWith("王"));
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(s -> System.out.println(s));
    }
}
