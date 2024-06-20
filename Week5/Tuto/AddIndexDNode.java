package Week5.Tuto;

public class AddIndexDNode<E> {
    E element;
    AddIndexDNode<E> next;
    AddIndexDNode<E> prev; // New pointer for the previous node
    static AddIndexDNode<String> head = null;
    static AddIndexDNode<String> tail = null;
    static int size = 0;

    public AddIndexDNode(E o) {
        this.element = o;
    }

    public void addFirst(String e) {
        AddIndexDNode<String> newNode = new AddIndexDNode<>(e);
        newNode.next = head;
        newNode.prev = null; // No previous node for the new head

        if (head != null) {
            head.prev = newNode; // Update the previous reference of the current head
        } else {
            tail = newNode; // If list is empty, update tail as well
        }

        head = newNode; // Update head to point to the new node
        size++;
    }

    public void addLast(String e) {
        AddIndexDNode<String> newNode = new AddIndexDNode<>(e);
        newNode.next = null; // No next node for the new tail
        newNode.prev = tail;

        if (tail != null) {
            tail.next = newNode; // Update the next reference of the current tail
        } else {
            head = newNode; // If list is empty, update head as well
        }

        tail = newNode; // Update tail to point to the new node
        size++;
    }

    // @SuppressWarnings({ })
    public void addIndex(int index, String e) {
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            AddIndexDNode<String> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            AddIndexDNode<String> newNode = new AddIndexDNode<>(e);
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public static void main(String[] args) {
        AddIndexDNode<String> list;
        head = list = new AddIndexDNode<>("hi");
        tail = head;
        list.addLast("boy");
        list.addLast("and");
        list.addLast("Heron");

        head.addIndex(2, "the"); // Insert "the" at index 2

        AddIndexDNode<String> current = head;
        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }
    }
}
