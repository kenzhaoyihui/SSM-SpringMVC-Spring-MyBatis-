package com.yzhao.templatemethod;


/**
 * 定义算法框架，并将一些步骤的实现延迟到子类。

 通过模板方法，子类可以重新定义算法的某些步骤，而不用改变算法的结构。


 */
public abstract class CaffeineBeverage {
    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("boilWater");
    }

    void pourInCup() {
        System.out.println("pourInCup");
    }
}
