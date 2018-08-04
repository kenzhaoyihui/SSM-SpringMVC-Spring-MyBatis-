package com.yzhao.strategy;

public class Client {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setQuackBehavior(new Quack());
        duck.performQuack();

        duck.setQuackBehavior(new Squack());
        duck.performQuack();
    }
}
