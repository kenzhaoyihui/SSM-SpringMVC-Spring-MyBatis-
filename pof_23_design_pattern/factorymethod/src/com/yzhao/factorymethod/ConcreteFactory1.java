package com.yzhao.factorymethod;

public class ConcreteFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        //return null;
        return new ConcreteProduct1();
    }
}
