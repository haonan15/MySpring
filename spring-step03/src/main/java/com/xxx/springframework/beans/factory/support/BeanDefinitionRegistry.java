package com.xxx.springframework.beans.factory.support;

import com.xxx.springframework.beans.factory.config.BeanDefinition;

/**
 * @author Ether
 */

public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
