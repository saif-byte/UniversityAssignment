import java.util.Scanner;

public class GCD {
    public static int gcd(int p,int q){
        if(q==0) return p;
        else {
            p=p%q;
            int gcd=0;
            for (int i = 2; i <=p ; i++) {
                if ((p%i==0)&&(q%i==0)) {
                gcd=i;
            }
        }
        return gcd;
    }}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int p=sc.nextInt();
        System.out.println("Please enter your second number");
        int q=sc.nextInt();
        System.out.println(gcd(p,q));
    }
}
