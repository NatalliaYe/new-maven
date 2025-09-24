package org.example;

import java.util.Scanner;

public class AnotherHomework4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] channels = {"Movies", "Music", "Cartoons", "News", "Documentary"};

        System.out.println("Доступные каналы: от 1 до" + channels.length);

        while (true) {
            System.out.print("Введите номер канала (0 для выхода): ");

            if (scanner.hasNextInt()) {
                int channelNumber = scanner.nextInt();

                if (channelNumber == 0) {
                    System.out.println("Программа завершена.");
                    break;
                } else if (channelNumber >= 1 && channelNumber <= channels.length) {
                    String channelName = channels[channelNumber - 1];
                    System.out.println("Выбран канал: " + channelName);
                    System.out.println("Введите номер канала еще раз");
                } else {
                    System.out.println("Канала с номером " + channelNumber + " не существует.Введите номер канала еще раз.");
                }
            } else {
                System.out.println("Ошибка: введите число!");
            }
        }
    }
}