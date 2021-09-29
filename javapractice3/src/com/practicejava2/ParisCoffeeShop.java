package com.practicejava2;

import java.util.List;

public class ParisCoffeeShop extends Coffee {
    public ParisCoffeeShop() {
        super.drinkItems = List.of(new DrinkItem("Capuchinno", 0, 10),
                new DrinkItem("Americano", 0, 7),
                new DrinkItem("Tea", 0, 3));

    }
}