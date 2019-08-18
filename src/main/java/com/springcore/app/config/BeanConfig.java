package com.springcore.app.config;

import com.springcore.app.beans.Bean1;
import com.springcore.app.beans.Bean3;
import com.springcore.app.beans.BeanInjectionViaConstructor;
import com.springcore.app.beans.BeanInjectionViaSetterMethod;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
    if pojo class create with help of @Component then need to define @ComponentScan Annotaion
    to scan the bean from base package. if pojo not created with @Component annotation then no
    need to be define the @ComponentScan annotation.
    If bean created with @Bean annotation then not to be need use @ComponentScan annotation.
 */
@ComponentScan(basePackages = "com.springcore.app")
public class BeanConfig {
    /*
        Create bean with help of @Bean Anotation
    */
    @Bean(name = "bean1")
    public Bean1 getBean1() {
        return new Bean1();
    }

    @Bean(name = "bean3")
    public Bean3 getBean3() {
        return new Bean3();
    }

    @Bean(name = "beanInjectionViaConstructor")
    public BeanInjectionViaConstructor getBeanInjectionViaConstructor() {
        BeanInjectionViaConstructor beanInjection = new BeanInjectionViaConstructor(getBean1(),getBean3());
        return beanInjection;
    }

    @Bean(name = "beanInjectionViaSetterMethod")
    public BeanInjectionViaSetterMethod getBeanInjectionViaSetterMethod() {
        BeanInjectionViaSetterMethod beanInjectionViaSetterMethod = new BeanInjectionViaSetterMethod();
        beanInjectionViaSetterMethod.setBean1(getBean1());
        beanInjectionViaSetterMethod.setBean3(getBean3());
        return beanInjectionViaSetterMethod;
    }
}
