package Week6.Lab;

import java.util.ArrayList;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int numDisks = 4;
        ArrayList<Integer> source = new ArrayList<>();
        ArrayList<Integer> auxiliary = new ArrayList<>();
        ArrayList<Integer> destination = new ArrayList<>();

        // Initialize the source rod with disks
        for (int i = numDisks; i > 0; i--) {
            source.add(i);
        }

        // Solve the Tower of Hanoi problem
        solveHanoi(numDisks, source, destination, auxiliary);

        // Print the destination rod to verify the result
        System.out.println("Destination rod: " + destination);
    }

    public static void solveHanoi(int numDisks, ArrayList<Integer> source, ArrayList<Integer> destination, ArrayList<Integer> auxiliary) {
        if (numDisks == 1) {
            moveDisk(source, destination);
        } else {
            solveHanoi(numDisks - 1, source, auxiliary, destination);
            moveDisk(source, destination);
            solveHanoi(numDisks - 1, auxiliary, destination, source);
        }
    }

    public static void moveDisk(ArrayList<Integer> source, ArrayList<Integer> destination) {
        if (!source.isEmpty()) {
            Integer disk = source.remove(source.size() - 1);
            destination.add(disk);
            System.out.println("Move disk " + disk + " from " + getRodName(source) + " to " + getRodName(destination));
        }
    }

    public static String getRodName(ArrayList<Integer> rod) {
        if (rod.isEmpty()) {
            return "empty rod";
        }
        return rod.toString();
    }
}
