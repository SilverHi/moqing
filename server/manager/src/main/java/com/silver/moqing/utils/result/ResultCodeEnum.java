package com.silver.moqing.utils.result;

/**
 * @ClassName ResultCodeEnum
 * @Description TODO
 * @Author silver
 * @Date 2021/3/1 下午11:24
 * @Version 1.0
 **/

public enum ResultCodeEnum {
    SUCCESS(true,200,"成功"),
    UNKNOWN_ERROR(false,401,"未知参数"),
    PARAM_ERROR(false,402,"参数错误"),
    USER_NOT_FOUND(false,10000,"用户找不到！")
    ;

    private Boolean success;
    private Integer code;
    private String message;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
