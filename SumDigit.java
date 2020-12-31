public class SumDigit {
    public static String sum(int n){
        if (n<100){
            return (n%10)+(n/10)+"";
        }
        int k= (n%10) + (n/10)%10;
        return  sum((n/10)/10)+k+"";
    }

    public static void main(String[] args) {
        System.out.println(sum(213403));
    }
}
