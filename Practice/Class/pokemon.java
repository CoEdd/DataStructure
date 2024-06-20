package Practice.Class;

public class pokemon {

    String name;
    int level;
    static String nama = "haikal";
    private String yearname = "ygyu";

    pokemon(){
        level =  1;
        // this.attack();
        System.out.println(pokemon.nama);
    }

    pokemon(String name, int level){
        this.name = name;
        this.level = level;
    }

    void attack(){
        System.out.println(name + " attack");
    }

    public String getyearname(){
        return yearname;
    }

    public void setyearname(String yearname){
        this.yearname = yearname;
    }
    
}

class mainn{
    public static void main(String[] args) {
        
        pokemon p1 = new pokemon("ayam", 48);

        // p1.name = "pikachu";
        // p1.level = 10;

        System.out.println(p1.name + " " + p1.level);
        p1.attack();

        pokemon p2 = new pokemon();
        p2.name = "charizrad";
        // p2.level = 21 ;

        System.out.println(p2.name + " " + p2.level);

        p2.attack();

        System.out.println(pokemon.nama);

        p1.setyearname("wagyu lahhh");
        System.out.println(p1.getyearname());

    }
}
