public class Fibonacci {
    public static int fibonacii(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        else return fibonacii(n-2)+fibonacii(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fibonacii(3));
    }
}
