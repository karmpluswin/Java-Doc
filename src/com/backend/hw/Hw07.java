package com.backend.hw;

import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.

public class Hw07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b);

        int temp = 3;

        while (temp <= num) {
            int next = a + b;
            a = b;
            b = next;

            System.out.print(" " + next);

            temp += 1;
        }

        sc.close();
    }
}
