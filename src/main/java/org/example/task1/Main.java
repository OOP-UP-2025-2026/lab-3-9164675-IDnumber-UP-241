package org.example.task1;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(2, 3, 4);
        System.out.println("Площа поверхні: " + box.getSurfaceArea());
        System.out.println("Площа бічної поверхні: " + box.getLateralSurfaceArea());
        System.out.println("Об’єм: " + box.getVolume());
    }
}
