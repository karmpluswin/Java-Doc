package com.backend.hw;

import java.util.Scanner;

public class Hw05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a num2: ");
        int num2 = sc.nextInt();

        if (!(num1 < num2)) {
            System.out.printf("%d is bigger than %d", num1, num2);
        } else {
            System.out.printf("%d is bigger than %d", num2, num1);
        }
    }
}
