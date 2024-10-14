  public class Shirt extends Clothes{
  private String Sizes;

  public Shirt() {
    super();
    this.Sizes = "default";
  }
  public Shirt(String name, double price, String Sizes){
super(name, price);
this. Sizes = Sizes;
  }
public String getSizes() {
return Sizes;
}
public void setSize(String sizeUpdate) {
this.Sizes= Sizes;
}
public String toString() {
String text = "Product: Shirt\n";
text= text + super.toString();
text+= " , Size: " + Sizes;
return text;
}
}