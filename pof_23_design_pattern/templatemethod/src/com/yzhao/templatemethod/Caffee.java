package com.yzhao.templatemethod;

public class Caffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Caffee.brew");
    }


    @Override
    void addCondiments() {
        System.out.println("Caffee.addCondiments");
    }
}
