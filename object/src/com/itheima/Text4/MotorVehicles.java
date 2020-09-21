package com.itheima.Text4;

import java.util.Objects;

public abstract  class MotorVehicles {
    private String brand;
    private int price;
    abstract void run();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public MotorVehicles() {
    }

    public MotorVehicles(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MotorVehicles that = (MotorVehicles) o;
        return price == that.price &&
                Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }
}
