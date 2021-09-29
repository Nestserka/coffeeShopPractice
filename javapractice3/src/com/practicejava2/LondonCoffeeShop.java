package com.practicejava2;

import java.util.List;

public class LondonCoffeeShop extends Coffee implements Biscuits {
    public LondonCoffeeShop() {
        super.drinkItems = List.of(new DrinkItem("Tea",0, 5),
                new DrinkItem ("Juice",0, 5.5),
                new DrinkItem ("Shake",0, 8) );

    }

    @Override
    public void sellBiscuits() {
        System.out.println(" “Take your cookie”");
    }
}