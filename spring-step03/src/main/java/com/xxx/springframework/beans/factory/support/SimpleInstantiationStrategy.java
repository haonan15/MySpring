package com.xxx.springframework.beans.factory.support;

import com.xxx.springframework.beans.BeansException;
import com.xxx.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Ether
 *
 * 无参构造函数实例化与有参构造函数实例化
 */

public class SimpleInstantiationStrategy implements InstantiationStrategy{

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Class clazz = beanDefinition.getBeanClass();
        try {
            if(null != ctor){
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance();
            }else{
                return clazz.getDeclaredConstructor().newInstance();
            }
        } catch (InstantiationException | IllegalAccessException| InvocationTargetException | NoSuchMethodException e) {
            throw new BeansException("Fail to instantiate ["+clazz.getName()+"]",e);
        }
    }
}
