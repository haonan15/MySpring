package com.xxx.springframework.beans.factory.support;

import com.xxx.springframework.beans.factory.config.BeanDefinition;

/**
 * @author Ether
 */

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
