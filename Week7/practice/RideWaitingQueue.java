package Week7.practice;

public class RideWaitingQueue<E> {
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();

    public void joinWaitingLine(E e){
        list.addLast(e);
    }

    public E completeRide(){
        return list.removeFirst();
    }

    public int getSize(){
        return list.size();
    }

    public E viewNextTicketNumber(){
        return list.get(list.size() - 2 );
    }

    public boolean isQueueEmpty(){
        return list.isEmpty();
    }

    // public boolean isQueueFull(){
    //     return
    // }

    public String toString(){
        return "QUEUE : " + list.toString();
    }
    
}
