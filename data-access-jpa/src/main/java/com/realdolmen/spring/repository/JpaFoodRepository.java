package com.realdolmen.spring.repository;


import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;

import java.util.List;

public class JpaFoodRepository implements FoodRepository {
    // TODO: Create a transactional repository bean implementing FoodRepository

    @Override
    public Food findFoodById(int id) {
        return null;
    }

    @Override
    public List<Food> findAllFood() {
        return null;
    }

    @Override
    public List<Food> findFoodForAnimalType(Animal.Type type) {
        return null;
    }

    @Override
    public void removeFood(Food food) {

    }

    // TODO: implement findFoodById()

    // TODO: implement findAllFood()

    // TODO: implement findFoodForAnimalType()

    // TODO: implement removeFood()
}
