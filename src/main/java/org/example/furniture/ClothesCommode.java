package org.example.furniture;

public class ClothesCommode extends Furniture {
    private double height;
    private double width;
    private String color;

    public void keepClothes() {
        System.out.println("I keep clothes.");
    }

    public ClothesCommode() {
        this.types = "ClothesCommode";
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public String toString() {
        return "Commode" + "types are" + types + ",height is " + height + ",width is" + width;
    }


    @Override
    public void store(String things) {
        System.out.println("Types of things  inside me are: " + things);
    }
}