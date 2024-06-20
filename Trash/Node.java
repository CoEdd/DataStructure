package Trash;

import Week4.Tuto.AddFirstNode;

public class Node<E> {
    E data;
    AddFirstNode<String> next;
    Node<E> head = null;
    Node<E> tail = null;

    public Node(E data) {
        this.data = data;
        this.next = null;
    }

    public void addLast(E e) {
        if (tail == null) { // no node exists
            head = tail = new Node<>(e);
        } else {
            tail.next = new Node<>(e); // tail.next points to the new Node
            tail = tail.next; // Update tail to the new last node
        }

        System.out.println("Head data: " + head.data);
        System.out.println("Tail data: " + tail.data);
    }

    public static void main(String[] args) {
        // Create node1 with data 'a'
        Node<Character> node1 = new Node<>('a');

        // Create node2 with data 'z'
        Node<Character> node2 = new Node<>('z');

        // Set the next reference of node1 to node2
        node1.next = node2;

        // Create a new node firstNode with data 'x'
        Node<Character> firstNode = new Node<>('x');

        // Set the next reference of firstNode to the current head
        firstNode.next = node1;

        // Add a new node with data 's' at the end of the list
        node2.addLast('s');

        // Access node2 using node1
        System.out.println("Data accessed by node1: " + node1.next.data);

        // Print the data of firstNode, node1, and node2
        System.out.println("New first node: " + firstNode.data);
        System.out.println("Node 1 data: " + node1.data);
        System.out.println("Node 2 data: " + node2.data);

        // Print the data of head and tail
        // System.out.println("Head data: " + head.data);
        // System.out.println("Tail data: " + tail.data);
    }
}
