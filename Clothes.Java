public class Clothes{
private String name;
private double price;

  
  public Clothes(){
    this.name = "";
    this.price= 0.0; 
    
  }
    public Clothes(String name,double price){
    this.name = name;
    this.price= price; 
    
  }
  public String getName()    {
    return name;
  }
    public double getPrice()    {
    return price;
  }
  public void setName(String name) {
    this.name=name;
  }
  public void setPrice(double price) {
    this.price=price;
}
  public String toString(){
    String text="Name:" + name +", Price:" + price;
    return text;
  }
}