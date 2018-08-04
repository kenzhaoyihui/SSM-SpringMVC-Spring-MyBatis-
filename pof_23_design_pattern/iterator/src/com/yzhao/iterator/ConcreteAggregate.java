package com.yzhao.iterator;

public class ConcreteAggregate implements Aggregate {

    private Integer[] items;

    public ConcreteAggregate() {
        items = new Integer[10];
        for (int i=0; i<items.length; i++){
            items[i] = i;
        }
    }

    public Iterator1 createIterator() {
        return new ConcreteIterator1<Integer>(items);
    }
}
