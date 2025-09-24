package org.example;

import java.util.Scanner;

public class AnotherHomework2 {
    public static void main (String[] args) {
        String userInput = "";
        Scanner scanner = new Scanner(System.in);

        while(!userInput.equals("Exit")) {
            System.out.print("Please enter something: ");
            userInput = scanner.nextLine();
            if (!userInput.equals("Exit")) {
                System.out.println("You`ve entered: "+ userInput);
            }
        }
        System.out.println("Goodbye");
    }
}

