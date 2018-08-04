package com.yzhao.simplefactory;

public class Client {

    public static void main(String[] args) {
        int type = 3;
        Product product = SimpleFactory.createProduct(type);
        product.print();
    }
}
