package Week4.Tuto;

public class RemoveLastNode<E> {
    E element;
    RemoveLastNode<E> next;
    static RemoveLastNode<String> head = null;
    static RemoveLastNode<String> tail = null;
    static int size = 0;

    public RemoveLastNode(E o){
        this.element = o;
    }

    public void addLast(String e) {

        if(tail == null ) { //no node exist
            head = tail = new RemoveLastNode<>(e);

        }else{
            tail.next = new RemoveLastNode<>(e); //tail.next point to new Node
            tail = tail.next; //new tail updated from tail.next
        }

        size++;

    }

    @SuppressWarnings("unchecked")
    public E removeLast() {
    if (size == 0){
        return null; // If the list is empty, return null
        
    }else if (size == 1) { // If there is only one node in the list
        RemoveLastNode<E> temp = (RemoveLastNode<E>) head; // Copy head to temp node before deletion
        head = tail = null; // Reset head and tail to null
        size = 0; // Reset the size to 0
        return temp.element; // Return the element of the removed node

    } else { // If there are more than one node in the list
        RemoveLastNode<E> current = (RemoveLastNode<E>) head;
        for (int i = 0; i < size - 2; i++) 
            current = current.next; // Traverse to the node just before tail
            RemoveLastNode<E> temp = (RemoveLastNode<E>) tail; // Copy tail to temp node before deletion
        tail = (RemoveLastNode<String>) current; // Make current node the new tail
        tail.next = null; // Reset the next reference for tail to null
        size--; // Reduce the size of the list
        return temp.element; // Return the element of the removed node
    }
}

    
    public static void main(String[] args) {

        RemoveLastNode<String> list;
        head = list = new RemoveLastNode<>("hi");
        tail = head;
        size++;
        list.addLast("boy");
        list.addLast("and");
        list.addLast("Heron");

        list.removeLast();

        RemoveLastNode<String> current = head;
        while (current != null) {
            System.out.println(current.element);
            current = current.next; 
        }
    }
}
