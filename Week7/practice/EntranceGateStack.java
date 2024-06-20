package Week7.practice;

public class EntranceGateStack<E> {
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();

    public int getSize(){
        return list.size();
    }

    public void assignGATE(E gateNumber){
        list.add(gateNumber);
    }

    public E releaseGate(){
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public E checkTopGate(){
        if(list.size() > 0){
            return list.get(list.size() - 1);
        }else{
            return null;
        }
        
    }


    public boolean isStackEmpty(){
        return list.isEmpty();
    }
    
    // public boolean isStackFull(){
    //     return list.
    // }
}


