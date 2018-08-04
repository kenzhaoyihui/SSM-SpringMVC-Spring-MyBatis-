package com.yzhao.factorymethod;

public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory1();
        Factory factory1 = new ConcreteFactory2();
        Factory factory2 = new ConcreteFactory3();
        factory.doSomething();
        factory1.doSomething();
        factory2.doSomething();
    }
}
