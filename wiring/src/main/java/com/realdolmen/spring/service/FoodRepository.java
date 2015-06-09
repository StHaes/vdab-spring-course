package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;
import org.springframework.stereotype.Component;

/**
 * Created by jeansmits on 9/06/15.
 */
@Component
public interface FoodRepository {
    public void addFoodForAnimalType(Class<? extends Animal> clazz,Food food);
    public Food findFoodForAnimalType(Class<? extends Animal> clazz);
}
