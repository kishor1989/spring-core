package com.springcore.app.beans;

import org.springframework.stereotype.Component;

@Component("childBean2")
public class ChildBean2 implements ParentBean{
    @Override
    public void showInfo() {
        System.out.println("ChildBean2 info ...");
    }
}
