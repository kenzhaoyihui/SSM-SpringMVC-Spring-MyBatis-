package com.yzhao.iterator;

/**
 *
 提供一种顺序访问聚合对象元素的方法，并且不暴露聚合对象的内部表示
 * @param <Item>
 */
public interface Iterator1<Item> {
    Item next();

    boolean hasNext();
}
