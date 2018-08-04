package com.yzhao.chainofresponsibility1;

public class GroupLeader implements Ratify {


    @Override
    public Result deal(Chain chain) {
        //return null;
        Request request = chain.request();
        System.out.println("GroupLeader===>request:" + request.toString());

        if (request.getDays() > 1) {
            Request newRequest = new Request.Builder().newRequest(request)
                    .setManagerInfo(request.getName() + "平时表现不错，而且现在项目也不忙")
                    .build();
            return chain.proceed(newRequest);
        }

        return new Result(true, "GroupLeader: 早去早回");
    }
}