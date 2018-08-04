package com.yzhao.observer;

public class CurrentConditionsDisplay implements Observer {

    public CurrentConditionsDisplay(Subject weatherData) {
        //weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
