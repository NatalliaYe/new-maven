package org.example;

public class Commode {
    String material;
    String color;
    public double height;
    public double width;
    public double length;
    double square;
    String content;
    int drawers;
    Clothes information = new Clothes();


    public String getObjectInfo() {
        String content = getContent();
        return String.format("Commode material: %s\nCommode  color: %s\nCommode height: %s\nCommode square: %f",
                material, color, height, square);
    }

    public  Clothes getInformation (String types, int number) {
        return information;
    }

    public double getSquare() {
        return square;
    }

    public void putInClothes(Clothes newContent) {
        this.information.types =  newContent.types;
        this.information.number = newContent.number;
    }

    public String getContent() {
        return String.format("Content type: %s\nContent number: %s", information.types,
                information.number);
    }

    public void setCommodeDimensions(double height, double width, double length, double square) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.square = 2 * (height * width + length * height + length * width);
    }

    public int getDrawers() {
        return drawers;
    }
    public int setDrawers(int drawers) {
        this.drawers = drawers;
        return drawers;
    }
    public double getRandomInfo() {
        return width/length;
    }
}

