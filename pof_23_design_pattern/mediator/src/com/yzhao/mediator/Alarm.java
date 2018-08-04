package com.yzhao.mediator;

public class Alarm extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent(DataEnum.alarm);
    }

    public void doAlarm() {
        System.out.println("doAlarm()");
    }
}
