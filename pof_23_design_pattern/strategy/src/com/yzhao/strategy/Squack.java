package com.yzhao.strategy;

public class Squack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squack");
    }
}
