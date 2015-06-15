package com.realdolmen.spring.repository;

import com.realdolmen.spring.domain.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
@Transactional
public class JpaAnimalRepository implements AnimalRepository{
    // TODO: create a transactional repository bean from this class

    // TODO: inject a persistence context
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void create(Animal animal) {
        entityManager.persist(animal);
    }

    @Override
    public Animal findById(int id) {
        return entityManager.find(Animal.class,id);
    }

    @Override
    public List<Animal> findAll() {
        return entityManager.createQuery("select a from Animal a",Animal.class).getResultList();
    }

    @Override
    public void update(Animal animal) {
        entityManager.merge(animal);
    }

    @Override
    public void remove(Animal animal) {
        entityManager.remove(animal);
    }

    // TODO: implement AnimalRepository

    // TODO: implement findById()

    // TODO: implement findAll()

    // TODO: implement create()

    // TODO: implement update()

    // TODO: implement delete()
}
