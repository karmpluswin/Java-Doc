package com.backend.hw;

import java.util.Scanner;

public class Hw09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int temp = num;
        int temp_sum = 0;
        int digits = (int)Math.log10(num) + 1;

            while(temp > 0) {
            int x =  temp % 10;
            temp_sum = temp_sum + (int)Math.pow(x, digits);
            temp = temp / 10;
        }

        System.out.print(num + " is Armstrong Number: " + (num == temp_sum));

        sc.close();
    }
}
