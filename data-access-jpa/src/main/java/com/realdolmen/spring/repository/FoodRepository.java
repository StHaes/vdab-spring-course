package com.realdolmen.spring.repository;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FoodRepository {
    Food findFoodById(int id);
    List<Food> findAllFood();
    List<Food> findFoodForAnimalType(Animal.Type type);
    void removeFood(Food food);
}
