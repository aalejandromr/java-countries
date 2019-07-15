package com.lambdaschool.javacountries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.*;

@RestController
@RequestMapping("/names")
public class CountryController {

    @GetMapping(value = "/all")
    public ResponseEntity<?> getAllContriesSorted() {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getCountries(), HttpStatus.OK);
    }

    @GetMapping(value = "/start/{letter}")
    public ResponseEntity<?> getCountriesStartingWith(@PathVariable String letter) {
        Pattern pattern = Pattern.compile("^" + letter, Pattern.CASE_INSENSITIVE);
        //        System.out.println(pattern.matcher("El").lookingAt());
        //        System.out.println(pattern.matcher("El").matches());
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getCountryWithLetterBeggingWith(o1 -> pattern.matcher(o1.getName()).lookingAt()), HttpStatus.OK);
    }

}
