package com.itheima.Text2;

public class Text1 {
    public static void main(String[] args) {
        Manager manager = new Manager(123,"李经理",18,10000);
        manager.content();
        Staff staff = new Staff(321,"李先生",17);
        staff.content();
    }
}
