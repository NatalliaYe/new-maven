package org.example;

import java.util.Scanner;

public class MainHomework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String thisMyInput = scanner.nextLine();

        String s = "Today is Friday!";
        char c = s.charAt(3);
        int stringLength = s.length();
        boolean stringIsEmpty = s.isEmpty();
        String newText = "Tomorrow is Friday!";
        boolean stringsAreEqual = s.equals(newText);
        String s1 = s.replace('!', '.');
        boolean startsWithOne = s.startsWith("Today");
        boolean endsWithTwo = s.endsWith("friday");
        boolean containsThirdStrangeVariable = s.contains("hi");
        String lowerCaseFirst = s.toLowerCase();
        String upperCaseSecond = s.toUpperCase();
        String cityName = "Vitebsk";
        int houseName = 40;
        String RandomInformation = "";
        String resultFormat = String.format( RandomInformation, cityName, houseName);
        StringBuffer newTestString;
        newTestString = new StringBuffer("Good evening");
        newTestString.append("I like watching");
        newTestString.append("movies.");


        System.out.println("Today is Friday!");
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.isEmpty());
        System.out.println(s.equals(newText));
        System.out.println(s.replace('!', '.'));
        System.out.println(s.startsWith("Today"));
        System.out.println(s.endsWith("friday"));
        System.out.println(s.contains("hi"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(resultFormat);
        System.out.println(newTestString);
        System.out.printf("New information:"+ thisMyInput);

    }
}