package org.example;

import org.example.furniture.ClothesCommode;
import org.example.furniture.ShoesCommode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static double height;
    public static double length;

    public static void newMain() {
        Commode clothesCommode = new Commode();
        Commode shoesCommode = new Commode();
        System.out.println("Just random information");

        clothesCommode.getContent();
        System.out.println("CommodeType- clothesCommode." + " Number of drawers is 4. ");

        clothesCommode.getSquare();
        clothesCommode.color = "White";
        clothesCommode.height = 8.1;
        clothesCommode.width = 6.5;
        clothesCommode.length = 0;
        double area = 2 * (clothesCommode.height * clothesCommode.width + clothesCommode.length * clothesCommode.height
                + clothesCommode.length * clothesCommode.width);
        System.out.printf("Commode square: %.2f",area);


        Clothes dress = new Clothes();
        dress.types = "Skirts";
        dress.number = 4;
        clothesCommode.putInClothes(dress);

        System.out.println(clothesCommode.getObjectInfo());


        ShoesCommode NewOne = new ShoesCommode();
        NewOne.store("shoes");
        NewOne.keepShoes();

        ClothesCommode NewTwo = new ClothesCommode();
        NewTwo.keepClothes();

    }
    public static int divide (int height, int length) {
        Main.height = height;
        Main.length = length;
        return height / length;
    }

    public static int sum (int...numbers) {
        int height = 4;
        int length =5;
        return  height + length;
    }

    public static String MyInfo() {
        MyInfo randomInfo = new MyInfo();
        randomInfo.getObjectInfo();
        System.out.println(randomInfo.getObjectInfo());
        return null;
    }


    static class randomCommode {
        double height;
        double width;
        String color;

        public static void main(String[] args) throws NumberFormatException, FileNotFoundException {
            randomCommode clothesCommode = new randomCommode();
            clothesCommode.color = "White";
            clothesCommode.height = 8.1;
            clothesCommode.width = 6.5;


            randomCommode shoesCommode = new randomCommode();
            shoesCommode.color = "Brown";
            shoesCommode.height = 7.7;
            shoesCommode.width = 5.5;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Выберите вариант ответа:");
            System.out.println("1. Получить информацию о существующем объекте");
            System.out.println("2. Создать новый объект");

            int mainChoice = Integer.parseInt(scanner.nextLine());
            randomCommode selectedCommode = null;

            if (mainChoice == 1) {
                System.out.println("Какая вам нужна мебель?");
                System.out.println("Выберите вариант: ");
                System.out.println("1. clothesCommode");
                System.out.println("2. shoesCommode");

                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 1) {
                    selectedCommode = clothesCommode;
                } else {
                    selectedCommode = shoesCommode;
                }

                System.out.println("Какие свойства должны быть у комода?");
                System.out.println("1. height");
                System.out.println("2. width");
                System.out.println("3. color");
                System.out.println("Введите номера свойств через пробел: ");

                String propertiesInput = scanner.nextLine();
                String[] properties = propertiesInput.split(" ");

                System.out.println("Выбранный объект:");
                for (String prop : properties) {
                    switch (prop.trim()) {
                        case "1":
                            System.out.println(" height = " + selectedCommode.height);
                            break;
                        case "2":
                            System.out.println(" width = " + selectedCommode.width);
                            break;
                        case "3":
                            System.out.println(" color = " + selectedCommode.color);
                            break;
                        default:
                            System.out.println("- Неизвестное свойство: " + prop);
                    }
                }
            } else if (mainChoice == 2) {
                selectedCommode = new randomCommode();

                System.out.println("Введите height:");
                selectedCommode.height = Double.parseDouble(scanner.nextLine());

                System.out.println("Введите width:");
                selectedCommode.width = Double.parseDouble(scanner.nextLine());

                System.out.println("Введите color:");
                selectedCommode.color = scanner.nextLine();

                System.out.println("Новый объект создан:");
                System.out.println("height = " + selectedCommode.height);
                System.out.println("width = " + selectedCommode.width);
                System.out.println("color = " + selectedCommode.color);
            } else {
                System.out.println("Неверный выбор");
                return;
            }

            try (FileWriter testWriter = new FileWriter("D:\\newTestFile4.txt", false)) {
                testWriter.write(selectedCommode.height + "\n" + selectedCommode.width + "\n" +
                        selectedCommode.color + "\n");
                System.out.println("Объект успешно записан в файл.");
                testWriter.close();
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл.  ");
            }

            // Чтение объектов из файла
            ArrayList<randomCommode> commodes = new ArrayList<>();
            File testFile = new File("D:\\newTestFile4.txt");

            try (Scanner fileScanner = new Scanner(testFile)) {
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] parts = line.split(",");

                    if (parts.length == 3) {
                        randomCommode commodeFromFile = new randomCommode();
                        commodeFromFile.height = Double.parseDouble(parts[0]);
                        commodeFromFile.width = Double.parseDouble(parts[1]);
                        commodeFromFile.color = parts[2];
                        commodes.add(commodeFromFile);
                    }
                }

            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден. ");
            }
        }

        public String getObjectInfo() {
            return "Commode: color=" + color + ", height=" + height + ", width=" + width;
        }

        public void setCommodeDimensions(double v, double v1, double v2, double v3) {
        }

        public void putInClothes(Clothes dress) {
        }
    }
}
