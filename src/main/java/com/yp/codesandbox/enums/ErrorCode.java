package com.yp.codesandbox.enums;

/**
 * @author yp
 * @date: 2024/3/3
 */
public enum ErrorCode {

    SUCCESS(0, "success"),
    SANDBOX_ERROR(1, "sandbox error"),
    CODE_ERROR(2, "code error");

    private int code;

    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
