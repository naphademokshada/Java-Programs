import java.util.*;
public class Product {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers to multiply:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int product = a * b;
    System.out.println("The product of a and b is " + product);
  }   
}
