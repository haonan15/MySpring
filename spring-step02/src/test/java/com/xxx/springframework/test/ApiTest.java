package com.xxx.springframework.test;


import com.xxx.springframework.beans.factory.config.BeanDefinition;
import com.xxx.springframework.beans.factory.config.DefaultSingletonBeanRegistry;
import com.xxx.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.xxx.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author Ether
 */

public class ApiTest {
    @Test
    public void test_BeanFactory(){
        //1.初始化beanfactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefinition);
        //3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUerInfo();

        UserService userService2 = (UserService) beanFactory.getBean("userService");
        userService2.queryUerInfo();

    }


}
