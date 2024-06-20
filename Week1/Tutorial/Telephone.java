package Week1.Tutorial;

public class Telephone {

    private String areaCode;
    private int number;
    private int numberOfTelephoneObject = 0;

    public Telephone(){

    }

    public Telephone(String areaCode, int number){
        this.areaCode = areaCode;
        this.number = number;
    }

    public void setareaCode(String areaCode){
        this.areaCode = areaCode;
    }

    public String getareaCode(){
        return areaCode;
    }

    public void setnumber(int number){
        this.number = number;
    }

    public int getnumber(){
        return number;
    }

    public String makeFullNumber(){
        return areaCode + "-" + number;
    }

    public static void main(String[] args) {
        Telephone[] obj = new Telephone[5];

        for(int i = 0; i < 5; i++){
            obj[i] = new Telephone("03", 7967630 + i);
        }

        for(int i = 0; i < 5; i++){
            System.out.println(obj[i].makeFullNumber());
        }
    }



}
