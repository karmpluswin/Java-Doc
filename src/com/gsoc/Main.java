package com.gsoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File myfile = new File("D:/krish/data.txt");

            Scanner sc = new Scanner(myfile);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file was not found.");
        }
    }
}