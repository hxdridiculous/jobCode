package com.itheima.test_9;

import java.util.HashSet;

/***
 * 假如你有3个室友,请使用HashSet集合保存3个室友的信息;
 *
 * 信息如下:
 *
 * 赵丽颖,18
 *
 * 范冰冰,20
 *
 * 杨幂,19
 *
 * **要求:**
 *
 * 1:室友以对象形式存在,包含姓名和年龄两个属性;
 *
 * 2:使用代码保证集合中同名同年龄的对象只有一份;(相同姓名和年龄的对象认为是同一个对象)
 */

public class Test1 {
    public static void main(String[] args) {
        HashSet<Chum> chums = new HashSet<>();
        Chum chum1 = new Chum("赵丽颖", 18);
        Chum chum2 = new Chum("范冰冰", 20);
        Chum chum3 = new Chum("杨幂", 19);
        chums.add(chum1);
        chums.add(chum2);
        chums.add(chum3);
        System.out.println(chums);
    }
}
