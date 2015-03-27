package com.realdolmen.spring.domain;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class Animal {
    public enum Type {
        chimp, lion, tiger, elephant, hippo, panda
    }

    private String name;
    private Type type;

    public Animal() {
    }

    public Animal(String name, Type type) {
        setName(name);
        setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Objects.requireNonNull(name, "Animal name is required");
        this.name = name;
    }

    public Animal.Type getType() {
        return type;
    }

    public void setType(Type type) {
        Objects.requireNonNull(type, "Animal type is required");
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        Animal other = (Animal)o;
        return this.name.equals(other.name) && this.type == other.type;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * type.hashCode();
    }
}
