package Week2.Tuto;

public class MyArray {
    
    public static void main(String[] args) {
        
        Integer[] intd = {1,2,3,4,5};
        String[] strd = {"Jane", "Tom", "Bob"};
        Character[] chard = {'a', 'b', 'c'};

        listAll(intd);
        listAll(strd);
        listAll(chard);
        
    }

    static <T> void listAll(T[] array){
        for( T n : array){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
