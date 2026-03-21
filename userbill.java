import java.util.*;
public class userbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost of 1 st item:");
        int units1 = sc.nextInt();
        System.out.println("Enter the Cost of 2 nd item:");
        int units2 = sc.nextInt();
        System.out.println("Enter the Cost of 3 rd item:");
        int units3 = sc.nextInt();
        int units = units1 + units2 + units3;
            double tax = 0.18 * units;
            double billAmount = units +  tax;
        System.out.println("The total bill amount is: " + billAmount);
    }
}
