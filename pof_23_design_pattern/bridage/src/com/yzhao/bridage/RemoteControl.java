package com.yzhao.bridage;

/**
 * 将抽象与实现分离开来，使它们可以独立变化。
 */

public abstract class RemoteControl {

    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
