package com.yzhao.singleton;

/**
 * （五）静态内部类实现

 当 Singleton 类加载时，静态内部类 SingletonHolder 没有被加载进内存。只有当调用 getUniqueInstance() 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载，此时初始化 INSTANCE 实例。

 这种方式不仅具有延迟初始化的好处，而且由虚拟机提供了对线程安全的支持。
 */
public class Singleton5 {

    private Singleton5() {}

    private static class Singleton5Holder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getSingleton5() {
        return Singleton5Holder.INSTANCE;
    }
}
