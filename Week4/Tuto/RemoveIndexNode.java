package Week4.Tuto;

public class RemoveIndexNode<E> {
    E element;
    RemoveIndexNode<E> next;
    static RemoveIndexNode<String> head = null;
    static RemoveIndexNode<String> tail = null;
    static int size = 0;

    public RemoveIndexNode(E o){
        this.element = o;
    }

    public void addLast(String e) {

        if(tail == null ) { //no node exist
            head = tail = new RemoveIndexNode<>(e);

        }else{
            tail.next = new RemoveIndexNode<>(e); //tail.next point to new Node
            tail = tail.next; //new tail updated from tail.next
        }

        size++;

    }

    public E removeFirst() {
        if (size == 0) 
            return null; // If there are no nodes, return null
        else {
            @SuppressWarnings("unchecked")
            RemoveIndexNode<E> temp = (RemoveIndexNode<E>) head; // Copy head to temp node before deletion
            head = head.next; // Set new head
            size--; // Reduce size
            if (head == null) {
                tail = null; // If head is null, set tail to null as well            
            }
            return temp.element; // Return the element of the removed node
        }
    }

    @SuppressWarnings("unchecked")
    public E removeLast() {
        if (size == 0){
            return null; // If the list is empty, return null
            
        }else if (size == 1) { // If there is only one node in the list
            RemoveIndexNode<E> temp = (RemoveIndexNode<E>) head; // Copy head to temp node before deletion
            head = tail = null; // Reset head and tail to null
            size = 0; // Reset the size to 0
            return temp.element; // Return the element of the removed node
    
        } else { // If there are more than one node in the list
            RemoveIndexNode<E> current = (RemoveIndexNode<E>) head;
            for (int i = 0; i < size - 1; i++) 
                current = current.next; // Traverse to the node just before tail
                RemoveIndexNode<E> temp = (RemoveIndexNode<E>) tail; // Copy tail to temp node before deletion
            tail = (RemoveIndexNode<String>) current; // Make current node the new tail
            tail.next = null; // Reset the next reference for tail to null
            size--; // Reduce the size of the list
            return temp.element; // Return the element of the removed node
            }
        }

        public E remove(int index) {
            // Check if index is out of bounds
            if (index < 0 || index >= size)
                return null; // Return null if index is invalid
            
            // If index is 0, call removeFirst() to remove the first element
            if (index == 0)
                return removeFirst();
            
            // If index is at the end of the list, call removeLast()
            if (index == size + 1)
                return removeLast();
            
            // Traverse the list to find the node before the one to be removed
            @SuppressWarnings("unchecked")
            RemoveIndexNode<E> previous = (RemoveIndexNode<E>) head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }
            
            // Get the node to be removed and adjust pointers
            RemoveIndexNode<E> current = previous.next;
            previous.next = current.next;
            
            // Decrement the size of the list
            size--;
            
            // Return the element of the removed node
            return current.element;
        }

    public static void main(String[] args) {

        RemoveIndexNode<String> list;
        head = list = new RemoveIndexNode<>("hi");
        size++;
        tail = head;
        list.addLast("boy");
        list.addLast("and");
        list.addLast("Heron");

        list.remove(3);


        RemoveIndexNode<String> current = head;
        while (current != null) {
            System.out.println(current.element);
            current = current.next; 
        }
    }
}
