package com.xxx.springframework.beans.factory.config;

/**
 * @author Ether
 * Bean定义类
 */

public class BeanDefinition {
    public Class beanClass;

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
