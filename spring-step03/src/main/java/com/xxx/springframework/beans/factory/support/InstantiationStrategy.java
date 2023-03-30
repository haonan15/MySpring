package com.xxx.springframework.beans.factory.support;

import com.xxx.springframework.beans.BeansException;
import com.xxx.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author Ether
 */

public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
