package Week4.Tuto;

public class RemoveFirstNode<E> {
    E element;
    RemoveFirstNode<E> next;
    static RemoveFirstNode<String> head = null;
    static RemoveFirstNode<String> tail = null;
    static int size = 0;

    public RemoveFirstNode(E o){
        this.element = o;
    }

    public void addLast(String e) {

        if(tail == null ) { //no node exist
            head = tail = new RemoveFirstNode<>(e);

        }else{
            tail.next = new RemoveFirstNode<>(e); //tail.next point to new Node
            tail = tail.next; //new tail updated from tail.next
        }

        size++;

    }

    @SuppressWarnings("unchecked")
    public E removeFirst() {
        if (size == 0) 
            return null; // If there are no nodes, return null
        else {
            RemoveFirstNode<E> temp = (RemoveFirstNode<E>) head; // Copy head to temp node before deletion
            head = head.next; // Set new head
            size--; // Reduce size
            if (head == null) {
                tail = null; // If head is null, set tail to null as well            
            }
            return temp.element; // Return the element of the removed node
        }
    }

    public static void main(String[] args) {

        RemoveFirstNode<String> list;
        head = list = new RemoveFirstNode<>("This will be remove");
        tail = head;
        size++;
        list.addLast("boy");
        list.addLast("and");
        list.addLast("Heron");

        list.removeFirst();

        RemoveFirstNode<String> current = head;
        while (current != null) {
            System.out.println(current.element);
            current = current.next; 
        }
    }
}
