
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your name");
        // String input = sc.next(); //word ko capture krne ke liye next() use krte or store krke print , spaces ke baad ka naam store krna he to nextline used for full name 
       // System.out.println("Your name is " + input);

        
        //String name = sc.nextLine();
        //System.out.println("Your name is " + name);
  
         int rn = sc.nextInt();
        System.out.println("Your RollNo is " + rn);

        float marks = sc.nextFloat();
        System.out.println("Your marks is " + marks);

        double no = sc.nextDouble();
        System.out.println("Your no is " + no);

        boolean isPass = sc.nextBoolean();
        System.out.println("Is student pass? " + isPass);
 
        Short s = sc.nextShort();
        System.out.println("Short value is " + s);  

        long l = sc.nextLong();
        System.out.println("Long value is " + l);
         
}
}
