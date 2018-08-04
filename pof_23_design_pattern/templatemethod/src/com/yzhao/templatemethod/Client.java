package com.yzhao.templatemethod;

public class Client {
    public static void main(String[] args) {
        CaffeineBeverage caffeineBeverage1 = new Caffee();
        caffeineBeverage1.prepareRecipe();

        System.out.println("--------");

        CaffeineBeverage caffeineBeverage2 = new Tes();
        caffeineBeverage2.prepareRecipe();
    }
}
