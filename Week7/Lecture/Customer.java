package Week7.Lecture;

public class Customer implements Comparable<Customer> {
    private Integer id;
    private String name;
    
    public Customer (Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getID() {
        return id;
    }

    public void
        setID(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Customer c) {
        return this.getName().compareTo(c.getName());
    }

    @Override
    public String toString() {
        return "Customer [ id=" + id + ", name=" + name + " ]" ;
    }
}
