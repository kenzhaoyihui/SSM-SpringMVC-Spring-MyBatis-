package com.yzhao.nullobject;

public class Client {

    public static void main(String[] args) {
        AbstractOperation abstractOperation = select(-1);
        abstractOperation.request();

        System.out.println("-------");
        AbstractOperation abstractOperation1 = select(1);
        abstractOperation1.request();
    }

    public static AbstractOperation select(int param) {
        if (param < 0) {
            return new NullOperayion();
        }
        return new RealOperation();
    }
}
