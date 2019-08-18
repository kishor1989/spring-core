package com.springcore.app;

import com.springcore.app.beans.*;
import com.springcore.app.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new  AnnotationConfigApplicationContext(BeanConfig.class);
        Bean1 bean1 = applicationContext.getBean("bean1",Bean1.class);
        bean1.showInfo();
        Bean2 bean2 = applicationContext.getBean("bean2",Bean2.class);
        bean2.showInfo();
        Bean3 bean3 = applicationContext.getBean("bean3",Bean3.class);
        bean3.showInfo();
        BeanInjectionViaConstructor beanInjectionViaConstructor = applicationContext.getBean("beanInjectionViaConstructor", BeanInjectionViaConstructor.class);
        beanInjectionViaConstructor.showInfo();
        BeanInjectionViaSetterMethod beanInjectionViaSetterMethod = applicationContext.getBean("beanInjectionViaSetterMethod",BeanInjectionViaSetterMethod.class);
        beanInjectionViaSetterMethod.showInfo();
        BeanInjectionUsingAutoWired beanInjection = applicationContext.getBean("beanInjectionUsingAutoWired", BeanInjectionUsingAutoWired.class);
        beanInjection.showInfo();
        ((AnnotationConfigApplicationContext)(applicationContext)).close();
    }

}
