package Week4.Tuto;

public class AddLastNode<E>{
    E element;
    AddLastNode<E> next;
    static AddLastNode<String> head = null;
    static AddLastNode<String> tail = null;

    public AddLastNode(E o){
        this.element = o;
    }

    public void addLast(String e) {

        if(tail == null ) { //no node exist
            head = tail = new AddLastNode<>(e);

        }else{
            tail.next = new AddLastNode<>(e); //tail.next point to new Node
            tail = tail.next; //new tail updated from tail.next
        }

    }

    public static void main(String[] args) {
        
        head = new AddLastNode<>("boy");
        tail = head;

        tail.next = new AddLastNode<>("and");
        tail = tail.next;

        tail.next = new AddLastNode<>("Heron");
        tail = tail.next;

        tail.addLast("Ismail");

        AddLastNode<String> current = head;
        while (current != null) {
            System.out.println(current.element);
            current = current.next; 
        }
    }

}