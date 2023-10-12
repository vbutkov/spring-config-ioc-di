package ru.vbutkov.spring_ioc_di.configure.groovy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:app-config.groovy")
@SpringBootApplication
public class SpringGroovyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGroovyApplication.class, args);
    }

}
