package ru.vbutkov.spring_ioc_di.configure.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:app-config.xml")
@SpringBootApplication
public class SpringXMLApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringXMLApplication.class, args);
    }

}
