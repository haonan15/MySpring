package com.xxx.springframework.beans.factory.config;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ether
 * 单例接口的实现类
 */

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry{

    private Map<String,Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject){
        singletonObjects.put(beanName,singletonObject);
    }
}
