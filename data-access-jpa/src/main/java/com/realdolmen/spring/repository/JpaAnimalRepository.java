package com.realdolmen.spring.repository;

import com.realdolmen.spring.domain.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
@ComponentScan
public class JpaAnimalRepository implements AnimalRepository{
    // TODO: create a transactional repository bean from this class

    // TODO: inject a persistence context

    @Override
    @Autowired
    public void create(Animal animal) {

    }

    @Override
    public Animal findById(int id) {
        return null;
    }

    @Override
    public List<Animal> findAll() {
        return null;
    }

    @Override
    public void update(Animal animal) {

    }

    @Override
    public void remove(Animal animal) {

    }

    // TODO: implement AnimalRepository

    // TODO: implement findById()

    // TODO: implement findAll()

    // TODO: implement create()

    // TODO: implement update()

    // TODO: implement delete()
}
