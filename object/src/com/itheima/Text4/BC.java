package com.itheima.Text4;

public class BC extends Car implements GPS {

    public BC() {
    }

    public BC(String brand, int price) {
        super(brand, price);
    }

    @Override
    void run() {
        System.out.println(getPrice()+"万元的"+getBrand()+"dingwe...");
    }

    @Override
    public void gps() {
        System.out.println(getPrice()+"万元的"+getBrand()+"汽车正在公路上飞驰...");
    }
}
