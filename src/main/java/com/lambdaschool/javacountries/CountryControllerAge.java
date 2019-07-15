package com.lambdaschool.javacountries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/age")
public class CountryControllerAge {
    @GetMapping("/age/{age}")
    public ResponseEntity<?> getCountriesByMedianAge(@PathVariable int age)
    {
        return new ResponseEntity<>( JavaCountriesApplication.countryList.getCountriesByMedianAge(c1 -> c1.getMedianAge() >= age) , HttpStatus.OK);
    }
}
