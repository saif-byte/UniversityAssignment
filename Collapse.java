import java.util.Arrays;

public class Collapse {
    public static int[] collapse(int[] a){
     int[] collapsedlist = new int[a.length/2];
        for (int i = 0; i <a.length ; i=i+2) {
            if((i+1)>=a.length) break;
            collapsedlist[i/2]=a[i]+a[i+1];
        }
        return collapsedlist;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8};
        int [] collapsed = collapse(a);
        System.out.println(Arrays.toString(collapsed));
    }
}
