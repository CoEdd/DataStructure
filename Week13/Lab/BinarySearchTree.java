package Week13.Lab;

// Define the Node class
import java.util.Stack;

class Node<E> {
    E data;
    Node<E> left, right;

    public Node(E item) {
        data = item;
        left = right = null;
    }
}

// Define the BinarySearchTree class
public class BinarySearchTree<E extends Comparable<E>> {
    private Node<E> root;

    public BinarySearchTree() {
        root = null;
    }

    // Method to add a new item to the BST
    public boolean add(Node<E> node, E item) {
        if (root == null) {
            root = new Node<>(item);
            return true;
        }
        return addRecursive(root, item);
    }

    private boolean addRecursive(Node<E> current, E item) {
        if (item.compareTo(current.data) == 0) {
            return false; // Duplicate item
        } else if (item.compareTo(current.data) < 0) {
            if (current.left == null) {
                current.left = new Node<>(item);
                return true;
            } else {
                return addRecursive(current.left, item);
            }
        } else {
            if (current.right == null) {
                current.right = new Node<>(item);
                return true;
            } else {
                return addRecursive(current.right, item);
            }
        }
    }

    // Method to print the tree items in order iteratively
    public void printTreeInOrder() {
        if (root == null) {
            return;
        }
        Stack<Node<E>> stack = new Stack<>();
        Node<E> current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }
    }

    // Method to check if the tree contains a specified item
    public boolean contains(E item) {
        return containsRecursive(root, item);
    }

    private boolean containsRecursive(Node<E> current, E item) {
        if (current == null) {
            return false;
        }
        if (item.compareTo(current.data) == 0) {
            return true;
        } else if (item.compareTo(current.data) < 0) {
            return containsRecursive(current.left, item);
        } else {
            return containsRecursive(current.right, item);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(bst.root, 5);
        bst.add(bst.root, 3);
        bst.add(bst.root, 7);
        bst.add(bst.root, 2);
        bst.add(bst.root, 4);
        bst.add(bst.root, 6);
        bst.add(bst.root, 8);

        System.out.println("Tree in order:");
        bst.printTreeInOrder();

        System.out.println("\nContains 4: " + bst.contains(4));
        System.out.println("Contains 10: " + bst.contains(10));
    }
}
