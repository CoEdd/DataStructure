package Week8.Lab;

import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Comparator;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Initialize the priority queue with the given elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] elements = {4, 8, 1, 2, 9, 6, 3, 7};
        for (int element : elements) {
            pq.add(element);
        }

        // toString() - Display all the elements inside this priority queue
        System.out.println("Priority Queue: " + pq);

        // poll() – retrieve and remove the first element in this priority queue
        System.out.println("Polled element: " + pq.poll());
        System.out.println("Priority Queue after poll: " + pq);

        // add() – add new element 5 into the priority queue
        pq.add(5);
        System.out.println("Priority Queue after adding 5: " + pq);

        // toArray() – convert the priority queue into an array and display
        Object[] pqArray = pq.toArray();
        System.out.println("Priority Queue as array: " + Arrays.toString(pqArray));

        // peek() – retrieve the first element in the priority queue
        System.out.println("Peek element: " + pq.peek());

        // contains() – check if the priority queue consists of element “1”
        System.out.println("Contains 1: " + pq.contains(1));

        // size() – get the current size of the priority queue
        System.out.println("Size: " + pq.size());

        // isEmpty() – display while removing the elements in the queue until it is empty
        System.out.print("Removing elements: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();

        // Add elements again to sort in reverse order
        for (int element : elements) {
            pq.add(element);
        }

        // Sort the priority queue in reverse order
        PriorityQueue<Integer> pqReversed = new PriorityQueue<>(Comparator.reverseOrder());
        pqReversed.addAll(pq);

        System.out.print("Priority Queue in reverse order: ");
        while (!pqReversed.isEmpty()) {
            System.out.print(pqReversed.poll() + " ");
        }
        System.out.println();
    }
}
