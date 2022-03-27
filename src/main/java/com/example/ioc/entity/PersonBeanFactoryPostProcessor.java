package com.example.ioc.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * 当spring集成其他的框架时,比如集成mybatis
 * @Author: wcy
 * @Date: 2022/3/26 16:58
 * @Version 1.0
 */
//@Component
public class PersonBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition personBeanDefinition = beanFactory.getBeanDefinition("person");
        personBeanDefinition.setBeanClassName("com.example.ioc.entity.Student");
    }
}
