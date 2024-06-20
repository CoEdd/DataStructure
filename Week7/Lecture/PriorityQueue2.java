package Week7.Lecture;
import java.util.*;

public class PriorityQueue2 {
    public static void main(String[] args) {
        PriorityQueue<Customer> customerQueue = new PriorityQueue<>();
        customerQueue. add (new Customer (2, "Chong" ));
        customerQueue. add (new Customer (1, "Ali" ));
        customerQueue. add (new Customer (3, "Donald" ));
        customerQueue. add (new Customer (4, "Bala" ));
        Customer c = customerQueue.peek();

        if (c!=null) {
            System.out.println(c.getName() + " is in queue");

            while ((c = customerQueue.poll())!=null){
                System.out.println(c);
            }
            
        }

        System.out.println();
    }
}