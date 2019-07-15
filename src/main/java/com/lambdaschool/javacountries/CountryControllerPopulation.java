package com.lambdaschool.javacountries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/population")
public class CountryControllerPopulation {
    @GetMapping("/size/{people}")
    public ResponseEntity<?> getCountriesByPopulation(@PathVariable long people)
    {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getCountriesByPopulation(c1 -> c1.getPopulation() >= people),HttpStatus.OK);
    }

    @GetMapping("/min")
    public ResponseEntity<?> getCountryWithSmallestPopulation()
    {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getCountryWithSmallestPopulation(), HttpStatus.OK);
    }

    @GetMapping("/max")
    public ResponseEntity<?> getCountryWithLargestPopulation()
    {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getCountryWithLargestPopulation(), HttpStatus.OK);
    }

//    @GetMapping("/median")
//    public ResponseEntity<?> getCountryWithMedianAgeOf(@PathVariable int age)
//    {
//
//    }
}
