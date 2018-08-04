package com.yzhao.state;

/**
 * 允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它所属的类。
 */
public interface State {

    /**
     * 投入 25 分钱
     */
    void insertQuarter();


    /**
     * 退回 25 分钱
     */
    void ejectQuarter();


    /**
     * 转动曲柄
     */
    void turnCrank();


    /**
     * 发放糖果
     */
    void dispense();
}
