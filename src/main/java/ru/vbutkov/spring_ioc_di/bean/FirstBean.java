package ru.vbutkov.spring_ioc_di.bean;

public class FirstBean {
    public FirstBean(SecondBean secondBean) {
        System.out.println("FirstBean created");
        System.out.println("SecondBean from FirstBean: " + secondBean.toString());
    }
}
