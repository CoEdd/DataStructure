package PastYear2019;

public class SalesList {
    
    String region;
    String salesman;
    int salesamount;
    
    public SalesList(String region, String salesman, int salesamount){
        this.region = region;
        this.salesman = salesman;
        this.salesamount = salesamount;
    }
    
    // Getters
    public String getRegion() {
        return region;
    }

    public String getSalesRepName() {
        return salesman;
    }

    public int getSalesAmount() {
        return salesamount;
    }
    
    @Override
    public String toString(){
        
        return region + "\t" + salesamount + "\t" + salesman;     
    }
}