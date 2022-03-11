package com.spartaglobal.Fibonacci;

public class Fibonacci {
    static int firstNum = 0;
    static int secondNum = 1;
    static int thirdNum = 0;


    public static void main(String[] args) {
        int count = 5;
        System.out.println(firstNum);
        System.out.println(secondNum);

        printFib(count);
    }

    public static void printFib(int count){

        if(count > 0){
            thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;

            System.out.println(""+thirdNum);
            printFib(count-1);
        }

    }

}


