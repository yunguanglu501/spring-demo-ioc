package com.example.ioc.entity;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: wcy
 * @Date: 2022/3/26 15:25
 * @Version 1.0
 */
@Data
@Component
@Configuration
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;
    private Integer age;


    //@Override
    //public Object getObject() throws Exception {
    //    return null;
    //}
    //
    //@Override
    //public Class<?> getObjectType() {
    //    return null;
    //}
}
