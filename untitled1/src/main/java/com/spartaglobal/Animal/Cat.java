package com.spartaglobal.Animal;
//Abstraction -  Hides implementation  details
//Encapsulation - Classes hides information
//Polymorphism - "poly = many, morpho = form" overriding and overloading
//Inheritance - Child classes from an abstract parent.

//WHY - Removes code duplication
// breaks program down


public class Cat extends Animal{ //state behaviour.

    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    //method overriding
    public void speak(){
        System.out.println("Purrr");
    }


}
