import java.util.Arrays;

public class SameNumber {
    public static int same(int[] a){
        int k=0;

        for (int i = 0; i <a.length ; i++) {
            int count=0;
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]==a[j]){
                    count++;

                }
            }
            if(count==0)
                return a[i];
        }
        return k;
    }


    public static void main(String[] args) {
        int[] a ={1,2,3,4,1,3,4};
        System.out.println(same(a));
    }
}
