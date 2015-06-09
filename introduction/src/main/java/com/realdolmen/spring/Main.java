package com.realdolmen.spring;

import com.realdolmen.spring.service.Cassette;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by jeansmits on 9/06/15.
 */
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CassetteConfig.class);
        context.getBean(Cassette.class).play();
    }
}
