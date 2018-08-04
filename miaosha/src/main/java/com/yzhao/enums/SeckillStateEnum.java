package com.yzhao.enums;

public enum SeckillStateEnum {

    SUCCESS(1, "success"),
    END(0, "end"),
    REPEAT_KILL(-1, "repeat"),
    INNER_ERROR(-2, "error"),
    DATA_REWRITE(-3, "rewrite");

    private int state;

    private String stateInfo;

    private SeckillStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static SeckillStateEnum stateOf(int index) {
        for (SeckillStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
