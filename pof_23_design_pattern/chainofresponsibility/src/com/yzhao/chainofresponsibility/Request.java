package com.yzhao.chainofresponsibility;

public class Request {

    private RequestType requestType;

    private String name;

    public Request(RequestType requestType, String name) {
        this.requestType = requestType;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public RequestType getRequestType() {
        return requestType;
    }
}
