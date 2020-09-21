package com.itheima.day9_19;

public class ManagerTest {
    public static void main(String[] args) {
        /*
4. 定义项目经理类Manager, 属性和行为如下, 并在测试类ManagerTest中, 创建项目经理类的对象, 然后访问类中的成员.
	属性：
		姓名: name
		工号: id
		工资: salary
		奖金: bonus
	行为：
		工作: work()*/
        Manager manager = new Manager("老王",3657425,32876,3874658);
        manager.work();
        Manager manager1 = new Manager();
        manager1.setName("老李");
        manager1.setId(32413);
        manager1.setSalary(33425233);
        manager1.setBonus(76235);
        manager1.work();
    }
}
