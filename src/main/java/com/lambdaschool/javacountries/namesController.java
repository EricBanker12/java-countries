package com.lambdaschool.javacountries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/names")
public class namesController {

    @GetMapping(value = "/all", produces = "application/json")
    public ResponseEntity<?> getAllNames() {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getNames(), HttpStatus.OK);
    }

}