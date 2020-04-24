package com.lambdaschool.javacountries;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/names")
public class namesController {

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllNames() {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getNames(), HttpStatus.OK);
    }

    @GetMapping(value = "/start/{letter}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getNamesByFirstLetter(@PathVariable String letter) {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getNamesByFirstLetter(letter), HttpStatus.OK);
    }

    @GetMapping(value = "/size/{number}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getNamesByFirstLetter(@PathVariable int number) {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getNamesByMinLength(number), HttpStatus.OK);
    }

}