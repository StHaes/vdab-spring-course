package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;

import java.util.List;

/**
 * Created by jeansmits on 9/06/15.
 */
public interface FoodDistributionService {
    public void feedAnimalsByType(List<Animal> animals);
}
