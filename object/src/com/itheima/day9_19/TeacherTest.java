package com.itheima.day9_19;

public class TeacherTest {
    public static void main(String[] args) {
        /*定义老师类Teacher, 属性和行为如下, 并在测试类TeacherTest中, 创建老师类的对象, 然后访问类中的成员.
	属性:
		姓名: name
		年龄: age
		讲课内容: content
	行为:
		吃饭: eat()
		讲课: teach()*/
        Teacher teacher = new Teacher("张三", 19, "Java基础中面向对象");
        teacher.eat();
        teacher.teach();
    }
}
