package com.imooc.o2o.enums;

/**
 * @program: o2o
 * @description:
 * @author: Joey
 * @create: 2019-02-24 14:41
 */
public enum ShopStateEnum {
    CHECK(0, "审核中"),
    OFFLINE(-1, "非法店铺"),
    SUCCESS(1, "操作成功"),
    PASS(2, "通过认证"),
    INNER_ERROR(-1001, "内部系统错误"),
    NULL_SHOPID(-1002, ""),
    NULL_SHOP(-1003,"shop信息为空");

    private int state;
    private String stateInfo;

    private ShopStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * @Description: 根据传入的state返回相应的enum值
     * @Param:
     * @return:
     * @Author: Joey
     * @Date: 2019/2/24 14:47
     */
    public static ShopStateEnum stateOf(int state) {
        for (ShopStateEnum stateEnum : values()) {
            if (stateEnum.getState() == state){
                return stateEnum;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
