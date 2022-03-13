package com.spartaglobal.Celsius;

import java.util.Objects;

public class Celsius {

    public static void main(String[] args) {
        double celsius = 0;
        CelsiusToFahrenheit(celsius);


    }

    public static double CelsiusToFahrenheit(double i){
        double celsius = i;
        double fahrenheit = 0;

        if(Objects.isNull(celsius)) {
            System.out.println("celsius cannot be empty");
            return celsius;
        }else {

            fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println(fahrenheit);
            return fahrenheit;
        }
    }
}
