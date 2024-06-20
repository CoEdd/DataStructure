package Week11.Tutorial;

public class q1 {
    public static void main(String[] args) {
        
        int[] list = {3, 8, 12, 34, 54, 85, 61, 110};

        System.out.println("Index : " + linearSearch(list, 54));
    }

    private static int linearSearch(int[] list, int key) {

        for(int i = 0; i < list.length ; i++){
            if(key == list[i]){
                return i;
            }

        }
        return -1;
    }
}
