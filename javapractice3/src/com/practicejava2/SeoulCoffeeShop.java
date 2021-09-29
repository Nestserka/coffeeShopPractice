package com.practicejava2;

import java.util.List;

public class SeoulCoffeeShop extends Coffee {
    public SeoulCoffeeShop() {
        super.drinkItems = List.of(new DrinkItem("Mineral Water", 0, 1),
                new DrinkItem("Protein Shake", 0, 3),
                new DrinkItem("Tea", 0, 3));

    }
}