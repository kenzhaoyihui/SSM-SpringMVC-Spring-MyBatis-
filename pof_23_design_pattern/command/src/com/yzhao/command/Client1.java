package com.yzhao.command;

public class Client1 {
    public static void main(String[] args) {
        Light light = new Light();
        Invoker1 invoker1 = new Invoker1(light);

        invoker1.onButtonWasPushed();

        invoker1.offButtonWasPushed();
    }
}
