package com.xxx.springframework.test;

import com.xxx.springframework.BeanDefinition;
import com.xxx.springframework.BeanFactory;
import org.junit.Test;

/**
 * @author Ether
 */

public class ApiTest {
    @Test
    public void test_BeanFactory(){
        BeanFactory beanFactory = new BeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        //注册
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //获取并使用bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUerInfo();


    }


}
