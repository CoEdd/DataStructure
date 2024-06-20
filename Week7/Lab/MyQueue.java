package Week7.Lab;

import java.util.LinkedList;

public class MyQueue<E> {
    LinkedList<E> list = new LinkedList<>();


    public MyQueue(E[] e){
        for (E item : e) {
            enqueue(item);
        }
    }

    public MyQueue(){
    }

    public void enqueue(E e){
        list.addLast(e);
    }

    public E dequeue(){
        return list.removeFirst();
    }

    public E getElement(int i){
        return list.get(i - 1);
    }

    public E peek(){
        return list.getFirst();
    }

    public int getSize(){
        return list.size();

    }

    public boolean contains(E e){
        return list.contains(e);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String toString(){
        return "Queue : " + list.toString();
    }

}

class testQueue{
    public static void main(String[] args) {
        
        MyQueue<Integer> fruitQ = new MyQueue<>(new Integer[] {3, 2});

        fruitQ.enqueue(4);
        fruitQ.enqueue(5);
        fruitQ.enqueue(6);
        fruitQ.enqueue(7);

        System.out.println(fruitQ.peek());
        System.out.println(fruitQ.getSize());
        fruitQ.dequeue();
        System.out.println(fruitQ.getElement(2));
        System.out.println(fruitQ.contains(8));
        System.out.println(fruitQ.contains(4));
        System.out.println(fruitQ.toString());



    }
}

