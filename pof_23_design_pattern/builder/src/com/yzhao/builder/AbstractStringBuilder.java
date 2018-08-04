package com.yzhao.builder;

import java.util.Arrays;

/**
 * 封装一个对象的构造过程，并允许按步骤构造。
 */
public class AbstractStringBuilder {

    protected char[] value;

    protected int count;

    public AbstractStringBuilder(int capacity) {
        count = 0;
        value = new char[capacity];
    }

    void expandCapacity(int minimumCapacity) {
        int newCapacity = value.length * 2 + 2;

        if (newCapacity - minimumCapacity < 0) {
            newCapacity = minimumCapacity;
        }

        if (newCapacity < 0) {
            if (minimumCapacity < 0) {
                throw new OutOfMemoryError();
            }
            newCapacity = Integer.MAX_VALUE;
        }

        value = Arrays.copyOf(value, newCapacity);
    }


    private void ensureCapacityInternal(int minimumCapacity) {
        if (minimumCapacity - value.length > 0) {
            expandCapacity(minimumCapacity);
        }
    }


    public AbstractStringBuilder append(char c) {
        ensureCapacityInternal(count+1);
        value[count++] = c;
        return this;
    }
}
