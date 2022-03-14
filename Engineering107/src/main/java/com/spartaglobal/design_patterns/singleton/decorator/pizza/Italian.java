package com.spartaglobal.design_patterns.singleton.decorator.pizza;

public class Italian extends Pizza {
    @Override
    public String getDescription() {
        return "Italian Pizza";
    }

    @Override
    public double getCost() {
        return 20;
    }
}
