package com.wj.sso.common.tool.exception;

import com.wj.sso.common.tool.model.ResultCode;

public class ApplicationException extends RuntimeException {

    public static final String MESSAGE = "应用异常";
    private static final long serialVersionUID = 5480379152422609793L;
    protected int code = ResultCode.APPLICATION_ERROR;

    public ApplicationException() {
        super(MESSAGE);
    }

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
