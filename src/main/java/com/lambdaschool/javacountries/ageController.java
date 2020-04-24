package com.lambdaschool.javacountries;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/age")
public class ageController {

    @GetMapping(value = "/age/{age}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getByMinPopulationSize(@PathVariable int age) {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getByMinMedianAge(age), HttpStatus.OK);
    }

    @GetMapping(value = "/min", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getMinMedianAge() {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getMinMedianAge(), HttpStatus.OK);
    }

    @GetMapping(value = "/max", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getMaxMedianAge() {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getMaxMedianAge(), HttpStatus.OK);
    }

    @GetMapping(value = "/median", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getMedianMedianAge() {
        return new ResponseEntity<>(JavaCountriesApplication.countryList.getMedianMedianAge(), HttpStatus.OK);
    }

}