package com.practicejava2;

import javax.swing.event.CaretListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Runner {
    private final static String HELLO_ORIGIN="What city are you from?";
    private final static List<String> CITIES=List.of("1. London", "2. Seoul", "3. California ",
            "4. Paris", "5. New York ");
    private final static String ORDER_QUESTION="What do you want to order?";
    private final static String COOKIE_QUESTION="Maybe you want some cookie too?";
    private final static List<String> COOKIE_REPLY=List.of("1. Yes", "2. No");
    private static CaliforniaCoffeeShop california;
    private static LondonCoffeeShop coffee;
    private static SeoulCoffeeShop seoul;
    private static ParisCoffeeShop paris;
    private static NewYorkCoffeeShop newYork;
    private final static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

    public static void run() throws IOException {
        System.out.println(HELLO_ORIGIN);
//        for (String city: CITIES) {
//            System.out.println(city); //for, for each}
        CITIES.forEach(System.out::println);
        int userIn=Integer.parseInt(bf.readLine());
        if (userIn == 1) {
            if (coffee == null) {
                coffee=new LondonCoffeeShop();
            }
            orderChoice(bf, coffee);
        } else if (userIn == 2) {
            if (seoul == null) {
                seoul=new SeoulCoffeeShop();
            }
            orderChoice(bf, seoul);
        } else if (userIn == 3) {
            if (california == null) {
                california=new CaliforniaCoffeeShop();
            }
            orderChoice(bf, california);
        } else if (userIn == 4) {
            if (paris == null) {
                paris=new ParisCoffeeShop();
            }
            orderChoice(bf, paris);
        } else if (userIn == 5) {
            if (newYork == null) {
                newYork=new NewYorkCoffeeShop();
            }
            orderChoice(bf, newYork);

        }
    }

    private static void cookieChoice(BufferedReader bf, Biscuits coffee) throws IOException {
        System.out.println(COOKIE_QUESTION);
        COOKIE_REPLY.forEach(System.out::println);
        int cookieChoice=Integer.parseInt(bf.readLine());
        if (cookieChoice == 1) {
            coffee.sellBiscuits();

        }
    }

    private static void orderChoice(BufferedReader bf, Coffee coffee) throws IOException {
        System.out.println(ORDER_QUESTION);
        coffee.getDrinkItems().forEach(drinkItem -> System.out.println(coffee.getDrinkItems().indexOf(drinkItem) + 1
                + ". " + drinkItem.getName()));
        System.out.println(coffee.getDrinkItems().size() + 1 + ". Statistics as follows");
        int orderChoice=Integer.parseInt(bf.readLine());
        if (coffee.getDrinkItems().size() + 1 != orderChoice) {

            coffee.waitCoffee();
            String drink=coffee.getDrinkItems().get(orderChoice - 1).getName();
            if (coffee instanceof Biscuits) {
                cookieChoice(bf, (Biscuits) coffee);
            }
            coffee.makeDrink(drink, coffee.getClass().getSimpleName()); //makedrink вызывается последним
            coffee.getDrinkItems().get(orderChoice - 1).setCount(coffee.getDrinkItems().get(orderChoice - 1).getCount() + 1);

        } else {
            coffee.statists();

        }
    }
}
