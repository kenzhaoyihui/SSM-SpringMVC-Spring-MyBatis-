package com.yzhao.chainofresponsibility;

public class ConcreteHandler1 extends Handler {
    public ConcreteHandler1(Handler handler) {
        super(handler);
    }

    @Override
    protected void handleRequest(Request request) {

        if (request.getRequestType() == RequestType.type1) {
            System.out.println(request.getName() + " is handle by ConcreteHandler1");
            return;
        }

        if (handler != null) {
            handler.handleRequest(request);
        }
    }
}
