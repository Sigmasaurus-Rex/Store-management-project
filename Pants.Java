public class Pants extends Clothes{
  private int size;

  public Pants() {
    super();
    this.size = 0;
  }
  public Pants(String name, double price, int size){
super(name, price);
this. size = size;
  }
public int getSize() {
return size;
}
public void setSize(int sizeUpdate) {
size = sizeUpdate;
}
public String toString() {
String text = "Product: Pants\n";
text= text + super.toString();
text+= " , Size: " + size;
  return text;
}
  

}