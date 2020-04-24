package com.lambdaschool.javacountries;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/population")
public class populationController {

    @GetMapping(value = "/size/{people}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getByMinPopulationSize(@PathVariable long people) {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getByMinPopulationSize(people), HttpStatus.OK);
    }

    @GetMapping(value = "/size/min", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getMinPopulation() {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getMinPopulation(), HttpStatus.OK);
    }

    @GetMapping(value = "/size/max", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getMaxPopulation() {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getMaxPopulation(), HttpStatus.OK);
    }

}