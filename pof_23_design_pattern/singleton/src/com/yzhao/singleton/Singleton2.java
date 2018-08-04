package com.yzhao.singleton;

/**
 * 二）懒汉式-线程安全

 只需要对 getUniqueInstance() 方法加锁，那么在一个时间点只能有一个线程能够进入该方法，从而避免了对 uniqueInstance 进行多次实例化的问题。

 但是这样有一个问题，就是当一个线程进入该方法之后，其它线程试图进入该方法都必须等待，因此性能上有一定的损耗。
 */
public class Singleton2 {

    private static Singleton2 singleton2;

    private Singleton2() {}

    public static synchronized Singleton2 getSingleton2() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
