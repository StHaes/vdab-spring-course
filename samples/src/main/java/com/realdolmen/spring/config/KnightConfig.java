package com.realdolmen.spring.config;

import com.realdolmen.spring.aop.Minstrel;
import com.realdolmen.spring.knights.BraveKnight;
import com.realdolmen.spring.knights.Knight;
import com.realdolmen.spring.knights.Quest;
import com.realdolmen.spring.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class KnightConfig {
    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Minstrel minstrel() {
        return new Minstrel(System.out);
    }
}
