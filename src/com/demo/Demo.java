package com.demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();

//        switch (id) {
//            case 1 -> System.out.println("Hello One");
//            case 2 -> System.out.println("Hello Two");
//            case 3 -> System.out.println("Hello Three");
//            case 4 -> System.out.println("Hello Four");
//            default -> System.out.println("Please enter valid number");
//        }

        switch (id) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekly");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Enter a valid id");
        }
    }
}
