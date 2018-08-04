package com.yzhao.decorator;

public class Client {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.cost());

        System.out.println("------");

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Milk(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Milk(beverage1);
        System.out.println(beverage1.cost());
    }
}
