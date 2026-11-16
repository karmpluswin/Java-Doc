package com.backend.hw;

import java.util.Scanner;

public class Hw01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Check Num is even or odd");
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.printf("%d is even", num);
        } else {
            System.out.printf("%d is odd", num);
        }

        sc.close();
    }
}