package com.backend.hw;

import java.util.Scanner;

public class Hw02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.printf("Good morning %s!", name);

        sc.close();
    }
}
