package com.yzhao.abstractfactory;

public class AbstractFactory2 extends AbstractFactory {

    @Override
    AbstractProductA createProductA() {
        //return null;
        return new ProductA2();
    }

    @Override
    AbstractProductB createProductB() {
        //return null;
        return new ProductB2();
    }
}
