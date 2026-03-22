import java.util.*;
public class functionsum{

   public static void printHelloWorld(){
         System.out.println("Hello World");
         System.out.println("Hello World");
         System.out.println("Hello World");
         System.out.println("Hello World");
   }

   public static void calculatesum(){
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum=a+b;
    System.out.println(sum);
   }
    public static void main(String[] args) {
        
        calculatesum();
    } 
    }


    /*
   public static int calculatesum( int a, int b){ //parameters or formal parameters
    int sum=a+b;
    return sum;
   // System.out.println(sum);
   }
    public static void main(String[] args) { 
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = calculatesum(a, b); //arguments or actual parameters
     System.out.println(sum);
    }  */