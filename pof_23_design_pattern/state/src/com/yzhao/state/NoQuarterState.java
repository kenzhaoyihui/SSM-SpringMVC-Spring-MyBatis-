package com.yzhao.state;

public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You insert a quarter...");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't insert a quarter...");

    }

    @Override
    public void turnCrank() {
        System.out.println("Your turned , but there's no quarter...");
    }

    @Override
    public void dispense() {
        System.out.println("you need to pay first...");
    }
}
