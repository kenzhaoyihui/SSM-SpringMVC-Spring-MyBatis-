package com.yzhao.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getSingleton1();
        System.out.println(singleton1.getClass().toString());

        Singleton6 singleton6 = Singleton6.INSTANCE;
        System.out.println(singleton6.getClass().toString());
    }
}
