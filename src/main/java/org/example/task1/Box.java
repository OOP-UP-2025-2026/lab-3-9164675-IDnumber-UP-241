package org.example.task1;

public class Box {
    private double length;
    private double width;
    private double height;

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Довжина повинна бути більше 0.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Ширина повинна бути більше 0.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Висота повинна бути більше 0.");
        }
        this.height = height;
    }

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double getLateralSurfaceArea() {
        return 2 * height * (length + width);
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return String.format("Box{length=%.3f, width=%.3f, height=%.3f}", length, width, height);
    }

}
