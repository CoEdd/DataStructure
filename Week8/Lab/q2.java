package Week8.Lab;

import java.util.PriorityQueue;

public class q2 {
    public static void main(String[] args) {
        
        // Initialize the priority queues
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        PriorityQueue<String> pq2 = new PriorityQueue<>();

        // Add elements to pq1
        pq1.add("George");
        pq1.add("Jim");
        pq1.add("John");
        pq1.add("Blake");
        pq1.add("Kevin");
        pq1.add("Michael");

        // Add elements to pq2
        pq2.add("George");
        pq2.add("Katie");
        pq2.add("Kevin");
        pq2.add("Michelle");
        pq2.add("Ryan");

        // Find the union
        PriorityQueue<String> union = new PriorityQueue<>(pq1);
        for (String s : pq2) {
            if (!union.contains(s)) {
                union.add(s);
            }
        }

        // Find the difference (elements in pq1 but not in pq2)
        PriorityQueue<String> difference = new PriorityQueue<>(pq1);
        for (String s : pq2) {
            difference.remove(s);
        }

        // Find the intersection
        PriorityQueue<String> intersection = new PriorityQueue<>();
        for (String s : pq1) {
            if (pq2.contains(s)) {
                intersection.add(s);
            }
        }

        System.out.println("\nList 1 = " + pq1);
        System.out.println("List 2 = " + pq2);
        System.out.println("Union : " + union);
        System.out.println("Intersection : " + intersection);
        System.out.println("Difference = " + difference);


    }
}
