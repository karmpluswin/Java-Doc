package com.backend.hw;

import java.util.Scanner;

public class Hw06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a US-Dollar: ");
        float usd = sc.nextFloat();

        float inr = usd * 94.24f;

        System.out.printf("Conversation in IND-Rupees: %.2f", inr);
    }
}
