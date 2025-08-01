package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryNotFoundException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = (List<Country>) context.getBean("countryList");

        for (Country c : countries) {
            if (c.getCode().equalsIgnoreCase(code)) {
                return c;
            }
        }

        // If not found, throw custom exception
        throw new CountryNotFoundException("Country not found with code: " + code);
    }
}
