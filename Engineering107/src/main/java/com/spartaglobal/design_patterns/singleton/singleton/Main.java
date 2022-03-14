package com.spartaglobal.design_patterns.singleton.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample s1 = new SingletonExample().getSingleton();
        SingletonExample s2 = new SingletonExample().getSingleton();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}