package com.springcore.app.beans;

public class BeanInjectionViaSetterMethod {
    private Bean1 bean1;
    private Bean3 bean3;

    public void setBean1(Bean1 bean1) {
        this.bean1 = bean1;
    }

    public void setBean3(Bean3 bean3) {
        this.bean3 = bean3;
    }

    public void showInfo() {
        System.out.println("BeanInjectionViaSetterMethod ...");
        bean1.showInfo();
        bean3.showInfo();
    }
}
