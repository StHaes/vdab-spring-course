package com.realdolmen.spring.domain;

/**
 * Created by jeansmits on 9/06/15.
 */
public class MeatyFood extends Food {
    private String name = "Meatyfood";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
