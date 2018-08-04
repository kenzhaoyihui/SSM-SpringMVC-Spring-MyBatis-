package com.yzhao.state;

public class GumballMachine {

    private State soldOutState;

    private State noQuarterState;

    private State hasQuarterState;

    private State soldState;

    private State state;
    private int count = 0;

    public GumballMachine(int numberCumballs) {
        count = numberCumballs;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        if (numberCumballs > 0) {
            state = noQuarterState;
        }else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count -= 1;
        }
    }

    public int getCount() {
        return count;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setState(State state) {
        this.state = state;
    }
}
