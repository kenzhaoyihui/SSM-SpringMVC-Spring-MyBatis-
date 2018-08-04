package com.yzhao.factorymethod;

/**
 * 定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化推迟到子类。
 *
 *
 在简单工厂中，创建对象的是另一个类，而在工厂方法中，是由子类来创建对象。

 下图中，Factory 有一个 doSomething() 方法，这个方法需要用到一个产品对象，这个产品对象由 factoryMethod() 方法创建。该方法是抽象的，需要由子类去实现。
 */
public abstract class Factory {
    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        System.out.println(product.toString());
    }
}
