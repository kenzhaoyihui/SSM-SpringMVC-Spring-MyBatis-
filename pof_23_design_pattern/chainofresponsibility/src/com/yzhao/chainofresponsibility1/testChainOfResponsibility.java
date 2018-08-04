package com.yzhao.chainofresponsibility1;

public class testChainOfResponsibility {

    public static void main(String[] args) {
        Request request = new Request.Builder().setName("yzhao")
                                    .setDays(8)
                                    .setReason("need to break")
                                    .build();
        ChainOfResponsibilityClient client = new ChainOfResponsibilityClient();
        Result result = client.execute(request);

        System.out.println("Result: " + result.toString());
    }
}
