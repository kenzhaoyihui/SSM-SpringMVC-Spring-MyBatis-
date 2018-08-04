package com.yzhao.prototype;

public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("zyh");
        Prototype clone = prototype.myClone();
        System.out.println(clone.toString());
    }
}
