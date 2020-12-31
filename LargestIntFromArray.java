import java.util.Arrays;

public class LargestIntFromArray {
    public static String largest(int[] a){
        String s="";
        Arrays.sort(a);
        for(int x=a.length-1; x>=0;x--){
            s+=(a[x]+"");
        }
        return s;
    }

    public static void main(String[] args) {
        int[]a={1,7,3,9,5};
        System.out.println(largest(a));
    }

}
