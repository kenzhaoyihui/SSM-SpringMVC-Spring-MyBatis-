package com.yzhao.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

    private HashMap<String, Flyweight> flyweightHashMap = new HashMap<>();


    Flyweight getFlyweight(String intrinsicState) {
        if (!flyweightHashMap.containsKey(intrinsicState)) {
            Flyweight flyweight = new ConcreteFlyweight(intrinsicState);
            flyweightHashMap.put(intrinsicState, flyweight);
        }

        return flyweightHashMap.get(intrinsicState);
    }
}
