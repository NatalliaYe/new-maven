package org.example;

import java.util.Scanner;

public class AnotherHomework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your score");
        int score = scanner.nextInt();

        while (true) {
            System.out.println("Please, enter your score (0-100): ");
            score = scanner.nextInt();

            if (score >= 0 && score <= 100) {
                break;
            } else {
                System.out.println("Incorrect value entered. Please, enter a correct value.");
            }
        }

        if (score >= 90) {
            System.out.println("Your grade is A!");
        } else if (score >= 80) {
            System.out.println("Your grade is B!");
        } else if (score >= 70) {
            System.out.println("Your grade is C!");
        } else if (score >= 60) {
            System.out.println("Your grade is D!");
        } else if (score >= 50) {
            System.out.println("Your grade is E!");

        } else {
            System.out.println("You `ve failed");
        }
    }
}