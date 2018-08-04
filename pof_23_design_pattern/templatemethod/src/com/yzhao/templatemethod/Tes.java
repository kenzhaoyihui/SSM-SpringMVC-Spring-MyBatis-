package com.yzhao.templatemethod;

public class Tes extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }
}
