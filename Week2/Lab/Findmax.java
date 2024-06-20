package Week2.Lab;


class Circle implements Comparable<Circle> {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Implementing compareTo method from Comparable interface
    public int compareTo(Circle other) {
        // Compare circles based on their radius
        return Double.compare(this.radius, other.radius);
    }
}


public class Findmax {

    // Generic method to find the maximum value in an array
    public static <E extends Comparable<E>> E max(E[] list) {
        if (list == null || list.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null.");
        }

        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max = list[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Integer array example
        Integer[] intArray = {1, 2, 3};
        System.out.println("Max of integers: " + max(intArray)); // Output: 3

        // String array example
        String[] strArray = {"red", "green", "blue"};
        System.out.println("Max of strings: " + max(strArray)); // Output: red (based on lexicographical order)

        // Circle array example
        Circle[] circleArray = {new Circle(3.0), new Circle(2.9), new Circle(5.9)};
        Circle maxCircle = max(circleArray);
        System.out.println("Max of circles: Radius = " + maxCircle.getRadius()); // Output: Radius = 5.9
    }
}

