package com.itheima.day9_19;

public class Test3 {
    public static void main(String[] args) {
        //mathod1();
        //mathod2();
        //mathod3();
        //mathod4();
        //mathod5();
        //mathod7();
        //mathod6();
        //mathod8();
        //mathod9();

    }

    private static void mathod9() {
    /*题目十
求"java"在"adfadsfjavaafdsfafdsjavafasdfadsfjavafadsfdsaf"中的出现的次数
*/
        String s ="adfadsfjavaafdsfafdsjavafasdfadsfjavafadsfjavadsaf";
        //总长度
        int length = s.length();
        //java长度
        String s1 ="java";
        int length1 = s1.length();
        String replace = s.replace("java","");
        //删除完的长度
        int length2 = replace.length();
        int i = (length - length2) / length1;
        System.out.println(i);
    }


    private static void mathod8() {
    /*题目九
    请将"java1","java2",..."java10000"拼接成一个字符串,
    使用String方法和StringBuilder方式测试效率,并总结StringBuilder效率高的原因*/
        String s = "";
        for (int i = 0; i <= 10000; i++) {
            s+="java"+i+",";
        }
        System.out.println(s);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 10000; i++) {
            stringBuilder.append("java"+i+",");
        }
        System.out.println(stringBuilder);
    }

    private static void mathod6() {
    /*8 题目八
键盘录入5个字符串存入数组中.
将数组中包含数字的元素打印到控制台上*/
        String[] arrs = {"eryw233utg","er","wertw322ertt","w","ewrter23wt"};
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i].matches(".*[0-9].*")){
                System.out.println(arrs[i]);
            };
        }
    }

    private static void mathod7() {
    /*7 题目七
键盘录入5个字符串存入数组中.
将数组中的元素都变成大写并反转,然后拼接成一个字符串输出到控制台上*/
        String[] arrs = {"erywutg","er","wertwertt","w","ewrterwt"};
        String s= "" ;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arrs.length; i++) {
            s+=arrs[i].toUpperCase();
        }
        System.out.println(s);
        stringBuilder.append(s);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);

    }

    private static void mathod5() {
    /*6 题目六
键盘录入5个字符串存入数组中.
将数组中,字符串长度<3 的字符串挑出来存入新数组中,最后将新数组中的元素打印到控制台*/
        String[] arrs = {"erywutg","er","wertwertt","w","ewrterwt"};
        int a = 0;
        int b = 0;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i].length()<3){
             a++;
            }
        }
        String[] arrss = new String[a];
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i].length()<3){
                arrss[b]= arrs[i];
                System.out.println(arrss[b]);
                b++;
            }
        }
    }

    private static void mathod4() {
    /*4 题目四
程序从控制台接收一个java文件的文件名，例如：test.java，TEST.java，tEst.JAVA，请编程实现以下功能：
获取，并打印文件名的第一个字符；
获取，并打印文件的后缀名(包括.符号)，例如：.java
无论原文件名什么样，最终将其转换为：Test.java的形式，打印转换后的文件名。*/
        String s = "TeSt.jaVa";
        //全部小写的
        String s1 = s.toLowerCase();
        //获取1第一位到后面全部
        s1.substring(1);
        char c = s.charAt(0);
        String s2 = c+"";
        //第一个大写的
        System.out.println(s2.toUpperCase() + s1.substring(1));
    }

    private static void mathod3() {
    /* 题目三
程序模拟一个论坛发帖的过程，请用户输入一个发帖内容，例如：
    "积分看电视了几分我特朗普将反恐文件风IE哦特朗普积分哦忘记特朗普"
请将字符串中所有的”特朗普”替换为”*”符号。*/
        String s ="hkfjeqehfohjqwji特朗普dsafjosidhfoi";
        System.out.println(s.replace("特朗普", "***"));
    }

    private static void mathod2() {
    /*2 题目二
请用户从控制台输入一个java文件的名字，例如：Test.java，请编程实现以下功能：
判断此文件名是否以".java"结尾，并打印结果
获取此文件中.符号的索引位置，并打印结果*/
        String s = "test.java";
        System.out.println(s.endsWith(".java"));
        System.out.println(s.indexOf("."));
    }

    private static void mathod1() {
    /*题目一
请用户从控制台输入一个“Email地址”，程序接收后判断此Email地址中是否包含@符号和.符号，
如果全部包含，打印：合法，否则打印：不合法的Email地址。*/
        String s = "1989563012@qq.com";
        if (s.contains("@")&&s.contains(".")){
            System.out.println("合法");
        }else {
            System.out.println("不合法的Email地址");
        }
    }
}
