import java.util.Arrays;

public class Quiz1 {
    public static int[] RotateLeft(int[] a){
    int t=a[0];
        for (int i = 1; i < a.length; i++) {

             a[i-1]=a[i];
        }

            a[a.length-1]=t;

        return a;
    }

    public static void main(String[] args) {
        int[] a={3, 8, 19, 7};
        System.out.println(Arrays.toString(RotateLeft(a)));
    }
}
