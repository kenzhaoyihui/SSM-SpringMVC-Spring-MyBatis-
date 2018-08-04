package com.yzhao.factorymethod;

public class ConcreteFactory2 extends Factory {

    @Override
    public Product factoryMethod() {
        //return null;
        return new ConcreteProduct2();
    }
}
