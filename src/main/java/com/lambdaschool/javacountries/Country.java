package com.lambdaschool.javacountries;

import java.util.concurrent.atomic.AtomicLong;

public class Country {
    
    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String name;
    private long population;
    private long landMass;
    private int medianAge;

    public Country(String name, long population, long landMass, int medianAge) {
        id = counter.incrementAndGet();
        this.name = name;
        this.population = population;
        this.landMass = landMass;
        this.medianAge = medianAge;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the population
     */
    public long getPopulation() {
        return population;
    }

    /**
     * @param population the population to set
     */
    public void setPopulation(long population) {
        this.population = population;
    }

    /**
     * @return the landMass
     */
    public long getLandMass() {
        return landMass;
    }

    /**
     * @param landMass the landMass to set
     */
    public void setLandMass(long landMass) {
        this.landMass = landMass;
    }

    /**
     * @return the medianAge
     */
    public int getMedianAge() {
        return medianAge;
    }

    /**
     * @param medianAge the medianAge to set
     */
    public void setMedianAge(int medianAge) {
        this.medianAge = medianAge;
    }

}