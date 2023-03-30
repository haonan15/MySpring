package com.xxx.springframework.beans.factory;

import com.xxx.springframework.beans.BeansException;

/**
 * @author Ether
 */

public interface BeanFactory {
    public Object getBean(String name) throws BeansException;

    public Object getBean(String name, Object...args) throws BeansException;
}
