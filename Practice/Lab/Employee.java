package Practice.Lab;

public abstract class Employee<ID> {
    String name;
    int taxNo;
    ID id;

    public Employee() {
        System.out.println("Constructor 1 is running...");
        this.name = "John Doe";
        this.taxNo = 9999;
        this.id = 1111;
    }

    public Employee(String name) {
        System.out.println("Constructor 2 is running...");
        this.name = name;
        this.taxNo = 9999;
        this.id = 1111;
    }

    public Employee(String name, int taxNo) {
        System.out.println("Constructor 3 is running...");
        this.name = name;
        this.taxNo = taxNo;
        this.id = (ID)1111;
    }

    
    public Employee(String name, int taxNo, ID id) {
        System.out.println("Constructor 4 is running...");
        this.name = name;
        this.taxNo = taxNo;
        this.id = id;
    }

    public void introduce() {
        System.out.println("My name is " + name + ", my tax no is " + taxNo + ", and my employee ID is " + id + ".");

    }

}

class EmployeeTesla<ID> extends Employee<ID>{

    public EmployeeTesla(){
        super();
        System.out.println("Employee Tesla starts working...");
    }
    
    public EmployeeTesla(String name){
        super(name);
        System.out.println("Employee Tesla starts working...");
    }

    public EmployeeTesla(String name, int taxNo){
        super(name, taxNo);
        System.out.println("Employee Tesla starts working...");
    }

    public EmployeeTesla(String name, int taxNo, ID id){
        super(name, taxNo, id);
        System.out.println("Employee Tesla starts working...");
    }


}

class main{
    public static void main(String[] args) {
        
        EmployeeTesla<ID> newGuy = new EmployeeTesla<>();   
        newGuy.introduce();
        System.out.println("-- I am an Employee object --");
        System.out.println();

        EmployeeTesla<ID> alisa = new EmployeeTesla<>("Alisa");
        alisa.introduce();
        System.out.println("-- I am an Employee object --");
        System.out.println();

        EmployeeTesla<ID> adam = new EmployeeTesla<>("Adam", 6541);
        adam.introduce();
        System.out.println("-- I am an Employee object --");
        System.out.println();

        EmployeeTesla<ID> ali = new EmployeeTesla<>("Ali", 3941, 12345);
        ali.introduce();
        System.out.println("-- I am an Employee object --");
        System.out.println();
    }

}


