package com.xxx.springframework.beans.factory.support;

import com.xxx.springframework.beans.BeansException;
import com.xxx.springframework.beans.factory.config.BeanDefinition;

/**
 * @author Ether
 * 实现了 Bean 的实例化操作（适用于无参构造器）
 */

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed"+e);
        }
        addSingleton(beanName,bean);
        return bean;
    }
}
