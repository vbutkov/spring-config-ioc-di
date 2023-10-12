package ru.vbutkov.spring_ioc_di.configure.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.vbutkov.spring_ioc_di.bean.FirstBean;
import ru.vbutkov.spring_ioc_di.bean.SecondBean;
import ru.vbutkov.spring_ioc_di.bean.ThirdBean;

@Configuration
@ComponentScan("ru.vbutkov.spring_ioc_di")
public class JavaBeanConfig {

    @Bean
    public FirstBean firstBean() {
        return new FirstBean(secondBean());
    }

    @Bean
    @Scope("prototype")
    public SecondBean secondBean() {
        return new SecondBean();
    }

    @Bean
    public ThirdBean thirdBean() {
        return new ThirdBean(secondBean());
    }
}
