package com.yzhao.memento;

public class CalculatorImp implements Calculator {
    private int firstNumber;
    private int secondNumber;

    public PreviousCalculationToCareTaker backupLastCalculation() {
        //return null;
        return new PreviousCalculationImp(firstNumber, secondNumber);
    }

//    public void restorePreviousCalculation(PreviousCalculationToOriginator memento) {
//        this.firstNumber = memento.getFirstNumber();
//        this.secondNumber = memento.getSecondNumber();
//    }


    public void restorePreviousCalculation(PreviousCalculationToCareTaker memento) {
        this.firstNumber = ((PreviousCalculationToOriginator) memento).getFirstNumber();
        this.secondNumber = ((PreviousCalculationToOriginator) memento).getSecondNumber();
    }

    public int getCalculationResult() {
        return firstNumber+secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}
