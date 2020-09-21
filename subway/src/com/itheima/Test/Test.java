package com.itheima.Test;

import com.itheima.domain.Manager;
import com.itheima.domain.Subway;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    /*
    运行程序,提示管理员进行登录,根据输入的工号和姓名判断是否登录成功,登录成功,进入下一步,登录失败,给出提示,结束程序
    要求：
     2.1. 运行程序,将managers.txt文件中的管理人员信息读取到集合中
                2.1.1. 将读取到的一行数据切割成字符串数组
                2.1.2. 将数组中的元素封装到Manager对象中
                2.1.3. 将Manager对象添加到集合中
    2.2. 将subways文件中的地铁站信息读取到另一个集合中
    2.3. 给出提示,获取管理人员输入的工号和姓名
    2.4. 判断管理人员信息集合中是否包含管理人员输入的工号和姓名,给出对应的登录结果
    【问题3】
    当管理人员登录成功后,给出选项提示,根据管理人员的选择,执行后续的操作
         3.1. 给出提示: 1.查看地铁站 2.添加地铁站
         3.2. 获取管理人员输入的选择
         3.3. 根据管理人员的选择,执行对应的操作
    【问题4】
    当管理人员选择1时,执行对应的查看地铁站操作
         4.1. 判断地铁站集合中是否有地铁站信息
         4.2. 如果没有地铁站信息,给出提示
         4.3. 如果有地铁站信息,遍历集合,打印每个地铁站信息
    【问题5】
    当管理人员选择2时,执行对应的添加地铁站操作
         5.1.依次给出提示,获取管理人员输入的地铁站信息,包括地铁站编号，地铁站名称，所属路线
         5.2. 将管理人员输入的地铁站信息封装成对象,存储到集合中
         5.3. 将集合中的地铁站信息更新到文件中,再次打开文件时,应该包含管理人员刚才录入进去的地铁站信息,程序结束
         */
    /*
    bug   输入工号姓名结束之后会报错
    在输入一次就可以了

     */
    public static void main(String[] args) throws IOException {
        //将managers.txt文件中的管理人员信息读取到
        BufferedReader manbfr = new BufferedReader(new FileReader("C:\\Practise\\jobCode\\subway\\managers.txt"));
        ArrayList<Manager> manlist = new ArrayList<>();
        String man;
        while ((man = manbfr.readLine()) != null) {
            String[] split = man.split(",");
            manlist.add(new Manager(split[0], split[1], split[2], split[3]));

        }
        manbfr.close();
        BufferedReader subbfr = new BufferedReader(new FileReader("subway\\subways.txt"));
        ArrayList<Subway> sublist = new ArrayList<>();
        String sub;
        while ((sub = subbfr.readLine()) != null) {
            String[] split = sub.split(",");
            sublist.add(new Subway(split[0], split[1], split[2]));
        }
        subbfr.close();
        io:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入工号:");
            String mid = sc.nextLine();
            System.out.println("请输入姓名:");
            String name = sc.nextLine();
            boolean flag = false;
            for (Manager manager : manlist) {
                String m_mid = manager.getId();
                String m_name = manager.getName();
                if (m_mid.equals(mid) && m_name.equals(name)) {
                    flag = true;
                    break;
                }
            }
                if (flag) {
                    System.out.println("输入正确");
                    i20:while (true) {
                        System.out.println("1.查看地铁站 2.添加地铁站 3.结束");
                        int a = sc.nextInt();
                        if (a == 1) {
                            ArrayList<Subway> subempty = isSubempty(sublist);
                            if (subempty == null) {
                                System.out.println("没有数据");
                            } else {
                                for (Subway subway : subempty) {
                                    System.out.println(subway.getId()+"\t"+subway.getName()+"\t"+subway.getLine());
                                }
                            }
                        } else if (a == 2) {
                            System.out.println("请输入地铁站信息,地铁站编号");
                            String next1 = sc.next();
                            System.out.println("请输入地铁站信息,地铁站名称");
                            String next2 = sc.next();
                            System.out.println("请输入地铁站信息,所属路线");
                            String next3 = sc.next();
                            sublist.add(new Subway(next1, next2, next3));
                            BufferedWriter bfw = new BufferedWriter(new FileWriter("subway\\subways.txt", true));
                            bfw.newLine();
                            bfw.write(next1);
                            bfw.write(",");
                            bfw.write(next2);
                            bfw.write(",");
                            bfw.write(next3);
                            bfw.write(",");
                            System.out.println("添加成功");
                            bfw.close();
                        } else if (a == 3) {
                            break io;
                        }
                    }
                }else{
                    System.out.println("错误");

                }
            }

        }

    private static ArrayList<Subway> isSubempty(ArrayList<Subway> sublist) {
        if (sublist == null) {
            return null;
        } else {
            return sublist;
        }
    }

    private static Boolean isempty(String s1, String s2, ArrayList<Manager> manlist) {
        Boolean a = false;
        for (int i = 0; i < manlist.size(); i++) {
            Manager s = manlist.get(i);
            if (s1.equalsIgnoreCase(s.getId()) && s2.equalsIgnoreCase(s.getName())) {
                a = true;
            }
        }
        return a;
    }
}
