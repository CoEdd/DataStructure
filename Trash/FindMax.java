package Trash;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        // Creating arrays of different types
        Integer[] integers = {1, 2, 3};
        String[] strings = {"red", "green", "blue"};
        @SuppressWarnings("unchecked")
        Circle<Double>[] circles = new Circle[] {
            new Circle<>(3.0),
            new Circle<>(2.9),
            new Circle<>(5.9)
        };

        // Invoking the max method
        System.out.println("Max integer: " + max(integers));
        System.out.println("Max string: " + max(strings));
        System.out.println("Max circle radius: " + maxCircleRadius(circles));

        // Printing the arrays
        System.out.println("Integers array: " + Arrays.toString(integers));
        System.out.println("Strings array: " + Arrays.toString(strings));
        System.out.println("Circles array: " + Arrays.toString(circles));
    }

    // Generic method to find max value in an array
    public static <E extends Comparable<E>> E max(E[] list) {
        if (list == null || list.length == 0) {
            return null;
        }
        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max = list[i];
            }
        }
        return max;
    }

    // Method to find max circle radius
    public static double maxCircleRadius(Circle<Double>[] circles) {
        if (circles == null || circles.length == 0) {
            return 0.0;
        }
        double maxRadius = circles[0].getRadius();
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getRadius() > maxRadius) {
                maxRadius = circles[i].getRadius();
            }
        }
        return maxRadius;
    }
}

// Circle class implementing Comparable interface
class Circle<T extends Comparable<T>> {
    private T radius;

    // Constructor
    public Circle(T radius) {
        this.radius = radius;
    }

    // Getter for radius
    public T getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(T radius) {
        this.radius = radius;
    }
}