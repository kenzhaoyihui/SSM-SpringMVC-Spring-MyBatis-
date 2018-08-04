package com.yzhao.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory1();

        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();

        System.out.println(productA.toString());
        System.out.println(productB.toString());

    }
}
