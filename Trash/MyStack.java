package Trash;

class GenericStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
    int getSize() {
        return list.size();
    }

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public E peek(){
        return list.get(getSize() - 1);
    }

    public boolean isEmpty() { 
        return list.isEmpty(); 
    }

    public boolean search(E e) { 
        return list.contains(e); 
    }

    @Override
    public String toString(){
        return "Stack = " + list.toString();
    }
}


public class MyStack{
    public static void main(String[] args) {

        GenericStack<String> test = new GenericStack<>();

        test.push("efef");
        System.out.println(test.toString());
    }
}


