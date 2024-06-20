package Week2.Tuto;

public class Duo<A, B> {

    private A first;
    private B second;

    public Duo(){
    }

    public Duo(A first, B second){
        this.first = first;
        this.second = second;
    }

    public String print(){
        return first + " " + second;
    }

    public static void main(String[] args) {
        Duo<String, Integer> sideObject = new Duo<>("Efwf",3);
        Duo<Double, Double> points = new Duo<>(651.2562,3.4);

        System.out.println(sideObject.print());
        System.out.println(points.print());
    }
}
