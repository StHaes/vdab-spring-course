package com.realdolmen.spring.domain;

/**
 * Created by jeansmits on 10/06/15.
 */
public class Kibble extends Food{
    private String name = "Kibble";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
