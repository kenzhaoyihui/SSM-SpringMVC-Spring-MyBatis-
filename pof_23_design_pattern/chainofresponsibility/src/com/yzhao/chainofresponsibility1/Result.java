package com.yzhao.chainofresponsibility1;

public class Result {

    public boolean isRatify;
    public String info;

    public Result() {}

    public Result(boolean isRatify, String info) {
        super();
        this.isRatify = isRatify;
        this.info = info;
    }

    public boolean isRatify() {
        return isRatify;
    }

    public void setRatify(boolean ratify) {
        isRatify = ratify;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        //return super.toString();
        return "Result [" +
                "isRatify=" + isRatify +
                ", info=" + info +
                "]";
    }
}
