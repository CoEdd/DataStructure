package Week4.Tuto;

public class NodeTest<E> {
    E element;
    NodeTest<E> next;
    static int size = 0;
    static NodeTest<String> head = null;
    static NodeTest<String> tail = null;

    public NodeTest(E o){
        element = o;
    }


    public static void main(String[] args) {
        // Step 1: Create the first node and insert it to the list:
        head = new NodeTest<>("Chicago"); 
        tail = head;

        // Step 2: Create the second node and insert it to the list:
        tail.next = new NodeTest<>("Denver"); 
        tail = tail.next;

        // Step 3: Create the third node and insert it to the list:
        tail.next = new NodeTest<>("Dallas");
        tail = tail.next;

        NodeTest<String> current = head;
        while(current != null) {
            System.out.println(current.element);
            current = current.next;
        }

    }

}







