package com.trainings.design.patterns.creational.builder;

public class SmallOnionPizza extends VegPizza {

    @Override
    public float price() {
        return 120.0f;
    }

    @Override
    public String name() {
    
        return  "Onion Pizza";
    
    }

    @Override
    public String size() {
       return  "Small Size";
    }
    
}
