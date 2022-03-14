package com.spartaglobal.design_patterns.singleton.decorator.pizza.sides;

import com.spartaglobal.design_patterns.singleton.decorator.pizza.Pizza;

public abstract class Sides extends Pizza {
    protected Pizza pizza;

    public Sides(Pizza pizza){
        this.pizza = pizza;
    }

    public abstract String getDescription();
}
