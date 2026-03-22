public class functionoverloading{
    public static int sum(int a, int b){
        return a+b;
    }
    //func to calculate sum of theree no

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,7));
    }
}