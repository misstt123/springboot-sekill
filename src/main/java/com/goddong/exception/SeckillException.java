package com.goddong.exception;

/**
 * @Description:
 * @Author lyh-god
 * @Date 2020/4/24
 **/
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
