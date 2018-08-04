package com.yzhao.abstractfactory;

public class AbstractFactory1 extends AbstractFactory {

    @Override
    AbstractProductA createProductA() {
        //return null;
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        //return null;
        return new ProductB1();
    }
}
