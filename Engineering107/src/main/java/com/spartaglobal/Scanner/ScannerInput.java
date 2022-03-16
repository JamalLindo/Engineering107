package com.spartaglobal.Scanner;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// console input
        System.out.print("Enter your name: ");
        String name = scanner.next(); // Type that its collecting - memory
        System.out.println("Hello "+ name);
        scanner.close();// must close scanner when done.
    }
}
