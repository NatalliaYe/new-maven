package org.example;

public class MyInfo {
       Commode material;
       Commode color;
       Commode height;
       Commode square;


        public String getObjectInfo() {
            return String.format("Commode material: %s\nCommode  color: %s\nCommode height: %s\nCommode square: %f",
                    material, color, height, square);
        }


    }
