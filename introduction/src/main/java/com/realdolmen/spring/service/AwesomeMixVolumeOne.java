package com.realdolmen.spring.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by jeansmits on 9/06/15.
 */
@Service
public class AwesomeMixVolumeOne implements Cassette {
    @Override
    public void play() {
        System.out.println("---------------");
        System.out.println("Playing the best song in the world");
        System.out.println("---------------");
    }
}
