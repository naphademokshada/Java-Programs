import java.util.*;
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to add:");
        int a = sc.nextInt();
        //System.out.println("Enter Second Number " + b);
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of a and b is " + sum);
    }
}
