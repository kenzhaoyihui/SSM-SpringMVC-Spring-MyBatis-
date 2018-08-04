package com.yzhao.chainofresponsibility;

public class ConcreteHandler2 extends Handler {

    public ConcreteHandler2(Handler handler) {
        super(handler);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.type2) {
            System.out.println(request.getName() + " is handle by ConcreteHandler2");
            return;
        }

        // this handler is the super
        if (handler != null) {
            handler.handleRequest(request);
        }
    }
}
