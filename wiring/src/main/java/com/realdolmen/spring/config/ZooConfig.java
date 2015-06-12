package com.realdolmen.spring.config;

import com.realdolmen.spring.domain.*;
import com.realdolmen.spring.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by cda5732 on 25/03/2015.
 */
@Configuration
@ComponentScan
public class ZooConfig {
    @Bean
    public Zoo zoo() {
        Zoo zoo = new PairiDaiza("Pairi Daiza");
        zoo.addAnimal(new Tiger("Bengal Tiger"));
        zoo.addAnimal(new Elephant("Indian Elephant"));
        zoo.addAnimal(new Bear("Brown Bear"));
        return zoo;
    }
    // TODO Configure the FoodRepository
    @Bean
    @Profile("dev")
    public FoodRepository foodRepository(){
        FoodRepository foodRepository = new FoodRepositoryImpl();
        foodRepository.addFoodForAnimalType(Tiger.class,new MeatyFood());
        foodRepository.addFoodForAnimalType(Bear.class,new MeatyFood());
        foodRepository.addFoodForAnimalType(Elephant.class,new VeggieFood());
        return foodRepository;
    }
    @Bean
    @Profile("test")
    public FoodRepository foodRepositoryTest(){
        FoodRepository foodRepository = new TestFoodRepositoryImpl();
        foodRepository.addFoodForAnimalType(Tiger.class,new Kibble());
        foodRepository.addFoodForAnimalType(Bear.class,new Kibble());
        foodRepository.addFoodForAnimalType(Elephant.class,new Kibble());
        return foodRepository;
    }

}
