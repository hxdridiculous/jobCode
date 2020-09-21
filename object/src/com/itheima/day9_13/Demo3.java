package com.itheima.day9_13;

public class Demo3 {
    public static void main(String[] args) {

        Cave cave = new Cave();
        Thread thr1 = new Thread(cave,"一号线程");
        Thread thr2 = new Thread(cave,"二号线程");
        Thread thr3 = new Thread(cave,"三号线程");
        Thread thr4 = new Thread(cave,"四号线程");
        Thread thr5 = new Thread(cave,"五号线程");
        Thread thr6 = new Thread(cave,"六号线程");
        Thread thr7= new Thread(cave,"七号线程");
        Thread thr8 = new Thread(cave,"八号线程");
        Thread thr9 = new Thread(cave,"九号线程");
        Thread thr10 = new Thread(cave,"十号线程");
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
        thr6.start();
        thr7.start();
        thr8.start();
        thr9.start();
        thr10.start();
    }

}
