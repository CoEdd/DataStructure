package Week3.Lab;


/**
An interface that describes the operations of a bag of objects.
*/
interface BagInterface<T>
{
    /** Gets the current number of entries in this bag.
     @return the integer number of entries currently in the bag */
    public int getCurrentSize();

    /** Sees whether this bag is full.
     @return true if the bag is full, or false if not */
    public boolean isFull();

    /** Sees whether this bag is empty.
     @return true if the bag is empty, or false if not */
    public boolean isEmpty();

    /** Adds a new entry to this bag.
     @param newEntry the object to be added as a new entry
    @return true if the addition is successful, or false if not */
    public boolean add(T newEntry);
    
    /** Removes one unspecified entry from this bag, if possible.
     @return either the removed entry, if the removal was successful,
    or null */
    public T remove();

    /** Removes one occurrence of a given entry from this bag.
     @param anEntry the entry to be removed
    @return true if the removal was successful, or false if not */
    public boolean remove(T anEntry);

    /** Removes all entries from this bag. */
    public void clear();

    /** Counts the number of times a given entry appears in this bag.
     @param anEntry the entry to be counted
    @return the number of times anEntry appears in the bag */
    public int getFrequencyOf(T anEntry);

    /** Tests whether this bag contains a given entry.
     @param anEntry the entry to locate
    @return true if this bag contains anEntry, or false otherwise */
    public boolean contains(T anEntry);

    /** Retrieves all entries that are in this bag.
    @return a newly allocated array of all the entries in the bag */
    public T[] toArray();


} // end BagInterface

public class ArrayBag<T> implements BagInterface<T>{

    @Override
    public int getCurrentSize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCurrentSize'");
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public boolean add(Object newEntry) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public Object remove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean remove(Object anEntry) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public int getFrequencyOf(Object anEntry) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFrequencyOf'");
    }

    @Override
    public boolean contains(Object anEntry) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }
    
}
