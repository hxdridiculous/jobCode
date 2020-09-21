package com.itheima.day9_19;

import java.util.TreeSet;

public class Test5 {
    public static void main(String[] args) {
        //键盘录入字符串,统计里面每个字符出现的次数
        String s = "afgwqertyuioppasdfghjklzxcvbnmmjhagfjaghfasjhfbaeuvjkasbv";
        char[] chars = s.toCharArray();
        TreeSet<String> treeSet = new TreeSet<>();
        for (int i = 0; i < chars.length; i++) {
            treeSet.add(chars[i]+"");
        }
        for (String s1 : treeSet) {
            int a = getnum(s1,chars);
            System.out.println("有"+a+"个"+s1);
        }
    }

    private static int getnum(String s1,char[] chars) {
        int num =0 ;
        for (int i = 0; i < chars.length; i++) {
            if (s1.equalsIgnoreCase(chars[i]+"")){
                num++;
            }
        }
        if (num==0){
           num=1;
        }
        return num;
    }
}
