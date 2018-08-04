package com.yzhao.adapter;

public class Client {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();

        Duck duck = new TurkeyAdapter(turkey);

        duck.quack();
    }
}
