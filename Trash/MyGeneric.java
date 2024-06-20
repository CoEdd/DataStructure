package Trash;

public class MyGeneric<E> {
    private E e;

    public MyGeneric(){

    }

    public MyGeneric(E e){
        this.e = e;
    }

    // Setter method
    public void setE(E e) {
        this.e = e;
    }

    // Getter method
    public E getE() {
        return e;
    }

    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();

        // Setting values
        strObj.setE("Hello");
        intObj.setE(123);

        // Displaying values
        System.out.println("String value: " + strObj.getE());
        System.out.println("Integer value: " + intObj.getE());
    }

}
