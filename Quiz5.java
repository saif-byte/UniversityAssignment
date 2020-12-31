public class Quiz5 {
    public static boolean HighLow(int n){
        if(n<100) {
            if ((n % 10 >= 5 && (n / 10) % 10 < 5) || (n % 10 < 5 && (n / 10) % 10 >= 5)) {
                return true;
            }
            return false;
        }
        return HighLow(n/10);
            }

    public static void main(String[] args) {
        System.out.println(HighLow(45));
    }
}
