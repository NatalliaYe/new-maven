package org.example.furniture;

public class ShoesCommode extends Furniture {

    private double height;
    private double width;
    private String color;

    public ShoesCommode() {
        this.types = "ShoesCommode";
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public String toString() {
        return "Commode" + "types are" + types + ",height is " + height + ",width is" + width;
    }

    public void keepShoes() {
        System.out.println(" I keep shoes.");
    }

}