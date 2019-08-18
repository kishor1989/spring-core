package com.springcore.app.beans;

import org.springframework.stereotype.Component;
/*
    Create Bean with help of @Component annotation
 */
@Component("bean2")
public class Bean2 {
    public void showInfo() {
        System.out.println("Bean2 info ...");
    }
}
