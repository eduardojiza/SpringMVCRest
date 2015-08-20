package com.whileapp.springmvcrest.controllers.rest;

import com.whileapp.springmvcrest.domain.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class AppRestController {
    private static final List<Person> people = new ArrayList<Person>();
    
    static{
        people.add(new Person("Eduardo", "Jimenez", 23));
        people.add(new Person("Luis", "Carmona", 24));
        people.add(new Person("Aaron", "Ramirez", 25));
        people.add(new Person("Pedro", "Navajas", 26));
        people.add(new Person("Maria", "Nicolasa", 27));
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Person> getPeople() {
		return people;
	}
}
