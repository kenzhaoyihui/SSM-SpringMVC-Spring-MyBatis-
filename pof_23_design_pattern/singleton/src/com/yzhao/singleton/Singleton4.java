package com.yzhao.singleton;

/**
 * （四）双重校验锁-线程安全

 uniqueInstance 只需要被实例化一次，之后就可以直接使用了。加锁操作只需要对实例化那部分的代码进行。也就是说，只有当 uniqueInstance 没有被实例化时，才需要进行加锁。

 双重校验锁先判断 uniqueInstance 是否已经被实例化，如果没有被实例化，那么才对实例化语句进行加锁。
 */
public class Singleton4 {
    private volatile static Singleton4 singleton4;

    private Singleton4() {}

    public static Singleton4 getSingleton4() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}

/**
 niqueInstance 采用 volatile 关键字修饰也是很有必要的。uniqueInstance = new Singleton(); 这段代码其实是分为三步执行。

 分配内存空间
 初始化对象
 将 uniqueInstance 指向分配的内存地址
 但是由于 JVM 具有指令重排的特性，有可能执行顺序变为了 1>3>2，这在单线程情况下自然是没有问题。但如果是多线程下，有可能获得是一个还没有被初始化的实例，以致于程序出错。

 使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。
 */