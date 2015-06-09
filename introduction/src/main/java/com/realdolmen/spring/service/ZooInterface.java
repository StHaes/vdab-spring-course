package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Visitor;

/**
 * Created by jeansmits on 9/06/15.
 */
public interface ZooInterface {
    void addAnimal(Animal animal);
    void releaseAnimal(Animal animal);
    boolean acceptVisitor(Visitor visitor);
    String getName();
    int countAnimals();
}
