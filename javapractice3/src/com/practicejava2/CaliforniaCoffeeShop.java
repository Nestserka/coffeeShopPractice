package com.practicejava2;

import java.util.List;

public class CaliforniaCoffeeShop extends Coffee implements Biscuits {

    public CaliforniaCoffeeShop() {
        super.drinkItems = List.of(new DrinkItem("Tea",0, 5),
                new DrinkItem ("Americano",0, 5.5));

    }

    @Override
    public void sellBiscuits() {
        System.out.println(" “Take your cookie”");
    }


    }



