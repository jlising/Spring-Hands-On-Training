package com.trainings.design.patterns.creational.builder;

public class LargeOnionPizza extends  VegPizza{
    
    @Override
    public float price() {
        return 180.0f;
    }

    @Override
    public String name() {
    
        return  "Onion Pizza";
    
    }

    @Override
    public String size() {
       return  "Large size";
    }
}
