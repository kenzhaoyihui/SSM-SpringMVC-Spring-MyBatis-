package com.yzhao.mediator;

/**
 * 集中相关对象之间复杂的沟通和控制方式。
 */
public class ConcreteMediator extends Mediator {

    private Alarm alarm;
    private Calender calender;
    private Splinker splinker;
    private CoffeePot coffeePot;

    public ConcreteMediator(Alarm alarm,
                            Calender calender,
                            Splinker splinker,
                            CoffeePot coffeePot) {
        this.alarm = alarm;
        this.calender = calender;
        this.splinker = splinker;
        this.coffeePot = coffeePot;
    }

    @Override
    public void doEvent(DataEnum eventType) {

        switch (eventType) {
            case alarm:
                doAlarmEvent();
                break;
            case coffeePot:
                doCoffeePotEvent();
                break;
            case calender:
                doCalenderEvent();
                break;
                default:
                    doSplinkerEvent();
        }
    }

    public void doAlarmEvent() {
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        calender.doCalender();
        splinker.doSplinker();
    }

    public void doCoffeePotEvent() {
        System.out.println("do coffeePot");
    }

    public void doCalenderEvent() {
        System.out.println("do calender");
    }

    public void doSplinkerEvent() {
        System.out.println("do splinker");
    }
}
