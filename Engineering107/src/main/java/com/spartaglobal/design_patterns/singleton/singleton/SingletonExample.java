package com.spartaglobal.design_patterns.singleton.singleton;


//default constructor - no parameters
public class SingletonExample {
    private static final SingletonExample singleton = new SingletonExample();

    SingletonExample(){}

    public static SingletonExample getSingleton(){
        return singleton;
    }

}
