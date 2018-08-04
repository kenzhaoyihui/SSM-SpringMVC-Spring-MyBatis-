package com.yzhao.flyweight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight1 = flyweightFactory.getFlyweight("aa");
        Flyweight flyweight2 = flyweightFactory.getFlyweight("aa");

        flyweight1.doOperation("x");
        flyweight2.doOperation("y");
    }
}
