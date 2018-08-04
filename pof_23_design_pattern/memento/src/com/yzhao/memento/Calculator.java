package com.yzhao.memento;

/**
 * Originator Interface
 */
public interface Calculator {

    //Create Memento
    PreviousCalculationToCareTaker backupLastCalculation();

    //Set memento
    void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

    int getCalculationResult();

    void setFirstNumber(int firstNumber);

    void setSecondNumber(int secondNumber);
}
