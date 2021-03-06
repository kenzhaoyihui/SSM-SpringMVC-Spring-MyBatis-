package com.yzhao.singleton;

/**
 * （三）饿汉式-线程安全

 线程不安全问题主要是由于 uniqueInstance 被实例化了多次，如果 uniqueInstance 采用直接实例化的话，就不会被实例化多次，也就不会产生线程不安全问题。但是直接实例化的方式也丢失了延迟实例化带来的节约资源的优势。


 */
public class Singleton3 {

    private static Singleton3 singleton3 = new Singleton3();

    private Singleton3() {}

    public static Singleton3 getSingleton3() {
        return singleton3;
    }
}
