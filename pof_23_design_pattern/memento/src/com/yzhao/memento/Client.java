package com.yzhao.memento;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImp();
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(100);

        System.out.println(calculator.getCalculationResult());

        PreviousCalculationToCareTaker memento = calculator.backupLastCalculation();

        calculator.setFirstNumber(17);
        calculator.setSecondNumber(-209);

        System.out.println(calculator.getCalculationResult());

        calculator.restorePreviousCalculation(memento);

        System.out.println(calculator.getCalculationResult());

        calculator.setFirstNumber(1000);
        calculator.setSecondNumber(2000);
        PreviousCalculationToCareTaker memento1 = calculator.backupLastCalculation();

        calculator.setFirstNumber(1001);
        calculator.setSecondNumber(2002);
        calculator.restorePreviousCalculation(memento1);
        System.out.println(calculator.getCalculationResult());
    }
}
