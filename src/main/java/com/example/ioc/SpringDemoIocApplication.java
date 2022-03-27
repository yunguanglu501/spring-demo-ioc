package com.example.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringDemoIocApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringDemoIocApplication.class);
        BeanDefinition person2 = context.getBeanDefinition("person");
        System.out.println("person2 = " + person2);
        Object person = context.getBean("person");
        System.out.println("person = " + person);
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //BeanDefinition beanDefinition = new RootBeanDefinition();
        //beanDefinition.setBeanClassName("com.example.ioc.entity.person");
        beanFactory.registerBeanDefinition("person",person2);
        Object person1 = beanFactory.getBean("person");
        System.out.println("person1 = " + person1);
        //SpringApplication.run(SpringDemoIocApplication.class, args);
    }

}
