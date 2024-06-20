package Week2.Lab;

public class MyGeneric<E> {
    private E e;

    // No-arg constructor
    public MyGeneric() {
    }

    // Constructor that accepts one generic parameter
    public MyGeneric(E e) {
        this.e = e;
    }

    // Getter method for the generic type
    public E getE() {
        return e;
    }

    // Setter method for the generic type
    public void setE(E e) {
        this.e = e;
    }
}

class TestProgram {

    public static void main(String[] args) {
        
        MyGeneric<String> strObj = new MyGeneric<>();
        strObj.setE("Hello, World!");
        System.out.println("String value: " + strObj.getE());

        
        MyGeneric<Integer> intObj = new MyGeneric<>();
        intObj.setE(42);
        System.out.println("Integer value: " + intObj.getE());
    }
}