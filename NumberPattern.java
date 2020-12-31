public class NumberPattern {
    public static void main(String[] args) {
        int n=5;//Integer.parseInt(args[0]);
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(i+1+" ");

            }
            for (int k = n-i; k >1 ; k--) {
                System.out.print("* ");
            }
            System.out.println();

        }

        char[] l={'A','B','C','D','E'};
        for (int i = 0; i <l.length ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(l[i]+" ");

            }
            System.out.println();

    }
        int a[]= {1,2,3,4,45};
        System.out.println(isSorted(a,a.length));
        System.out.println(sumTo(3));
    }
public static boolean isSorted(int[] a,int u){
        if(u==1) return true;
        else if(a[u-1]<a[u-2]) return false;
        return isSorted(a,u-1);
}
public static double sumTo(int n){
        if(n<=0) return 0.0;
        if(n == 1) return 1;
        else return sumTo(n-1)+1.0/n;

}

}
