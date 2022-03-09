package com.spartaglobal.enums;

public enum Days {
    MONDAY("Today is monday"),
    TUESDAY("Today is Tuesday"),
    WEDNESDAY("Today is Wednesday"),
    THURSDAY("Today is Thursday"),
    FRIDAY("Today is Friday"),
    SATURDAY("Today is Saturday"),
    SUNDAY("Today is Sunday");

    Days(String name) {
        this.name = name;
    }

    private String name;


    public static void main(String[] args) {
        // Dog dog = new Dog("Jeffery");
        Days myDayObject = Days.WEDNESDAY;
        Days myDayObject2 = Days.THURSDAY;


        System.out.println(myDayObject);
    }
}
