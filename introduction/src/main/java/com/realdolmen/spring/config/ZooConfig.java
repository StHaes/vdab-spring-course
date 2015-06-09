package com.realdolmen.spring.config;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Tiger;
import com.realdolmen.spring.service.ZooImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jeansmits on 9/06/15.
 */
@Configuration
public class ZooConfig {
    @Bean
    public ZooImpl zoo(){
        return new ZooImpl("Barbados Wildlife Reserve");
    }
    @Bean
    public Animal tiger(){
        return new Tiger("Bajheera");
    }
}
