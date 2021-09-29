package com.practicejava2;

import java.util.List;

public class NewYorkCoffeeShop extends Coffee {
    public NewYorkCoffeeShop() {
        super.drinkItems = List.of(new DrinkItem("Latter", 0, 5),
                new DrinkItem("Juice", 0, 5.5));
    }

}
