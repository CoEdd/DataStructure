package Week1.Tutorial;

public class test {
    public int areaCode;
    public int number;
    public static int numberOfTelephoneObject = 0;

    public test(int areaCode, int number){
        this.areaCode = areaCode;
        this.number = number;
    }

    public void setareaCode(int areaCode){
        this.areaCode = areaCode;
    }

    public int getareaCode(){
        return areaCode;
    }

    public void setnumber(int number){
        this.number = number;
    }

    public int getnumber(){
        return number;
    }

    public String makeFullNumber(){
        return String.format("%02d-%08d", areaCode, number);
    }

    public static void main(String[] args) {
        
    }

}
