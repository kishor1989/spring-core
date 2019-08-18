package com.springcore.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("beanInjectionUsingAutoWired")
public class BeanInjectionUsingAutoWired {

    @Autowired // It is cunstructor base bean injection
    @Qualifier("bean1") //Use for resolve the conflicts
    private Bean1 bean1;

    private Bean2 bean2;

    @Autowired
    private ParentBean parentBean;

    public void showInfo() {
        System.out.println("BeanInjectionUsingAutoWired info ...");
        bean1.showInfo();
        bean2.showInfo();
        parentBean.showInfo();
    }

    @Autowired // It is setter base bean injection
    @Qualifier("bean2")
    public void setBean2(Bean2 bean2) {
        this.bean2 = bean2;
    }
}
