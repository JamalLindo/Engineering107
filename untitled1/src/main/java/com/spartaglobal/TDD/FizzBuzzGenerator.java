package com.spartaglobal.TDD;

public class FizzBuzzGenerator {
    public static String getFizzBuzzValue(int number) {
        if(number % 5 ==0 && number % 7 ==0){
            return "Fizz Buzz";
        }else if( number % 5 == 0){
            return "Fizz";
        } else if (number % 7 ==0){
            return  "Buzz";
        }else {
            return String.valueOf(number);
        }
    }
}
