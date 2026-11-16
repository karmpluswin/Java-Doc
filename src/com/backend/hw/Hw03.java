package com.backend.hw;

import java.util.Scanner;

public class Hw03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Price: ");
        int price = sc.nextInt();
        System.out.print("Enter a Rate: ");
        int rate = sc.nextInt();
        System.out.print("Enter a Time: ");
        int time = sc.nextInt();

        int SI = (price * rate * time) / 100;

        System.out.printf("SI: %d", SI);

        sc.close();
    }
}
