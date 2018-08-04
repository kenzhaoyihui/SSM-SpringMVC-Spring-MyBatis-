package com.yzhao.prototype;

public class ConcretePrototype extends Prototype {

    private String filed;

    public ConcretePrototype(String filed) {
        this.filed = filed;
    }

    @Override
    Prototype myClone() {
        //return null;
        return new ConcretePrototype(filed);
    }

    @Override
    public String toString() {
        //return super.toString();
        return filed;
    }
}
