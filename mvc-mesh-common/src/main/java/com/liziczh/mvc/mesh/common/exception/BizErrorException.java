package com.liziczh.mvc.mesh.common.exception;

/**
 * 业务ERROR异常
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2021/7/17 21:52
 */
public class BizErrorException extends BaseException {
    private static final long serialVersionUID = -4266918287821739868L;

    public BizErrorException() {
        super();
    }

    public BizErrorException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public BizErrorException(String code, String message) {
        super(code, message);
    }

    public BizErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizErrorException(String message) {
        super(message);
    }

    public BizErrorException(Throwable cause) {
        super(cause);
    }
}
