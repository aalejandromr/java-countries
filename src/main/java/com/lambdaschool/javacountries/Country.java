package com.lambdaschool.javacountries;

public class Country {
    private String name;
    private int population;
    private long massSize;
    private double medianAge;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public long getMassSize() {
        return massSize;
    }

    public void setMassSize(long massSize) {
        this.massSize = massSize;
    }

    public double getMedianAge() {
        return medianAge;
    }

    public void setMedianAge(double medianAge) {
        this.medianAge = medianAge;
    }

    public Country(String name, int population, long massSize, double medianAge) {
        this.name = name;
        this.population = population;
        this.massSize = massSize;
        this.medianAge = medianAge;
    }
}
