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
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getByName(), HttpStatus.OK);
    }

    @GetMapping(value = "/start/{letter}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getByNameStartsWith(@PathVariable String letter) {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getByNameStartsWith(letter), HttpStatus.OK);
    }

    @GetMapping(value = "/size/{number}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getByMinNameLength(@PathVariable int number) {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getByMinNameLength(number), HttpStatus.OK);
    }

}