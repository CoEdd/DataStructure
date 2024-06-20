package Week2.Lab;

public class minmax {
    
    public static <T extends Comparable<T>> String minmax(T[] list){

        T min = list[0];
        T max = list[0];

        for( int i = 0; i < list.length; i++){
            if(list[i].compareTo(min) < 0){
                min = list[i];
            }
        }

        for( int j = 0; j < list.length; j++){
            if(list[j].compareTo(max) > 0){
                max = list[j];
            }
        }

        return "min = " + min + "\nmax = " + max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};

        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
}
