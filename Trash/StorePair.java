package Trash;

public class StorePair<T> {

    private T first, second;

    public StorePair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StorePair<?> other = (StorePair<?>) obj;
        return this.first.equals(other.first);
    }


    public String toString() {
        return "first = " + first + " second = " + second;
    }

    public static void main(String[] args) {
        StorePair<?> pair1 = new StorePair<>("efs", 4);
        StorePair<Integer> pair2 = new StorePair<>(5, 20);
        
        System.out.println("pair1: " + pair1);
        System.out.println("pair2: " + pair2);

        System.out.println("Are pair1 and pair2 equal? " + pair1.equals(pair2));
    }

}
