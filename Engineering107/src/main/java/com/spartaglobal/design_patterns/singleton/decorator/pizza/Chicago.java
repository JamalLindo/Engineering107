package com.spartaglobal.design_patterns.singleton.decorator.pizza;

public class Chicago extends Pizza{
    @Override
    public String getDescription() {
        return "Chicago pizza";
    }

    @Override
    public double getCost() {
        return 30;
    }

}
