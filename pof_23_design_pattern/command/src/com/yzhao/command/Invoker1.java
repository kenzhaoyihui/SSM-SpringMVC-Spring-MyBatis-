package com.yzhao.command;

public class Invoker1 {
    private Command onCommand;
    private Command offComand;

    private Light light;

    public Invoker1(Light light) {
        this.light = light;
        this.onCommand = new LightOnCommand(light);
        this.offComand = new LightOffCommand(light);
    }

    public void onButtonWasPushed() {
        onCommand.execute();
    }

    public void offButtonWasPushed() {
        offComand.execute();
    }
}
