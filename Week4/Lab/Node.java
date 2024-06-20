package Week4.Lab;

// Node class representing each element in the linked list
public class Node<E> {
    E element;
    Node<E> next;

    // Default constructor
    public Node() {
    }

    // Constructor with element
    public Node(E o) {
        element = o;
    }
}

// MyLinkedList class implementing a singly linked list
class MyLinkedList<E> {

    Node<E> head; // The first node in the list
    Node<E> tail; // The last node in the list
    public int size = 0; // The number of elements in the list

    // Default constructor
    public MyLinkedList() {
        head = null; // Initially, head is null indicating an empty list
        tail = null; // Initially, tail is null indicating an empty list
    }

    // Add element at the beginning of the list
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node with the element
        if (head == null) { // If the list is empty
            head = newNode; // Both head and tail will point to the new node
            tail = head;
        } else { // If the list is not empty
            newNode.next = head; // The new node's next will point to the current head
            head = newNode; // The new node becomes the new head
        }
        size++;
    }

    // Add element at the end of the list
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node with the element
        if (head == null) { // If the list is empty
            head = newNode; // Both head and tail will point to the new node
            tail = head;
        } else { // If the list is not empty
            tail.next = newNode; // The current tail's next will point to the new node
            tail = tail.next; // The new node becomes the new tail
        }
        size++;
    }

    // Add element at a specific index
    public void addIndex(int index, E e) {
        if (index == 0) { // If index is 0, add at the beginning
            addFirst(e);
        } else {
            Node<E> newNode = new Node<>(e); // Create a new node with the element
            Node<E> current = head; // Start from the head
            for (int i = 0; i < index - 1; i++) { // Traverse to the node just before the specified index
                current = current.next;
            }
            newNode.next = current.next; // The new node's next points to the current node's next
            current.next = newNode; // The current node's next points to the new node
            size++;
        }
    }

    // Remove and return the first element
    public E removeFirst() {
        if (size == 0) { // If the list is empty
            return null;
        } else {
            Node<E> temp = head; // Store the current head in a temporary variable
            head = head.next; // Move head to the next node
            size--;
            if (head == null) { // If the list becomes empty
                tail = null; // Set tail to null
            }
            return temp.element; // Return the element of the removed node
        }
    }

    // Remove and return the last element
    public E removeLast() {
        if (size == 0) { // If the list is empty
            return null;
        } else if (size == 1) { // If there is only one node in the list
            Node<E> temp = head; // Store the current head in a temporary variable
            head = tail = null; // Set both head and tail to null
            size = 0;
            return temp.element; // Return the element of the removed node
        } else {
            Node<E> current = head; // Start from the head
            for (int i = 0; i < size - 2; i++) { // Traverse to the node just before the tail
                current = current.next;
            }
            Node<E> temp = tail; // Store the current tail in a temporary variable
            tail = current; // Set tail to the current node
            tail.next = null; // Set the next of the new tail to null
            size--;
            return temp.element; // Return the element of the removed node
        }
    }

    // Remove and return the element at a specific index
    public E remove(int index) {
        if (index < 0 || index >= size) { // If index is out of bounds
            return null;
        }
        if (index == 0) { // If index is 0, remove the first element
            return removeFirst();
        } else if (index == size - 1) { // If index is at the end of the list, remove the last element
            return removeLast();
        } else {
            Node<E> previous = head; // Start from the head
            for (int i = 0; i < index - 1; i++) { // Traverse to the node just before the specified index
                previous = previous.next;
            }
            Node<E> current = previous.next; // The node to be removed
            previous.next = current.next; // Set the next of the previous node to the next of the current node
            size--;
            return current.element; // Return the element of the removed node
        }
    }

    // Check if the list contains a specific element
    public boolean contains(E e) {
        Node<E> current = head; // Start from the head
        while (current != null) {
            if (current.element.equals(e)) { // If the element is found
                return true;
            }
            current = current.next; // Move to the next node
        }
        return false;
    }

    // Get the element at a specific index
    public E get(int index) {
        Node<E> current = head; // Start from the head
        for (int i = 0; i < index; i++) { // Traverse to the specified index
            current = current.next;
        }
        return current.element;
    }

    // Get the first element
    public E getFirst() {
        return head.element;
    }

    // Get the last element
    public E getLast() {
        return tail.element;
    }

    // Get the index of the first occurrence of a specific element
    public int indexOf(E e) {
        Node<E> current = head; // Start from the head
        int index = 0;
        while (current != null) {
            if (current.element.equals(e)) { // If the element is found
                return index;
            }
            current = current.next; // Move to the next node
            index++;
        }
        return -1;
    }

    // Get the index of the last occurrence of a specific element
    public int lastIndexOf(E e) {
        Node<E> current = head; // Start from the head
        int index = -1;
        int lastIndex = -1;
        while (current != null) {
            index++;
            if (current.element.equals(e)) { // If the element is found
                lastIndex = index;
            }
            current = current.next; // Move to the next node
        }
        return lastIndex;
    }

    // Replace the element at a specific index and return the old element
    public E set(int index, E e) {
        Node<E> current = head; // Start from the head
        for (int i = 0; i < index; i++) { // Traverse to the specified index
            current = current.next;
        }
        E oldElement = current.element; // Store the old element
        current.element = e; // Replace with the new element
        return oldElement;
    }

    // Clear the list
    public void clear() {
        head = null; // Set head to null
        tail = null; // Set tail to null
        size = 0; // Reset size
    }

    // Reverse the list
    public void reverse() {
        Node<E> current = head; // Start from the head
        Node<E> previous = null;
        while (current != null) {
            Node<E> next = current.next; // Store the next node
            current.next = previous; // Reverse the current node's pointer
            previous = current; // Move previous to the current node
            current = next; // Move to the next node
        }
        Node<E> temp = head; // Swap head and tail
        head = tail;
        tail = temp;
    }

    // Print all elements in the list
    public void print() {
        Node<E> current = head; // Start from the head
        while (current != null) {
            System.out.println(current.element); // Print the current element
            current = current.next; // Move to the next node
        }
    }
}

// Test class to demonstrate the functionality of MyLinkedList
class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();

        // Adding elements to the list
        list.addLast('a');
        list.addLast('b');
        list.addLast('c');
        list.addLast('d');
        list.addLast('e');

        // Print the original list
        System.out.println("Original list:");
        list.print();

        // Reverse and print the list
        System.out.println("Reversed list:");
        list.reverse();
        list.print();

        // Get the number of elements in the list
        System.out.println("Number of elements: " + (list.indexOf('e') + 1));

        // Get the first and last elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Remove and print the third element
        list.remove(2);
        System.out.println("After removing third element:");
        list.print();

        // Get the index of the second and third elements
        System.out.println("Index of second element: " + list.indexOf('b'));
        System.out.println("Index of third element: " + list.indexOf('d'));

        // Check if the list contains 'c'
        System.out.println("Contains 'c': " + list.contains('c'));

        // Replace and print elements
        list.set(0, 'j');
        list.set(1, 'a');
        list.set(2, 'v');
        list.set(3, 'a');
        System.out.println("After replacing elements:");
        list.print();
    }
}
