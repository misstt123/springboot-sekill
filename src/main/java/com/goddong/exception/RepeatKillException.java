package com.goddong.exception;

/**
 * @Description:
 * @Author lyh-god
 * @Date 2020/4/24
 **/
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}