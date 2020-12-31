public class BunnyEars {
    public static int ears(int n){
        if(n==1) return 2;
        else if(n%2==0) return ears(n-1)+3;
        else return ears(n-1)+2;
    }

    public static void main(String[] args) {
        System.out.println(ears(4));
    }
}
