package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeansmits on 9/06/15.
 */
public class ZooImpl implements ZooInterface {
    private String name;
    private List<Animal> animals= new ArrayList<>();
    @Override
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void releaseAnimal(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public boolean acceptVisitor(Visitor visitor) {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int countAnimals() {
        return animals.size();
    }

    public ZooImpl(String name) {
        this.name = name;
    }
}
