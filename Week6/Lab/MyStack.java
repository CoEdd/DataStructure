package Week6.Lab;

import java.util.ArrayList;

public class MyStack<E> {
    ArrayList<E> list = new ArrayList<>();

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize() - 1);
    }

    public E pop(){
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(E o){
        list.add(o);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String toString(){
        return "Stack = " + list.toString();
    }

    public boolean search(E o){
        return list.contains(o);
    }

}

class testStack{
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.search("5"));
        System.out.println(stack.toString());
    }
}
