package com.backend.hw;

import java.util.Scanner;

public class Hw04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a num2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter a method symbol: ");
        char symbol = sc.next().charAt(0);

        if (symbol == '+') {
            int sum = num1 + num2;
            System.out.printf("Sum is: %d", sum);
        } else if (symbol == '-') {
            int sub = num1 - num2;
            System.out.printf("Sub is: %d", sub);
        } else if (symbol == '*') {
            int mul = num1 * num2;
            System.out.printf("Mul is: %d", mul);
        } else if (symbol == '/') {
            int div = num1 / num2;
            System.out.printf("Div is: %d", div);
        } else {
            System.out.println("Enter symbol is wrong!");
        }

        sc.close();
    }
}
