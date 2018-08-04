package com.yzhao.chainofresponsibility1;

import java.util.ArrayList;

public class ChainOfResponsibilityClient {

    private ArrayList<Ratify> ratifies;

    public ChainOfResponsibilityClient() {
        ratifies = new ArrayList<Ratify>();
    }

    public void addRatifys(Ratify ratify) {
        ratifies.add(ratify);
    }

    public Result execute(Request request) {
        ArrayList<Ratify> arrayList = new ArrayList<>();
        arrayList.addAll(ratifies);

        arrayList.add(new GroupLeader());
        arrayList.add(new ManagerInfo());
        arrayList.add(new DepartmentHeader());

        RealChain realChain = new RealChain(arrayList, request, 0);
        return realChain.proceed(request);
    }
}
