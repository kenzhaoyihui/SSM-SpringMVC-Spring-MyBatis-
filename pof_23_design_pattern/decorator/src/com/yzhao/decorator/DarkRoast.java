package com.yzhao.decorator;

public class DarkRoast implements Beverage {

    @Override
    public double cost() {
        return 20;
    }
}
