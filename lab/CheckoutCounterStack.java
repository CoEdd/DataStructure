package lab;

public class CheckoutCounterStack<E> {
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();
    private int maxNum;

    CheckoutCounterStack(int maxNum){
        this.maxNum = maxNum;
    }

    public int getSize(){
        return list.size();
    }

    public void openCheckoutCounter(E counterNumber){
        list.add(counterNumber);
        System.out.println("counter " + counterNumber + " is open.");
        System.out.println(list.toString());

    }

    public void closeCheckoutCounter(){
        // E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        System.out.println(list.toString());
    }

    public E viewTopCheckoutCounter(){
        if(list.size() > 0){
            return list.get(list.size() - 1);
        }else{
            return null;
        }
    }

    public boolean isStackEmpty(){
        return list.isEmpty();
    }

    public boolean isStackFull(){
        if(list.size() == maxNum){
            return true;
        }if (list.size() < maxNum) {
            return false;
        } else {
            return false;
        }
        
    }
}
