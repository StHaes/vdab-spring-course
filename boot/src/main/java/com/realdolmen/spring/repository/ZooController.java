package com.realdolmen.spring.repository;

import com.realdolmen.spring.domain.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/")
public class ZooController {
    @Autowired private AnimalRepository animalRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String animals(Map<String, Object> model) {
        model.put("animals", animalRepository.findAll());
        return "zoo";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createAnimal(Animal animal) {
        animalRepository.create(animal);
        return "redirect:/";
    }
}
