import java.util.Arrays;

public class ConcatArrays {

    public static int[] concat(int[] a ,int[] b){
        int[] newarr=new int[a.length+b.length];
        for (int i = 0; i <a.length ; i++) {
            newarr[i]=a[i];
        }
        for (int i = 0; i <b.length ; i++) {
            newarr[i+a.length]=b[i];
        }
        return newarr;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={6,7,8,9};
        System.out.println(Arrays.toString(concat(a,b)));
    }
}
