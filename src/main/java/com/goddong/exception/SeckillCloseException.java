package com.goddong.exception;

/**
 * @Description:
 * @Author lyh-god
 * @Date 2020/4/24
 **/
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}