public class Quiz4 {
    public static int SumDigits(int n){
        if(n<0) n=-1*n;
        int sum=0;
        for ( n=n ; n >0 ; n=n/10) {
            sum=sum+n%10;
        }
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(SumDigits(-456));
        System.out.println(SumDigits(29107));

    }
}
