package com.yzhao.singleton;

/**
 * 一）懒汉式-线程不安全

 以下实现中，私有静态变量 uniqueInstance 被延迟化实例化，这样做的好处是，如果没有用到该类，那么就不会实例化 uniqueInstance，从而节约资源。

 这个实现在多线程环境下是不安全的，如果多个线程能够同时进入 if (uniqueInstance == null) ，并且此时 uniqueInstance 为 null，那么多个线程会执行 uniqueInstance = new Singleton(); 语句，这将导致多次实例化 uniqueInstance。
 */
public class Singleton1 {

    private static Singleton1 singleton1;

    private Singleton1() {

    }

    public static Singleton1 getSingleton1() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
