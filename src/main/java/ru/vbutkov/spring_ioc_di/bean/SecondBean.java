package ru.vbutkov.spring_ioc_di.bean;

import org.springframework.context.annotation.Scope;

public class SecondBean {
    public SecondBean() {
        System.out.println("SecondBean created");
    }
}
