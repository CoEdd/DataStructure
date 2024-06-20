package Week2.Tuto;

public class container<T> {   
    private T t;

    public container(){
    }

    public void add(T t){
        this.t = t;
    }

    public T retrieve(){
        return t;
    }

    public static void main(String[] args) {
        container<Integer> obj1 = new container<>();
        container<String> obj2 = new container<>();

        obj1.add(50);
        obj2.add("Java");

        System.out.println(obj1.retrieve());
        System.out.println(obj2.retrieve());
    }
}
