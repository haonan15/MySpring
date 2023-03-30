package com.xxx.springframework.beans.factory.support;

import com.xxx.springframework.beans.factory.BeanFactory;
import com.xxx.springframework.beans.BeansException;
import com.xxx.springframework.beans.factory.config.BeanDefinition;

/**
 * @author Ether
 * 继承了DefaultSingletonBeanRegistry，具备了使用单例注册类方法
 */

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) return bean;
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
