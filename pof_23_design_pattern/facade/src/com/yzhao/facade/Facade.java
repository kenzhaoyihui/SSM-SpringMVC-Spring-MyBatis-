package com.yzhao.facade;

public class Facade {
    private SubSystem subSystem = new SubSystem();

    //提供了一个统一的接口，用来访问子系统中的一群接口，从而让子系统更容易使用。
    //
    //最少知识原则：只和你的密友谈话。也就是客户对象所需要交互的对象应当尽可能少。
    public void watchMovie() {
        subSystem.turnOnTV();
        subSystem.setCD("film");
        subSystem.startWatching();
    }
}
