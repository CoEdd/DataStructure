package Week5.Lab;

import Trash.Node;

// Node class representing each element in the doubly linked list
public class Node<E> {
    E element; // Element stored in the node
    Node<E> next; // Reference to the next node
    Node<E> prev; // Reference to the previous node

    // Constructor with element only
    public Node(E element) {
        this.element = element;
    }

    // Constructor with element, next node, and previous node
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Node(E element, Node next, Node prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}

// DoublyLinkedList class implementing a doubly linked list
class DoublyLinkedList<E> {

    private Node<E> head; // The first node in the list
    private Node<E> tail; // The last node in the list
    public int size = 0; // The number of elements in the list

    // Default constructor
    public DoublyLinkedList() {
        head = null; // Initially, head is null indicating an empty list
        tail = null; // Initially, tail is null indicating an empty list
        size = 0;
    }

    // Add element at the beginning of the list
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node with the element

        if (head == null) { // If the list is empty
            head = newNode; // Both head and tail will point to the new node
            tail = head;
        } else { // If the list is not empty
            newNode.next = head; // The new node's next will point to the current head
            head.prev = newNode; // The current head's prev will point to the new node
            head = newNode; // The new node becomes the new head
        }

        size++;
    }

    // Add element at the end of the list
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node with the element

        if (head == null) { // If the list is empty
            head = newNode; // Both head and tail will point to the new node
            tail = newNode;
        } else { // If the list is not empty
            tail.next = newNode; // The current tail's next will point to the new node
            newNode.prev = tail; // The new node's prev will point to the current tail
            tail = newNode; // The new node becomes the new tail
        }
        size++;
    }

    // Add element at a specific index
    public void add(int index, E e) {
        if (index < 0 || index > size) { // If index is out of bounds
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (index == 0) { // If index is 0, add at the beginning
            addFirst(e);
        } else if (index == size) { // If index is equal to size, add at the end
            addLast(e);
        } else {
            Node<E> newNode = new Node<>(e); // Create a new node with the element
            Node<E> current = head; // Start from the head

            for (int i = 0; i < index; i++) { // Traverse to the node just before the specified index
                current = current.next;
            }

            newNode.next = current; // The new node's next points to the current node
            newNode.prev = current.prev; // The new node's prev points to the current node's prev
            current.prev.next = newNode; // The previous node's next points to the new node
            current.prev = newNode; // The current node's prev points to the new node

            size++;
        }
    }

    // Remove and return the first element
    public E removeFirst() {
        if (size == 0) { // If the list is empty
            throw new IllegalStateException("List is empty");
        }
        Node<E> temp = head; // Store the current head in a temporary variable
        head = head.next; // Move head to the next node
        if (head != null) {
            head.prev = null; // Set the new head's prev to null
        } else {
            tail = null; // If the list becomes empty, set tail to null
        }
        size--;
        return temp.element; // Return the element of the removed node
    }

    // Remove and return the last element
    public E removeLast() {
        if (size == 0) { // If the list is empty
            throw new IllegalStateException("List is empty");
        }
        Node<E> temp = tail; // Store the current tail in a temporary variable
        tail = tail.prev; // Move tail to the previous node
        if (tail != null) {
            tail.next = null; // Set the new tail's next to null
        } else {
            head = null; // If the list becomes empty, set head to null
        }
        size--;
        return temp.element; // Return the element of the removed node
    }

    // Remove and return the element at a specific index
    public E remove(int index) {
        if (index < 0 || index >= size) { // If index is out of bounds
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<E> current = head; // Start from the head

        if (index == 0) { // If index is 0, remove the first element
            return removeFirst();
        } else if (index == size - 1) { // If index is at the end of the list, remove the last element
            return removeLast();
        } else {
            for (int i = 0; i < index; i++) { // Traverse to the specified index
                current = current.next;
            }
            current.prev.next = current.next; // The previous node's next points to the current node's next
            current.next.prev = current.prev; // The next node's prev points to the current node's prev
        }

        size--;
        return current.element; // Return the element of the removed node
    }

    // Clear the list
    public void clear() {
        head = null; // Set head to null
        tail = null; // Set tail to null
        size = 0; // Reset size
    }

    // Traverse and print elements from head to tail
    public void traverseForward() {
        Node<E> current = head; // Start from the head
        while (current != null) {
            System.out.println(current.element); // Print the current element
            current = current.next; // Move to the next node
        }
    }

    // Traverse and print elements from tail to head
    public void traverseBackward() {
        Node<E> current = tail; // Start from the tail
        while (current != null) {
            System.out.println(current.element); // Print the current element
            current = current.prev; // Move to the previous node
        }
    }

    // Print the size of the list
    public void printSize() {
        System.out.println("Size: " + size);
    }

    public void print(){
        Node<E> current = head;
        while(current != null){
            System.out.println(current.element);
            current = current.next;
        }
    }
}

// Test class to demonstrate the functionality of DoublyLinkedList
class TestDoubly {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        // 1) Add first node with value of 1
        list.addFirst(1);

        // 2) Add last node with value of 100
        list.addLast(100);

        // 3) Add node with value of 2 at position index of 2
        list.add(2, 2); // Note: In a list of size 2, index 2 means adding at the end

        // 4) Remove node at position index of 3 (there's no index 3; it's a mistake, removing at index 2)
        list.remove(2);

        // 5) Traverse Forward
        System.out.println("Traverse Forward:");
        list.traverseForward();

        // 6) Traverse Backward
        System.out.println("Traverse Backward:");
        list.traverseBackward();

        // 7) Print current size of linked list
        list.printSize();

        // 8) Clear all nodes in the linked list
        // list.clear();

        // 9) Print again current size of linked list
        list.printSize();

        list.print();
    }
}
