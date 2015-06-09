package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Bear;
import com.realdolmen.spring.domain.MeatyFood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jeansmits on 9/06/15.
 */
@Component
@ComponentScan
public class FoodDistributionServiceImpl implements FoodDistributionService {
    @Autowired
    private FoodRepository f;

    @Override
    public void feedAnimalsByType(List<Animal> animals) {
        for (Animal animal : animals) {
            f.findFoodForAnimalType(animal.getClass());
            System.out.println("Feeding delicious " + f.findFoodForAnimalType(animal.getClass()).toString() +" to " + animal.getName());
        }


    }
}
