package com.example.checkstyle.demo;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public enum MsgTypeEnum {

    TXT(1, "text"),
    MsgType(999, "MsgType"),
    ;

    private final int type;
    private final String desc;

    private static final Map<Integer, MsgTypeEnum> TYPE_MAP = new HashMap<>();

    static {
        Arrays.stream(MsgType.values()).forEach(msgTypeEnum -> TYPE_MAP.put(msgTypeEnum.getType(), msgTypeEnum));
    }

    MsgTypeEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static MsgTypeEnum getByType(int type) {
        return TYPE_MAP.get(type);
    }

    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
