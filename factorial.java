public class factorial {
    public static int calculatefactorial(int n){
        int factorial =1;
        for(int i=1;i<=n;i++){
            factorial = factorial*i;
        }
        return factorial;//factorial of n
    }
    public static void main(String[] args) {
        int n=5;
        int result = calculatefactorial(n);
        System.out.println(result);
    }
}
        