package Trash;

abstract class sampah<ID> {
    protected String name;
    protected int taxNo;
    protected ID id;

    // Constructor 1
    public sampah() {
        System.out.println("Constructor 1 is running...");
        this.name = "John Doe";
        this.taxNo = 9999;
        this.id = null;
    }

    // Constructor 2
    public sampah(String name) {
        System.out.println("Constructor 2 is running...");
        this.name = name;
        this.taxNo = 9999;
        this.id = null;
    }

    // Constructor 3
    public sampah(String name, int taxNo) {
        System.out.println("Constructor 3 is running...");
        this.name = name;
        this.taxNo = taxNo;
        this.id = null;
    }

    // Constructor 4
    public sampah(String name, int taxNo, ID id) {
        System.out.println("Constructor 4 is running...");
        this.name = name;
        this.taxNo = taxNo;
        this.id = id;
    }

    public void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Tax Number: " + taxNo);
        System.out.println("Employee ID: " + id);
    }
}

// EmployeeTesla class
class EmployeeTesla<ID> extends sampah<ID> {
    // Constructor 1
    public EmployeeTesla() {
        System.out.println("EmployeeTesla Constructor 1 is running...");
    }

    // Constructor 2
    public EmployeeTesla(String name) {
        super(name);
        System.out.println("EmployeeTesla Constructor 2 is running...");
    }

    // Constructor 3
    public EmployeeTesla(String name, int taxNo) {
        super(name, taxNo);
        System.out.println("EmployeeTesla Constructor 3 is running...");
    }

    // Constructor 4
    public EmployeeTesla(String name, int taxNo, ID id) {
        super(name, taxNo, id);
        System.out.println("EmployeeTesla Constructor 4 is running...");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // Creating instances of EmployeeTesla with various types of IDs
        EmployeeTesla<Void> newGuy = new EmployeeTesla<>();
        EmployeeTesla<Void> alisa = new EmployeeTesla<>("Alisa");
        EmployeeTesla<Void> adam = new EmployeeTesla<>("Adam", 6541);
        EmployeeTesla<Integer> ali = new EmployeeTesla<>("Ali", 3941, 12345);

        // Executing the introduce() method for each instance
        System.out.println("New Guy:");
        newGuy.introduce();
        System.out.println();

        System.out.println("Alisa:");
        alisa.introduce();
        System.out.println();

        System.out.println("Adam:");
        adam.introduce();
        System.out.println();

        System.out.println("Ali:");
        ali.introduce();
    }
}
