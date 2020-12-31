import java.lang.reflect.Array;
import java.util.Arrays;

public class stutter {
    public static int[] stutter (int[] a){
        int[] stuttered=new int[2*a.length];
        for (int i = 0; i < a.length; i++) {
            stuttered[2*i]=a[i];
            stuttered[2*i+1]=a[i];
        }
    return stuttered;
    }

    public static void main(String[] args) {
        int[] a={11,-4,0,777};
        int[] stuttered =stutter(a);
        System.out.println(Arrays.toString(stuttered));
    }
}
