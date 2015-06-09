package com.realdolmen.spring;

import com.realdolmen.spring.config.ZooConfig;
import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.service.ZooImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by cda5732 on 25/03/2015.
 */
@SpringBootApplication
public class ApplicationConfiguration {
    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(ApplicationConfiguration.class);
        ConfigurableApplicationContext context = SpringApplication.run(ZooConfig.class);
        // TODO Fetch the ZooImpl class and print out its name and its animal count
        // TODO Test your code by running this main

        ZooImpl zoo = context.getBean(ZooImpl.class);
        Animal tiger = context.getBean(Animal.class);
        zoo.addAnimal(tiger);
        System.out.println(zoo.getName());
        System.out.println(zoo.countAnimals());

    }
}
