package lab;


public class CustomerCheckoutQueue<E> {

    private java.util.LinkedList<E> list = new java.util.LinkedList<>();
    private int maxNum;

    CustomerCheckoutQueue(int maxNum){
        this.maxNum = maxNum;
    }

    public int getSize(){
        return list.size();
    }

    public void joinCheckoutLine(E customerName){
        list.addLast(customerName);
        System.out.println(customerName + " get in queue...");
        System.out.println(list.toString());
        System.out.println();
    }

    public void processCheckout(){
        System.out.println(list.getFirst() + " finish the checkout process");
        list.removeFirst();
        System.out.println(list.toString());
        System.out.println();
    }

    public E viewNextCustomer(){
        return list.get(0);
    }

    public boolean isQueueEmpty(){
        return list.isEmpty();
    }

    public boolean isQueueFull(){
        if(list.size() == maxNum){
            return true;
        }if (list.size() < maxNum) {
            return false;
        } else {
            return false;
        }
        
    }
  
}
