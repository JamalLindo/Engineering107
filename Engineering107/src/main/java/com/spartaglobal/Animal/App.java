package com.spartaglobal.Animal;

public class App {
    public static void main(String[] args) {
        Cat felix = new Cat("Felix","Maine Coon",7);
        Dog peter = new Dog("Peter" , "poodle", 3);

        felix.setAge(-7);
        System.out.println(felix);
        felix.speak();

        //method overloading
        peter.speak();

        System.out.println(Integer.MAX_VALUE  ); // static
        //Utility classes - only static methods

    }
}
