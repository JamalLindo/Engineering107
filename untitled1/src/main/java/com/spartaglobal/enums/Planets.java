package com.spartaglobal.enums;

import java.util.Arrays;

public enum Planets {
    //Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune & Pluto
    MERCURY  ("This is Mercury"),
    VENUS ("This is Venus"),
    EARTH ("This is Earth"),
    MARS ("This is Mars"),
    JUPITER ("This is Jupiter"),
    SATURN ("This is Saturn"),
    URANUS ("This is Uranus"),
    NEPTUNE ("This is Neptune"),
    PLUTO ("This is Pluto");

    Planets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public static void main(String[] args) {
        Planets planet1 = Planets.MERCURY;
        System.out.println(planet1);

        System.out.println(Arrays.toString(Planets.values()));

    }


}
