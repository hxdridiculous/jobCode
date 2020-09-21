package com.itheima.day9_19;

public class test1 {
    public static void main(String[] args) {
        //System.out.println(mathod1(1,2));
        //System.out.println(mathod2(3,4,5));
        //mathod3(4,5);
        //System.out.println(mathod4());
        /*int[] ints ={981,762,453,423,478,456,345,413,412,354,545};
        System.out.println(mathod5(ints));*/
        /*6.定义一个方法.该方法的功能是求出数组中大于9的元素.使用新数组存储并返回新数组.
        在主方法中调用方法测试执行 ---- 参数是引用类型,返回值是引用类型
	1. 根据题意，方法中需要参数，参数是数组类型.int[]
	2. 方法需要返回值，返回值的类型应该是int[]。*/
        int[] ints ={981,2,453,423,4,456,5,4,412,354,545};
        int[] intss=mathod6(ints);
        /*7.定义一个方法.该方法的功能是接收一个String数组.把数组中的元素存入集合中并返回集合. 在主方法中调用方法测试执行   ---- 参数是引用类型,返回值是引用类型
        1. 根据题意，方法中需要参数，参数是数组类型.String[]
        2. 方法需要返回值，返回值的类型应该是集合ArrayList<String>。	*/
        /*int[] ints ={981,762,453,423,478,456,345,413,412,354,545};
        System.out.println(mathod7(ints));*/

    }

    private static StringBuilder mathod7(int[] ints) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ints.length; i++) {
            stringBuilder.append(ints[i]);
        }
        return stringBuilder;
    }

    private static int[] mathod6(int[] ints) {
        int a =0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]>9){
                a++;
            }
        }
        int[] intss = new int[a];
        int b=0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]>9){
                intss[b]=ints[i];
                System.out.println(intss[b]);
                b++;
            }
        }
        return intss;

    }

    private static int mathod5(int[] ints) {
        int max =ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (max<ints[i]){
                max=ints[i];
            }
        }
        return max;
    }

    private static int mathod4() {
        /*4.定义一个方法，方法的功能是计算1-100的累加之和并返回。在主方法中调用方法测试执行。         ----无参有返回值
        1. 根据题意，方法中不需要参数，所以方法参数是空的.。
        2. 方法需要
        返回值，返回值的类型应该是int。*/
        int a=0;
        for (int i = 0; i <= 100; i++) {
            a+=i;
        }
        return a;
    }

    private static void mathod3(int i, int i1) {
        /*3.定义一个方法，方法的功能是打印4行5列的@符号。执行效果如下:  在主方法中调用方法测试执行。  ----无参无返回值
        @@@@@
        @@@@@
        @@@@@
        @@@@@*/
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i1; i3++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    private static int mathod2(int a , int b , int c ) {
        /*2.定义一个方法，该方法能够找出三个整数中的最大值并输出控制台。在主方法中调用方法测试执行。  --- 有参有无回值
	1. 根据题意，方法中需要使用三个整数，所以方法参数应该是三个整数类型。
	2. 方法需要有返回值，返回值的类型也是整数类型。*/
        return a>b?a:b>c?a>b?a:b:c;
    }

    private static double mathod1(double a,double b) {
        /*1.定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。       --- 有参有返回值
	1. 根据方法的功能描述，方法的参数应该是两个小数。
	2. 要返回两个小数的较小值，所以返回值类型也是小数类型。*/
        if (a>b){
            return b;
        }else{
            return a;
        }
    }
}

