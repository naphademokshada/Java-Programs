public class productofab{

    public static int multiply(int a,int b){
        int product=a*b;
        return product;

    }
    public static void main(String args[]){
        int a=3;
        int b=5;
        int result = multiply(a,b);
        System.out.println(result);
        result = multiply(10,20);
        System.out.println(result); 
    }
}