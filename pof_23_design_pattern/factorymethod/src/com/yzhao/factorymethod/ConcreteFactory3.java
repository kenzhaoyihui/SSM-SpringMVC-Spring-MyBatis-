package com.yzhao.factorymethod;

public class ConcreteFactory3 extends Factory {
    @Override
    public Product factoryMethod() {
        //return null;
        return new ConcreteProduct3();
    }
}
