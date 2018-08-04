package com.yzhao.mediator;

public class Splinker extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent(DataEnum.splinker);
    }

    public void doSplinker() {
        System.out.println("doSplinker()");
    }
}
