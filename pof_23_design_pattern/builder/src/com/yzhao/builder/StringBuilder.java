package com.yzhao.builder;

public class StringBuilder extends AbstractStringBuilder {
    public StringBuilder() {
        super(10);
    }

    @Override
    public String toString() {
        //return super.toString();
        return new String(value, 0, count);
    }
}
