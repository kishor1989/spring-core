package com.springcore.app.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("childBean1")
@Primary
public class ChildBean1 implements ParentBean{
    @Override
    public void showInfo() {
        System.out.println("ChildBean1 ...");
    }
}
