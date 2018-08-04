package com.yzhao.iterator;

public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator1<Integer> iterator1 = aggregate.createIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
