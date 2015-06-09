package com.realdolmen.spring.domain;

/**
 * Created by jeansmits on 9/06/15.
 */
public class VeggieFood extends Food {
    private String name = "Veggiefood";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
