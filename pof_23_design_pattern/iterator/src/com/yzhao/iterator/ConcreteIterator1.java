package com.yzhao.iterator;

public class ConcreteIterator1<Item> implements Iterator1 {

    private Item[] items;
    private int position = 0;

    public ConcreteIterator1(Item[] items) {
        this.items = items;
    }

    public Object next() {
        return items[position++];
    }

    public boolean hasNext() {
        return position<items.length;
    }
}
