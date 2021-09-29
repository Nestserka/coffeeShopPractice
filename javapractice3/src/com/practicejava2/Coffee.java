package com.practicejava2;


import java.util.List;

abstract class Coffee {

    public List<DrinkItem> getDrinkItems() {
        return drinkItems;
    }

    protected List<DrinkItem> drinkItems;

    void waitCoffee() {
        System.out.println("Please, wait a minute for coffee");
    }

    void waiting() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void makeDrink(String drink, String coffeeShop) {
        waiting();
        System.out.println(" “Thanks for order " + drink + " in " + coffeeShop + ". Bye!”");
    }

    public void statists()  {
        for (DrinkItem allTotal : drinkItems) {
            System.out.println("Type: " + allTotal.getName() + " Qty: " + allTotal.getCount() + " Price " + allTotal.getCount()*allTotal.getPrice());
        }
    }
}
