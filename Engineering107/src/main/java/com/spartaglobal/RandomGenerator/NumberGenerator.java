package com.spartaglobal.RandomGenerator;

import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            System.out.println(random.nextInt(10)+ 1);//0 - 9
            //random.nextInt(size * 10) + 1;

        }
    }
}
