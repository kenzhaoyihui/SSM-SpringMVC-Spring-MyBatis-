package com.yzhao.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1(null);

        System.out.println(handler1);

        Handler handler2 = new ConcreteHandler2(handler1);

        Request request1 = new Request(RequestType.type1, "request1");
        handler1.handleRequest(request1);
        handler2.handleRequest(request1);

        System.out.println("----");
        Request request2 = new Request(RequestType.type2, "request2");
        handler1.handleRequest(request2);
        System.out.println("---------");
        handler2.handleRequest(request2);
    }
}
