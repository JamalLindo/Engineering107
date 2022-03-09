package com.spartaglobal.Animal;

public class Dog extends Animal implements Speaker{

    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    public void speak(String owner){
        System.out.println(this.getName() + " is speaking to " + owner);
    }

    @Override
    public String doSomething(String activity) {
        return "I am doing " + activity;
    }
}
