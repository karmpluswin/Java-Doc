package com.backend.hw;

import java.util.Scanner;

public class Hw08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int  rev = 0;

        int temp = Math.abs(num);

        while(temp != 0){
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }

        System.out.println(num + " is palindrome number: " + (rev == Math.abs(num)));

        sc.close();
    }
}
