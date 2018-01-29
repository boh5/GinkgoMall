package com.ginkgomall.common;

/**
 * 响应状态代码
 *
 * @author dill
 * @date 2018/1/26
 * @see ServerResponse
 */
public enum  ResponseCode {

    /**
     * 成功
     */
    SUCCESS(0, "SUCCESS"),
    /**
     * 错误
     */
    ERROR(1, "ERROR"),
    /**
     * 需要登录
     */
    NEED_LOGIN(10, "NEED_LOGIN"),
    /**
     * 参数错误
     */
    ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
