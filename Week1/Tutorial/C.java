package Week1.Tutorial;

public class C {
    public static void main(String[] args) {
        Object[] o = {new A(), new B()};
        System.out.print(o[0]); // Calls toString method of class A
        System.out.print(o[1]); // Calls toString method of class B
    }
}

class A extends B {
    public String toString() {
        return "A"; // Overrides toString method to return "A"
    }
}
class B {
    public String toString() {
        return "B"; // Overrides toString method to return "B"
    }
}


