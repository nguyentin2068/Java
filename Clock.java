import java.util.Scanner;

public class Clock {
    String id="", manufact="";
    int price=0, guarantee=0;
    Scanner sc = new Scanner(System.in);
    public Clock(){
        
    }
    public Clock(String id){
        this.id=id;
    }
    public Clock(String id, String manufact, int price, int guarantee){
        this.id=id;
        this.manufact=manufact;
        this.price = price;
        this.guarantee =guarantee;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getManufact(){
        return this.manufact;
    }
    public void setManufact(String manufact){
        this.manufact=manufact;
    }
    public int getPrice(){    
        return this.price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getGuarantee(){    
        return this.guarantee;
    }
    public void setGuarantee(int guarantee){
        this.guarantee=guarantee;
    }    
    @Override
    public String toString(){
        return id+", "+manufact+", "+price+", "+guarantee;
    }
    public void input(){
        String id = sc.next();
        String manufact = sc.next();
        int price = sc.nextInt();
        int guarantee = sc.nextInt();
        Clock(new Clock(id, manufact, price, guarantee));
    }
    @Override
    public boolean equals(Object obj){
        return this.id.equals(((Clock)obj).id);
    }
}    

