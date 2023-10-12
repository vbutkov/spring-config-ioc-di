package ru.vbutkov.spring_ioc_di.bean;

public class ThirdBean {
    public ThirdBean(SecondBean secondBean) {
        System.out.println("ThirdBean created");
        System.out.println("SecondBean from ThirdBean: " + secondBean.toString());
    }
}
