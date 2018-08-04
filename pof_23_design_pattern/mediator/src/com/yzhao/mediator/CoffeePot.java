package com.yzhao.mediator;

public class CoffeePot extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent(DataEnum.coffeePot);
    }

    public void doCoffeePot() {
        System.out.println("doCoffeePot()");
    }
}
