package com.yzhao.mediator;

public class Calender extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent(DataEnum.calender);
    }

    public void doCalender() {
        System.out.println("doCalender()");
    }
}
