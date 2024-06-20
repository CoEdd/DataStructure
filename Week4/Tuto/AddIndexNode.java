package Week4.Tuto;

public class AddIndexNode<E>{
    E element;
    AddIndexNode<E> next;
    static AddIndexNode<String> head = null;
    static AddIndexNode<String> tail = null;
    static int size = 0;

    public AddIndexNode(E o){
        this.element = o;
    }


    public void addFirst(String e) {

        AddIndexNode<String> newNode = new AddIndexNode<>(e);
        newNode.next = head;

        //create pointer to current head
        head = newNode;

        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void addLast(String e) {

        if(tail == null ) { //no node exist
            head = tail = new AddIndexNode<>(e);

        }else{
            tail.next = new AddIndexNode<>(e); //tail.next point to new Node
            tail = tail.next; //new tail updated from tail.next
        }
        size++;

    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void addindex(int index, String e) {
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            AddIndexNode<String> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            AddIndexNode<String> temp = current.next;
            current.next = new AddIndexNode(e);
            current.next.next = temp;
        }
    }

    public static void main(String[] args) {
        
        AddIndexNode<String> list;
        head = list = new AddIndexNode<>("hi");
        tail = head;
        list.addLast("boy");
        list.addLast("and");
        list.addLast("Heron");

        head.addindex(6, "the");

        AddIndexNode<String> current = head;
        while (current != null) {
            System.out.println(current.element);
            current = current.next; 
        }
    }

}