public class Quiz7 {
    private static int k=0;
   ;
    public static int odd(int n){
        if(n<10 && n%2==0){
            return k;
        }
        if(n<10 && n%2!=0){
             k++;
             return k;
        }
        if ((n%10)%2!=0){
            k++;
            return odd(n/10);
        }
        else return odd(n/10);
    }



    public static void main(String[] args) {
        System.out.println(odd(340));
    }
}
