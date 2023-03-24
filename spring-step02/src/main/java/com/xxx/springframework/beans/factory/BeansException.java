package com.xxx.springframework.beans.factory;

/**
 * @author Ether
 */

public class BeansException extends RuntimeException{
    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
