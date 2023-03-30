package com.xxx.springframework.beans.factory.config;
/**
 *
 * @author Ether
 * 获取单例对象的接口
 */

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
