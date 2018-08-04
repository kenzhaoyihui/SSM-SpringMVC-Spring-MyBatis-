package com.yzhao.chainofresponsibility1;

import java.util.List;

public class RealChain implements Ratify.Chain {

    public Request request; //具体的请求Request实例
    public List<Ratify> ratifyList; //Ratify接口的实现类集合
    public int index; //已经处理过该request的责任人数量

    public RealChain(List<Ratify> ratifyList, Request request, int index) {
        this.ratifyList = ratifyList;
        this.request = request;
        this.index = index;
    }

    @Override
    public Request request() {
        //return null;
        return request;
    }

    @Override
    public Result proceed(Request request) {
        //return null;
        Result result = null;
        if (ratifyList.size() > index) {
            RealChain realChain = new RealChain(ratifyList, request, index+1);
            Ratify ratify = ratifyList.get(index);
            result = ratify.deal(realChain);
        }
        return result;
    }
}
