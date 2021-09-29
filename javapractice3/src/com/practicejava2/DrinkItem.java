package com.practicejava2;

public class DrinkItem {
    private String name;
    private int count;
    private double price;

    public DrinkItem(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getCount() {
        return count;
    }

    public int setCount(int count) {
        this.count = count;
        return count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
