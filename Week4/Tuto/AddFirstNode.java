package Week4.Tuto;

public class AddFirstNode<E>{
    
    E element;
    AddFirstNode<E> next;
    static AddFirstNode<String> head = null;
    static AddFirstNode<String> tail = null;

    public AddFirstNode(E o){
        this.element = o;
    }

    public void addFirst(String e) {

        AddFirstNode<String> newNode = new AddFirstNode<>(e);
        newNode.next = head;

        //create pointer to current head
        head = newNode;

        if (tail == null){
            tail = head;
        }
    }

    public static void main(String[] args) {

        head = new AddFirstNode<>("ayam");
        tail = head;

        tail.next = new AddFirstNode<>("goreng");
        tail = tail.next;
        
        tail.next = new AddFirstNode<>("kunyit");
        tail = tail.next;

        head.addFirst("ini adalah");

        AddFirstNode<String> current = head;
        while(current != null){
            System.out.println(current.element);
            current = current.next;
        }

    }  
}