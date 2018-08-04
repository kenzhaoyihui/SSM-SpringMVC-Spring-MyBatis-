package com.yzhao.mediator;

public class Client {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        CoffeePot coffeePot = new CoffeePot();

        Calender calender = new Calender();
        Splinker splinker = new Splinker();

        Mediator mediator = new ConcreteMediator(alarm, calender, splinker, coffeePot);
        alarm.onEvent(mediator);
        System.out.println("------");
        calender.onEvent(mediator);
        System.out.println("------");
        coffeePot.onEvent(mediator);
        System.out.println("------");
        splinker.onEvent(mediator);

    }
}
