package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jeansmits on 9/06/15.
 */
public class FoodRepositoryImpl implements FoodRepository {
    private Map<String, Food> feed = new HashMap<>();
    @Override
    public void addFoodForAnimalType(Class<? extends Animal> clazz, Food food) {
        feed.put(clazz.getName(),food);

    }

    @Override
    public Food findFoodForAnimalType(Class<? extends Animal> clazz) {
        System.out.println("----------");
        System.out.println("Found food for " + clazz.getSimpleName());
        System.out.println("----------");
        return feed.get(clazz.getName());

    }

    public Map<String, Food> getFeed() {
        return feed;
    }
}
