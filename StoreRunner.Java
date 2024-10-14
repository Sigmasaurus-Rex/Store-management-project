import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

 Pants testClothes = new Pants("Pants", 22.99, 24 );
 
      System.out.println(testClothes.toString());

  Shirt testShirt= new Shirt("Shirt", 15.99, "M");

    System.out.println(testShirt.toString());
  }
}