package com.springcore.app.beans;

public class BeanInjectionViaConstructor {
    private Bean1 bean1;
    private Bean3 bean3;

    public BeanInjectionViaConstructor(Bean1 bean1, Bean3 bean3) {
        this.bean1 = bean1;
        this.bean3 = bean3;
    }

    public void showInfo() {
        System.out.println("BeanInjectionViaConstructor ...");
        bean1.showInfo();
        bean3.showInfo();
    }
}
